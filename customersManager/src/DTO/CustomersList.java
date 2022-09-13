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
public class CustomersList {
    Customers[] list;
    int n;
    final int MAX=100;
    
    public CustomersList(){
        list= new Customers[MAX];
        n=0;
    }
    
    public boolean addCustomers(Customers c){
        if(n>MAX) return false;
        list[n]=c;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputCustomers();
    }
    
    public int find(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return i;
        }
        return -1;
    }
   
    public Customers search(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return list[i];
        }
        return null;
    }
    
    public boolean updateCustomers(int id){
        Customers c = search(id);
        if(c==null) return false;
        boolean error=false;
        
       do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new customer name:");
                c.setName(sc.nextLine());
                if(c.getName().equals(""))
                    throw new Exception("name can not empty");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new Owner address:");
                c.setAddress(sc.nextLine());
                if(c.getAddress().equals(""))
                    throw new Exception("name can not empty");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        return true;
    }
    
    public boolean removeCustomers(int id){
        int i=find(id);
        if(i==-1) return false;
  
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
}
