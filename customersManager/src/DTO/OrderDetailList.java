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
public class OrderDetailList {
    OrderDetail[] list;
    int n;
    final int MAX=100;
    
    public OrderDetailList(){
        list=new OrderDetail[MAX];
        n=0;
    }
    
    
    public boolean addOrderDetail(OrderDetail P){
        if(n>=MAX) return false;
        list[n]=P;
        n++;
        return true;
    }
    
    public void displayAll() {
        for (int i=0; i<n; i++){
            list[i].output();
        }
    }
    
    public OrderDetail searchOrderDetailOrder(int id){
        for (int i=0; i<n; i++) {
            if(list[i].order.getId()==id)
                return list[i];
        }
        return null;
    }
    public OrderDetail searchOrderDetailItem(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].item.getId()==id)
                return list[i];
        }
        return null;
    }
    public int findOrderDetailOrder(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].getOrder().getId()==id){
                return i;
            }
        }
        return -1;
    }
    public int findOrderDetailItem(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].getItem().getId()==id){
                return i;
            }
        }
        return -1;
    }
    
    public boolean updateOrderDetailOrder(int id){
        OrderDetail p=searchOrderDetailOrder(id);
        if(p==null)return false;
        boolean error=false;
        
        do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new order date:");
                p.getOrder().setOrderDate(sc.nextLine());
                if(! (p.getOrder().getOrderDate()).matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(p.getOrder().getOrderDate().equals(""))
                   throw new Exception("error!");
            }catch(Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
        }while(error);
       
      do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new ship date:");
                p.getOrder().setShipDate(sc.nextLine());
                if(! p.getOrder().getShipDate().matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(p.getOrder().getShipDate().equals(""))
                   throw new Exception("error!");
            }catch(Exception e2){
                System.out.println(e2.getMessage());
                error=true;
            }
        }while(error);
   
       return true; 
    }
     
    public boolean updateOrderDetailItem(int id) {
        OrderDetail p = searchOrderDetailItem(id);
        if(p==null)return false;
        boolean error=false;
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new Item name:");
                p.getItem().setName(sc.nextLine());
                if(p.getItem().getName().equals(""))
                    throw new Exception("name can not empty");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter new pricce:");
                 p.getItem().setPrice(sc.nextLong());
                if(p.getItem().getPrice()<0) 
                    throw new Exception();
                    error=false;
            } catch (InputMismatchException e) {
                System.out.println("Format Wrong!");
                error=true;
            } catch (Exception e2) {
                System.out.println("Price>0");
               error=true;
            }
        } while (error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Status(1:sold/ 0:not sold):");
                p.getItem().setStatus(sc.nextInt());
                if(p.getItem().getStatus()!=1 && p.getItem().getStatus()!=0) 
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println("Format Wrong!");
               error=true;
           }
        }while(error);
        
        return true;
    }
    
    public boolean removeOrderDetailOrder(int id) {
        int i = findOrderDetailOrder(id);
        if(i == -1) return false;
        for (int j = i; j < n; j++) {
            list[j]=list[j+1];
        }
        n--;
        return true;
    }
    
}
