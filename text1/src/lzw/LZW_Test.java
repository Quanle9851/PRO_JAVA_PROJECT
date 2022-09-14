/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lzw;

import java.util.ArrayList;

/**
 *
 * @author Nguyễn Đoàn Tú
 */
public class LZW_Test {
    public static void main(String[] args) {
        String src="AABAABBCCACC",initDictStr="ABC";
        LZW_Coder coder=new LZW_Coder(initDictStr);
        ArrayList<Integer> zippedData=coder.zip(src);
        System.out.println("Test 1 src:"+src);
        System.out.println("zipped data:\n"+zippedData);
        System.out.println("\n Number of codewords after zipping:"+zippedData.size());
        LZW_Decoder decoder=new LZW_Decoder(initDictStr);
        String unzippedStr=decoder.unzip(zippedData);
        System.out.println("after unzip"+unzippedStr+"\n\n");
        src="LZW starts out with a dictionary of 256 characters\n (int the case of 8 bits"
                + "it then reads data 8 bits at a time (e.g, 't', 'r',etc.)and encodes\n the data)"
                + "everytime it comes across a new subString (say, \"tr\")\n";
        System.out.println("test 2 src:"+src+"\nLength:"+src.length());
        coder=new LZW_Coder();
        zippedData=coder.zip(src);
        System.out.println("zipped data:\n"+zippedData);
        System.out.println("\nNumber of codewords after zipping:"+zippedData.size());
        decoder=new LZW_Decoder();
        unzippedStr=decoder.unzip(zippedData);
        System.out.println("After unzip:\n\n"+unzippedStr);
    }
}
