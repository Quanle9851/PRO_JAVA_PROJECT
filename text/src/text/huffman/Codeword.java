/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.huffman;

/**
 *
 * @author Bao
 */
public class Codeword {
    int symbol;
    String codeword;
    public Codeword(int symbol){
        this.symbol=symbol;
        this.codeword="";
    }
    public Codeword(int symbol,String codeword){
        this.symbol=symbol;
        this.codeword=codeword;
    }

    @Override
    public String toString() {
        return "Codeword{" + "symbol=" + symbol + ", codeword=" + codeword + '}';
    }
}
