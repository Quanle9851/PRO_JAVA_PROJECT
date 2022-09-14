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
public class ManagerList {
     Manager[] list2;
     final int MAX=100;
     int n;
     
     public ManagerList(){
         list2=new Manager[MAX];
         n=0;
     }
     
     public boolean addManager(Manager m){
        if(n>=MAX) return false;
        list2[n]=m;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list2[i].outputStaff();
    }
   
    public int find(int id){
        for(int i=0;i<n;i++){
            if(list2[i].getId()==id)
                return i;
        }
        return -1;
    }
   
    public Manager search(int id){
        for(int i=0;i<n;i++){
            if(list2[i].getId()==id)
                return list2[i];
        }
        return null; 
    }
    
   
    public boolean updateManager(int id){
        boolean error=false;
        Manager m=search(id);
        if(m==null) return false;
        do{
            String name;
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("name can not empty!");
               error=false;
               m.setName(name);
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
                m.setGender(gender);
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
        m.setBasicSalary(basicSalary);
        }catch(InputMismatchException e5){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e6){
            System.out.println("salary must be greater than 0!");
            error=true;
        }
       }while(error);
        
        do{
            long bonusSalary;
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input basic salary:");
               bonusSalary= sc.nextLong();
               if(bonusSalary<0)
            throw new Exception();
        error=false;
        m.setBonusSalary(bonusSalary);
        }catch(InputMismatchException e7){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e8){
            System.out.println("salary must be greater than 0!");
            error=true;
        }
       }while(error);
        return true;
    }
    
    public boolean removeManager(int id){
        int i=find(id);
        if(i==-1) return false;
        //khi tim thay thi dich chuyen cac phan tu len mot vi tri
        for(int j=i; j<n; j++)
            list2[j]=list2[j+1];
         n--;
         return true;
    }
}
