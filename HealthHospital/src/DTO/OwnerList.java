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
public class OwnerList {
    Owner[] list;
    int n;
    final int MAX=100;
    //TODO: addOwner, findOwner, updateOwner, removeOwner;
    
    public OwnerList(){
        list= new Owner[100];
        n=0;
    }
    
    public boolean addOwner(Owner o){
        if(n>MAX) return false;
        list[n]=o;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputOwner();
    }
    
    public int find(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return i;
        }
        return -1;
    }
   
    public Owner search(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return list[i];
        }
        return null;
    }
    
    public boolean updateOwner(int id){
        Owner o=search(id);
        if(o==null) return false;
        boolean error=false;
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new Owner name:");
                o.setName(sc.nextLine());
                if(o.getName().equals(""))
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
                System.out.println("Enter Owner address:");
                o.setAddress(sc.nextLine());
                if(o.getAddress().equals(""))
                    throw new Exception("address can not empty");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        return true;
    }
    
    public boolean removeOwner(int id){
        int i=find(id);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
}
