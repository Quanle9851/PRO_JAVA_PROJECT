/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyServices;

import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Validation {
    //ham nay de nhap 1 so va tra ve so vua nhap neu no >=min va <=max
    //input:min, max
    public static double inputNumber(double min, double max) throws Exception{
        double num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input a number:");
        num=sc.nextDouble();
        if(num<min||num>max)
            throw new Exception();
        
        return num;
    }
}
