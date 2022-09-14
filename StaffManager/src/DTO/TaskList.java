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
public class TaskList {
    Task[] list3;
     final int MAX=100;
     int n;
     
     public TaskList(){
         list3=new Task[MAX];
         n=0;
     }
     
     public boolean addTask(Task t){
        if(n>=MAX) return false;
        list3[n]=t;
        n++;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<n; i++)
            list3[i].outputTask();
    }
   
    public int find(int id){
        for(int i=0;i<n;i++){
            if(list3[i].getId()==id)
                return i;
        }
        return -1;
    }
   
    public Task search(int id){
        for(int i=0;i<n;i++){
            if(list3[i].getId()==id)
                return list3[i];
        }
        return null; 
    }
    
   
    public boolean updateTask(int id){
        boolean error=false;
        Task t=search(id);
        if(t==null) return false;
       do{
           String title;
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input title:");
               title=sc.nextLine();
               if(title.equals(""))
                   throw new Exception("ten ko de trong");
               error=false;
               t.setTitle(title);
               }catch(Exception e3){
                System.out.println(e3.getMessage());
                error=true;
            }
       }while(error);
        
        do{
            String beginDate;
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter begin date:");
                beginDate=sc.nextLine();
                if(! beginDate.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                t.setBeginDate(beginDate);
                if(beginDate.equals(""))
                   throw new Exception("ten khong de trong!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
        
        do{
            String endDate;
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter end date:");
                endDate=sc.nextLine();
                if(! endDate.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                t.setEndDate(endDate);
                if(endDate.equals(""))
                   throw new Exception("ten khong de trong!");
            }catch(Exception e5){
                System.out.println(e5.getMessage());
                error=true;
            }
        }while(error);
        
        return true;
    }
    
    public boolean removeTask(int id){
        int i=find(id);
        if(i==-1) return false;
        for(int j=i; j<n; j++)
            list3[j]=list3[j+1];
         n--;
         return true;
    }
}
