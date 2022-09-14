/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recur;

/**
 *
 * @author quan
 */
public class RecursionDemo2 {
    public static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int result =factorial(3);
        System.out.println(result);
    }
}
