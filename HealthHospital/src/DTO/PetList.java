/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import DTO.Pet;
import java.util.InputMismatchException;



/**
 *
 * @author Bao
 */
public class PetList extends ArrayList<Pet>{
    Pet[] list;
    final int MAX = 100;
    int n;
    
    public PetList(){
        list=new Pet[MAX];
        n=0; 
    }
    
    public boolean addPet(Pet p){
        if(n>=MAX) return false;
        list[n]=p;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputPet();
    }
    
    public int find(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return i;
        }
        return -1;// ko tim thay 
    }
    
    
    public Pet search(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return list[i];
        }
        return null;// ko tim thay 
    }
    
    
    public boolean updatePet(int id){
        Pet p=search(id);
        if(p==null) return false;
        boolean error=false;
   
       do{
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input new Pet name:");
                p.setName(sc.nextLine());
               if(p.getName().equals(""))
                   throw new Exception("error");
               error=false;
               }catch(Exception e3){
                System.out.println(e3.getMessage());
                error=true;
            }
       }while(error);
       
       do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter new Pet birthday:");
                p.setBirthday(sc.nextLine());
                if(! p.getBirthday().matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(p.getBirthday().equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
       
       do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input new Pet gender(male/Female):");
                p.setGender(sc.nextLine()); 
                if(!p.getGender().matches("male") && !p.getGender().matches("female") )
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println("Pet's gender wrong format");
               error=true;
           }
        }while(error);
        return true;
    }
    
    
    public boolean removePet(int id){
        int i=find(id);
        if(i==-1) return false;
        
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
    

}
