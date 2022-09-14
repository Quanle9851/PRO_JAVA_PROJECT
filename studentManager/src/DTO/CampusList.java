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
public class CampusList {
    Campus[] list;
     final int MAX=100;
     int n;
     
     public CampusList(){
         list=new Campus[MAX];
         n=0;
     }
     
     public boolean addCampus(Campus cp){
        if(n>=MAX) return false;
        list[n]=cp;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputCampus();
    }
   
    public int find(int code){
        for(int i=0;i<n;i++){
            if(list[i].getCode()==code)
                return i;
        }
        return -1;
    }
   
    public Campus search(int code){
        for(int i=0;i<n;i++){
            if(list[i].getCode()==code)
                return list[i];
        }
        return null; 
    }
    
   
    public boolean updateCampus(int code){
        boolean error=false;
        Campus cp=search(code);
        if(cp==null) return false;
        do{
            String name;
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("name can not empty!");
               error=false;
               cp.setName(name);
               }catch(Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
       }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Campus address:");
                cp.setAddress(sc.nextLine());
                if(cp.getAddress().equals(""))
                    throw new Exception("name can not empty!");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
       return true;
    }
    
    public boolean removeCampus(int code){
        int i=find(code);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
}
