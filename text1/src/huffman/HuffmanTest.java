/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;
import java.io.File;
/**
 *
 * @author Bao
 */
public class HuffmanTest {
    public static void main (String[] args){
        String src = "don't let me alone to night";
        System.out.println("Test encoder on String:");
        System.out.println("________________________");
        HuffmanEncoder encoder = new HuffmanEncoder(src);
        System.out.println("Source str.:" + src);
        System.out.println("codeword table:" + encoder.getCodeTable());
        System.out.println("Encoded str.:" + encoder.getEncodedStr());
        HuffmanZipResult zResult = encoder.createZipResult("No name");
        System.out.println("\nInformation about zipped result:\n"+ zResult);
        System.out.println("Zipping rate:"+encoder.getCompressRate()*100+ "%");
        System.out.println("\nTest Decoder on String:");
        System.out.println("_________________________");
        HuffmanDecoder decoder = new HuffmanDecoder(zResult);
        decoder.decode();
        String decodedStr = decoder.getSrcString();
        System.out.println("Secode string:" + decodedStr);
        String srcFilename = "test1.doc";
        String zipFilename = "test1_ZIPPED.huf";
        String decodeFilename = "test1_HUF_unzip.doc";
        
        File f;
        f=new File(srcFilename);
        System.out.println("Test encoder on file:");
        System.out.println("____________________");
        System.out.println("Please wait to compress file.");
        encoder = new HuffmanEncoder(f);
        encoder.writeZipFile(srcFilename, zipFilename);
        System.out.println("write zip file:done.\n");
        System.out.println("Zipping rate:" + encoder.getCompressRate()*100+ "%");
        System.out.println("\nTest Decoder on file:");
        System.out.println("____________________________");
        f = new File(zipFilename);
        decoder = new HuffmanDecoder(f);
        System.out.println("Please waint to compress file.");
        decoder.decode();
        decoder.writeDecodedResult(decodeFilename);
        System.out.println("Decode: done.\n");
    }
}
