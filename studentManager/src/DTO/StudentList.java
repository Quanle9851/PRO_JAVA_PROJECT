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
public class StudentList {
    Student[] list;
     final int MAX=100;
     int n;
     
     public StudentList(){
         list=new Student[MAX];
         n=0;
     }
     
     public boolean addStudent(Student s){
        if(n>=MAX) return false;
        list[n]=s;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputStudent();
    }
   
    public int find(String id){
        for(int i=0;i<n;i++){
            if(list[i].getId().matches(id))
                return i;
        }
        return -1;
    }
   
    public Student search(String id){
        for(int i=0;i<n;i++){
            if((list[i].getId()).matches(id))
                return list[i];
        }
        return null; 
    }
    
   
    public boolean updateStudent(String id){
        boolean error=false;
        Student s=search(id);
        if(s==null) return false;
        do{
            String name;
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("name can not empty");
               error=false;
               s.setName(name);
               }catch(Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
       }while(error);
        
        do{
            String address;
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Student address:");
                address=sc.nextLine();
                if(address.equals(""))
                    throw new Exception("address can not empty!");
                error=false;
                s.setAddress(address);
           } catch (Exception e) {
               System.out.println(e.getMessage());
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
       return true;
    }
    
    public boolean removeStudent(String id){
        int i=find(id);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
}
