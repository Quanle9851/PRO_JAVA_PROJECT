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
public class StaffList {
     Staff[] list;
     final int MAX=100;
     int n;
     
     public StaffList(){
         list=new Staff[MAX];
         n=0;
     }
     
     public boolean addStaff(Staff s){
        if(n>=MAX) return false;
        list[n]=s;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputStaff();
    }
   
    public int find(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return i;
        }
        return -1;
    }
   
    public Staff search(int id){
        for(int i=0;i<n;i++){
            if(list[i].getId()==id)
                return list[i];
        }
        return null; 
    }
    
   
    public boolean updateStaff(int id){
        boolean error=false;
        Staff s=search(id);
        if(s==null) return false;
        do{
            String name;
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("ten ko de trong");
               error=false;
               s.setName(name);
               }catch(Exception e3){
                System.out.println(e3.getMessage());
                error=true;
            }
       }while(error);
        
         do{
            String gender;
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input Student gender(male/female):");
                gender=sc.nextLine(); 
                if(!gender.matches("male") && !gender.matches("female") )
                    throw new Exception();
                error=false;
                s.setGender(gender);
            } catch (Exception e) {
               System.out.println("Format wrong!");
               error=true;
           }
        }while(error);
        
        do{
            long basicSalary;
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input basic salary:");
               basicSalary= sc.nextLong();
               if(basicSalary<0)
            throw new Exception();
        error=false;
        s.setBasicSalary(basicSalary);
        }catch(InputMismatchException e5){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e6){
            System.out.println("salary must be greater than 0!");
            error=true;
        }
       }while(error);
       return true;
    }
    
    public boolean removeStaff(int id){
        int i=find(id);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
    
}
