
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
public class part3 {
    public static void main(String[] args){
        String[] list=new String[10];
        int num;
        System.out.println("Enter number of student:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=0;i<num;i++){
            sc=new Scanner(System.in);
            System.out.println("enter name of student "+(i+1)+":");
            list[i]=sc.nextLine();
        }
        System.out.println(" list of student name");
        for(int i=0;i<num;i++){
            list[i]=list[i].toUpperCase();
            System.out.println("\n"+list[i]);
        }
    }
}
