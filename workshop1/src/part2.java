
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class part2 {
    public static void main(String[] args){
        float num1,num2;
        String op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1=sc.nextFloat();
        System.out.println("Enter number 2:");
        num2=sc.nextFloat();
        System.out.println("Ebter the operator:");
        sc=new Scanner(System.in);
        op=sc.nextLine();
        if(op.equals("+")){
            System.out.println("the result of "+num1+op+num2+"="+(num1+num2));
        }
        if(op.equals("-")){
            System.out.println("the result of "+num1+op+num2+"="+(num1-num2));
        }
        if(op.equals("*")){
            System.out.println("the result of "+num1+op+num2+"="+(num1*num2));
        }
        if(op.equals("/")){
            System.out.println("the result of "+num1+op+num2+"="+(num1/num2));
        }
        else{
            System.out.println("this is not a operator!!");
        }
    }
}
