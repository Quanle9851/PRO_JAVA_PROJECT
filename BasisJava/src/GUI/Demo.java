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
public class Demo {
    public static void main(String[] args){
        int a=12;
        float b;
        boolean c;
        String name;
        System.out.println("GIA TRI CUA A LA:" + a);
        
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap gia tri cua B:");
        b=sc.nextFloat();
        System.out.println("b="+ b);
        
        System.out.println("nhap gia tri cua c:");
        c=sc.nextBoolean();
        System.out.println("c="+c);
        
        sc=new Scanner(System.in);
        System.out.println("nhap ten nguoi dung:");
        name=sc.nextLine();
        System.out.println("name:"+name);

    }
    
}
