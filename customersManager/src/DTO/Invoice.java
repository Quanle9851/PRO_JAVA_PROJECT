/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Invoice {
    private int ma;
    private String date;

    public Invoice() {
        ma=0;
        date="";
        
    }

    public Invoice(int ma, String date) {
        this.ma = ma;
        this.date = date;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    public void inputInvoice(){
        boolean error=false;
       
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Invoice id:");
               ma= sc.nextInt();
               if(ma<0)throw new Exception();
                error=false;
            } catch (InputMismatchException e) {
                System.out.println("Format Wrong!");
                error=true;
            } catch (Exception e2) {
                System.out.println("ID>0!");
                error=true;
            }
        } while (error);
        
        do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Invoice date:");
                date=sc.nextLine();
                if(! date.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(date.equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
    }
    
     public void outputInvoice(){
        
        System.out.println("ID INVOICE:"+ ma);
        System.out.println("DATE:"+ date);
    }
}
