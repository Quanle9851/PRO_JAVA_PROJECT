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
public class CourseList {
    Course[] list;
     final int MAX=100;
     int n;
     
     public CourseList(){
         list=new Course[MAX];
         n=0;
     }
     
     public boolean addCourse(Course c){
        if(n>=MAX) return false;
        list[n]=c;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list[i].outputCourse();
    }
   
    public int find(String code){
        for(int i=0;i<n;i++){
            if(list[i].getCode().matches(code))
                return i;
        }
        return -1;
    }
   
    public Course search(String code){
        for(int i=0;i<n;i++){
            if(list[i].getCode().matches(code))
                return list[i];
        }
        return null; 
    }
    
   
    public boolean updateCourse(String code){
        boolean error=false;
        Course c=search(code);
        if(c==null) return false;
        do{
            String name;
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("name can not empty");
               error=false;
               c.setName(name);
               }catch(Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
       }while(error);
        
        do{
            long creadits;
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input creadits:");
               creadits= sc.nextLong();
               if(creadits<0)
            throw new Exception();
        error=false;
        c.setCreadits(creadits);
        }catch(InputMismatchException e){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e2){
            System.out.println("creadits must be greater than 0!");
            error=true;
        }
       }while(error);
       return true;
    }
    
    public boolean removeCourse(String code){
        int i=find(code);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list[j]=list[j+1];
         n--;
         return true;
    }
}
