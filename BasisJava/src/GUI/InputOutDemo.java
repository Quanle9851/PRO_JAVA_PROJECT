/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class InputOutDemo {
    public static void main(String[] args){
    int a[];
    int n;
    int i;
    Scanner cs=new Scanner(System.in);
        System.out.println("Enter number of element:");
        n=Integer.parseInt(cs.nextLine());
        a=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the " +(i+1)+ "/" +n+ "element:");
            a[i]=Integer.parseInt(cs.nextLine());
        }
        System.out.println("Enter value: ");
        for(i=0;i<n;i++) System.out.format("%5d", a[i]);
        int s=0;
        for(i=0;i<n;i++) s+=a[i];
        System.out.println("sum of value is:"+s);
    }
}
