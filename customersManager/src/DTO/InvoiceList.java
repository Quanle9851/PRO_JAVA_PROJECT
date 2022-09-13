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
public class InvoiceList {
     Invoice[] list;
     final int MAX=100;
     int n;
     
     public InvoiceList(){
         list=new Invoice[MAX];
         n=0;
     }
     
     public boolean addInvoice(Invoice i){
        if(n>=MAX) return false;
        list[n]=i;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputInvoice();
    }
   
    public int find(int ma){
        for(int i=0;i<n;i++){
            if(list[i].getMa()==ma)
                return i;
        }
        return -1;
    }
   
    public Invoice search(int ma){
        for(int i=0;i<n;i++){
            if(list[i].getMa()==ma)
                return list[i];
        }
        return null; 
    }
    
   
    public boolean updateInvoice(int ma){
        boolean error=false;
        Invoice i=search(ma);
        if(i==null) return false;
        do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new Invoice date:");
                i.setDate(sc.nextLine());
                if(! i.getDate().matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(i.getDate().equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
       return true;
    }
    
    public boolean removeInvoice(int ma){
        int i=find(ma);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
    
}
