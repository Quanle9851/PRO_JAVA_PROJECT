/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.huffman;
import java.util.Arrays;
import java.io.InputStream;

/**
 *
 * @author Bao
 */
public class FreqCounter {
    int numberOfSymbol=0;
    Sym_Freq freqObjs[];

    public FreqCounter() {
        freqObjs=new Sym_Freq[256];
    }
 
    public FreqCounter(InputStream source) {
        freqObjs = new Sym_Freq[256];
        if (buildFromSource(source)==false)
            throw new RuntimeException("Counting frequencies failed");
    }
    
    private void reset(){
        numberOfSymbol=0;
        for (int i=0; i<256; i++) freqObjs[i]=new Sym_Freq(i, 0);
    }
    
    public boolean buildFromSource(InputStream source){
        this.reset();
        source.mark(0);
        try {
            if (source==null || source.available() ==0){
                System.out.println("source is empty!");
                return false;
            }
            int symbol;
            while ((symbol=source.read())!=-1){
                freqObjs[symbol].freq++;
                numberOfSymbol++;
            }
            source.reset();
            return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    public void decreaseSort(){
        Arrays.sort(freqObjs);
    }
    public int getNumberOfSymbol() {
        return numberOfSymbol;
    }

    public void setNumberOfSymbol(int numberOfSymbol) {
        this.numberOfSymbol = numberOfSymbol;
    }

    public Sym_Freq[] getFreqObjs() {
        return freqObjs;
    }

    public void setFreqObjs(Sym_Freq[] freqObjs) {
        this.freqObjs = freqObjs;
    }

    @Override
    public String toString() {
       String result = "" + this.numberOfSymbol + "[";
       for (Sym_Freq x: this.freqObjs)
           if (x.freq>0) result += x + ",";
       return result + "]";
    }
    
    
}
