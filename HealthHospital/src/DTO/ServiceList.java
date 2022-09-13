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
public class ServiceList {
    Service[] list;
    int n;
    final int MAX=100;
    
    public ServiceList(){
        list= new Service[MAX];
        n=0;
    }
    
    public boolean addService(Service s){
        if(n>=MAX) return false;
        list[n]=s;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputService();
    }
    
    public int find(int id){
        for(int i=0; i<n; i++)
            if(list[i].getId()==id)
                return i;
        return -1;
    }
    
    public Service search(int id){
        for(int i=0; i<n; i++)
            if(list[i].getId()==id)
                return list[i];
        return null;
    }
    
     public boolean updateService(int id){
        Service s = search(id);
        if(s==null)return false;
        boolean error=false;
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new service name:");
                s.setName(sc.nextLine());
                if(s.getName().equals(""))
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
                s.setPrice(sc.nextInt());
                if(s.getPrice()<0) 
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
        return true;
    }
    
    
    public boolean removeService(int id){
        int i=find(id);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
}
