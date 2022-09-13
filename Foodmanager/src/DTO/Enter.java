/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Enter {
    public static Scanner sc = new Scanner(System.in);
    public Enter() {
    }
    
    public static int EnterInteger(String msg, int min, int max){
        int data;
        do{
            System.out.print(msg);
            data= Integer.parseInt(sc.nextLine());
        } while (data<min || data >max);
        return data;
    }
     
    public static String inputNonBlankStr(String msg){
        String data;
        do{
            System.out.print(msg);
            data= sc.nextLine().trim();
        }while(data.length() < 1);
        return data;
    }
  
}
