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
public class OrderList {
     Order[] list;
     final int MAX=100;
     int n;
     
     public OrderList(){
         list=new Order[MAX];
         n=0;
     }
     
     public boolean addOrder(Order o){
        if(n>=MAX) return false;
        list[n]=o;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputOrder();
    }
   
    public int find(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return i;
        }
        return -1;
    }
    
    public int findinvoice(int ma){
        for(int i=0;i<n;i++){
            if(list[i].getInvoice().getMa()==ma)
                return i;
        }
        return -1;
    }
   
    public Order search(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return list[i];
        }
        return null; 
    }
    
   
    public boolean updateOrder(int id){
        boolean error=false;
        Order o=search(id);
        if(o==null) return false;
        
       do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new order date:");
                o.setOrderDate(sc.nextLine());
                if(! o.getOrderDate().matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(o.getOrderDate().equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
       
      do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new ship date:");
                o.setShipDate(sc.nextLine());
                if(! o.getOrderDate().matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(o.getShipDate().equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
       return true;
    }
    
    public boolean removeOrder(int id){
        int i=find(id);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
    
}
