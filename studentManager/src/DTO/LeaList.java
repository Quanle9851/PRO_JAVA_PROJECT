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
public class LeaList {
    Lea[] list;
    int n;
    final int MAX=100;
    
    public LeaList(){
        list=new Lea[MAX];
        n=0;
    }
    
    
    public boolean addLea(Lea P){
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
    
    public Lea searchLeaStudent(String id){
        for (int i=0; i<n; i++) {
            if(list[i].student.getId().matches(id))
                return list[i];
        }
        return null;
    }
    public Lea searchLeaCourse(String code){
        for (int i = 0; i < n; i++) {
            if(list[i].course.getCode().matches(code))
                return list[i];
        }
        return null;
    }
    public int findLeaStudent(String id){
        for (int i = 0; i < n; i++) {
            if(list[i].getStudent().getId().matches(id)){
                return i;
            }
        }
        return -1;
    }
    public int findLeaCourse(String code){
        for (int i = 0; i < n; i++) {
            if(list[i].getCourse().getCode().matches(code)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean updateLeaStudent(String id){
        Lea p=searchLeaStudent(id);
        if(p==null)return false;
        boolean error=false;
        
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Input new name:");
                p.getStudent().setName(sc.nextLine());
                if(p.getStudent().getName().equals(""))
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
                System.out.println("input Student address:");
                p.getStudent().setAddress(sc.nextLine());
                if(p.equals(""))
                    throw new Exception("address can not empty!");
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
                p.getStudent().setGender(sc.nextLine()); 
                if(!p.getStudent().getGender().matches("male") && !p.getStudent().getGender().matches("female") )
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println(" wrong format");
               error=true;
           }
        }while(error);
   
       return true; 
    }
     
    public boolean updateLeaCourse(String code) {
        Lea p = searchLeaCourse(code);
        if(p==null)return false;
        boolean error=false;
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Input new course name:");
                p.getCourse().setName(sc.nextLine());
                if(p.getCourse().getName().equals(""))
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
               System.out.println("input creadits:");
               p.getCourse().setCreadits(sc.nextLong());
               if(p.getCourse().getCreadit()<0)
            throw new Exception();
        error=false;
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
    
    public boolean removeLeaStudent(String id) {
        int i = findLeaStudent(id);
        if(i == -1) return false;
        for (int j = i; j < n; j++) {
            list[j]=list[j+1];
        }
        n--;
        return true;
    }
    
}
