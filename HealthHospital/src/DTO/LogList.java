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
public class LogList{
    Log[] list;
    int n;
    final int MAX=100;
    
    public LogList(){
        list=new Log[MAX];
        n=0;
    }
    
    
    public boolean addLog(Log P){
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
    
    public Log searchLogPet(int id){
        for (int i=0; i<n; i++) {
            if(list[i].pet.getId() == id)
                return list[i];
        }
        return null;
    }
    public Log searchLogService(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].service.getId() == id)
                return list[i];
        }
        return null;
    }
    public int findLogPet(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].getPet().getId() == id){
                return i;
            }
        }
        return -1;
    }
    public int findLogService(int id){
        for (int i = 0; i < n; i++) {
            if(list[i].getService().getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    public boolean updateLogPet(int id){
        Log p=searchLogPet(id);
        if(p==null)return false;
        boolean error=false;
        
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Input new name:");
                p.getPet().setName(sc.nextLine());
                if(p.getPet().getName().equals(""))
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
                String Pattern = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
                System.out.println("input Pet birthday:");
                p.getPet().setBirthday(sc.nextLine());
                if(!p.getPet().getBirthday().matches(Pattern))
                    throw new Exception();
                error=false;
           } catch (Exception e) {
               System.out.println(" birthday is wrong format");
               error=true;
           }
        }while(error);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input Pet gender(male/female):");
                p.getPet().setGender(sc.nextLine()); 
                if(!p.getPet().getGender().matches("male") && !p.getPet().getGender().matches("female") )
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println(" wrong format");
               error=true;
           }
        }while(error);
        return true;
    }
    public boolean updateLogService(int id) {
        Log p = searchLogService(id);
        if(p==null)return false;
        boolean error=false;
        do {
           try {
                Scanner sc=new Scanner(System.in);
                System.out.println("input new name:");
                p.getService().setName(sc.nextLine());
                if(p.getService().getName().equals(""))
                    throw new Exception("format is wrong");
                error=false;
            } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
            }
        }while(error);
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("input price:");
                p.getService().setPrice(sc.nextInt());
                if(p.getService().getPrice() < 0)
                    throw new Exception();
                error=false;
           } catch (InputMismatchException e) {
               System.out.println("Wrong format");
               error=true;
           } catch (Exception e1) {
               System.out.println("The price > 0");
               error=true;
           }
        }while (error);
        return true;
    }
    
    public boolean removeLogPet(int id) {
        int i = findLogPet(id);
        if(i == -1) return false;
        for (int j = i; j < n; j++) {
            list[j]=list[j+1];
        }
        n--;
        return true;
    }
    public boolean removeLogService(int id) {
        int i = findLogService(id);
        if(i == -1) return false;  
        for (int j = 0; j < n; j++) {
            list[j] = list[j+1];
        }
        n--;
        return false;
    }
}
