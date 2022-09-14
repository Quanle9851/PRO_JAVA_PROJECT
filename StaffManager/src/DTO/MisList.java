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
public class MisList {
    Mis[] list;
    int n;
    final int MAX=100;
    
    public MisList(){
        list=new Mis[MAX];
        n=0;
    }
    
    
    public boolean addMis(Mis P){
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
    
    public Mis searchMisStaff(int id){
        for (int i=0; i<n; i++) {
            if(list[i].staff.getId() == id)
                return list[i];
        }
        return null;
    }
    public Mis searchMisTask(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].task.getId() == id)
                return list[i];
        }
        return null;
    }
    public int findMisStaff(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].getStaff().getId() == id){
                return i;
            }
        }
        return -1;
    }
    public int findMisTask(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].getTask().getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    public boolean updateMisStaff(int id){
        Mis p=searchMisStaff(id);
        if(p==null)return false;
        boolean error=false;
        
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Input new name:");
                p.getStaff().setName(sc.nextLine());
                if(p.getStaff().getName().equals(""))
                    throw new Exception("the name can not empty");
                error=false;
            } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
            }
        }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input new gender(male/female):");
                p.getStaff().setGender(sc.nextLine()); 
                if(!p.getStaff().getGender().matches("male") && !p.getStaff().getGender().matches("female") )
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println(" wrong format");
               error=true;
           }
        }while(error);
        
        
        do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input basic salary:");
               p.getStaff().setBasicSalary(sc.nextInt()); 
               if(p.getStaff().getBasicSalary()<0)
            throw new Exception();
        error=false;
        }catch(InputMismatchException e){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e){
            System.out.println("salary must be greater than 0!");
            error=true;
        }
       }while(error);
       return true; 
    }
     
    public boolean updateMisTask(int id) {
        Mis p = searchMisTask(id);
        if(p==null)return false;
        boolean error=false;
        do {
           try {
                Scanner sc=new Scanner(System.in);
                System.out.println("input new title:");
                p.getTask().setTitle(sc.nextLine());
                if(p.getTask().getTitle().equals(""))
                    throw new Exception("format is wrong");
                error=false;
            } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
            }
        }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                String Pattern = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
                System.out.println("input begin date:");
                p.getTask().setBeginDate(sc.nextLine());
                if(!p.getTask().getBeginDate().matches(Pattern))
                    throw new Exception();
                error=false;
           } catch (Exception e) {
               System.out.println("format is wrong!");
               error=true;
           }
        }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                String Pattern = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
                System.out.println("input end date:");
                p.getTask().setEndDate(sc.nextLine());
                if(!p.getTask().getEndDate().matches(Pattern))
                    throw new Exception();
                error=false;
           } catch (Exception e) {
               System.out.println("format is wrong!");
               error=true;
           }
        }while(error);
        
        do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input total hours:");
               p.getTask().setTotalHours(sc.nextInt()); 
               if(p.getTask().getTotalHours()<0)
            throw new Exception();
        error=false;
        }catch(InputMismatchException e){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e){
            System.out.println("salary must be greater than 0!");
            error=true;
        }
       }while(error);
        return true;
    }
    
    public boolean removeMisStaff(int id) {
        int i = findMisStaff(id);
        if(i == -1) return false;
        for (int j = i; j < n; j++) {
            list[j]=list[j+1];
        }
        n--;
        return true;
    }
    public boolean removeMisTask(int id) {
        int i = findMisTask(id);
        if(i == -1) return false;  
        for (int j = 0; j < n; j++) {
            list[j] = list[j+1];
        }
        n--;
        return false;
    }
}
