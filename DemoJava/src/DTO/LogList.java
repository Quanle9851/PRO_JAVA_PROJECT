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
 * @author tu
 */
public class LogList {
    Log[] list;
    int n;
    final int Max = 100;
    public LogList() {
        list = new Log[Max];
        n = 0;
    }
    
    public boolean addLog(Log P) {
        if(n >=Max) return false;
        list[n]=P;
        n++;
        return true;
    }
    
    public void displayAll() {
        for (int i = 0; i < n; i++) {
            list[i].output();
        }
    }
    
    public Log searchLogPet(int id) {
        for (int i = 0; i < n; i++) {
            if(list[i].pet.getId() == id)
                return list[i];
        }
        return null;
    }
    public Log searchLogService(int id) {
        for (int i = 0; i < n; i++) {
            if(list[i].service.getId() == id)
                return list[i];
        }
        return null;
    }
    public int findLogPet(int id) {
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
        return -1;//khong thay
    }
    public boolean updateLogPet(int id) {
        Log p = searchLogPet(id);
        if(p==null)return false;
        boolean kt1 = false;
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Input new name:");
                p.getPet().setName(sc.nextLine());
                if(p.getPet().getName().equals(""))
                    throw new Exception("the name can not empty");
                kt1 = false;
            } catch (Exception e) {
               System.out.println(e.getMessage());
               kt1 =true;
            }
        }while(kt1);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                String Pattern = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
                System.out.println("input Pet'birthday(dd/mm/yyyy):");
                p.getPet().setBirthday(sc.nextLine());
                if(!p.getPet().getBirthday().matches(Pattern))
                    throw new Exception();
                kt1 = false;
           } catch (Exception e) {
               System.out.println(" birthday is wrong format");
               kt1 = true;
           }
        }while(kt1);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input Pet'gender(only 'male' or 'female'):");
                p.getPet().setGender(sc.nextLine()); 
                if(!p.getPet().getGender().matches("male") && !p.getPet().getGender().matches("female") )
                    throw new Exception();
                kt1 = false;
            } catch (Exception e) {
               System.out.println("Pet's gender wrong format");
               kt1 = true;
           }
        }while(kt1);
        return true;
    }
    public boolean updateLogService(int id) {
        Log p = searchLogService(id);
        if(p==null)return false;
        boolean kt = false;
        do {
           try {
                Scanner sc=new Scanner(System.in);
                System.out.println("input new name:");
                p.getService().setName(sc.nextLine());
                if(p.getService().getName().equals(""))
                    throw new Exception("the name can not empty");
                kt = false;
            } catch (Exception e) {
               System.out.println(e.getMessage());
               kt =true;
            }
        }while(kt);
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("input price:");
                p.getService().setPrice(sc.nextInt());
                if(p.getService().getPrice() < 0)
                    throw new Exception();
                kt = false;
           } catch (InputMismatchException e) {
               System.out.println("Wrong format");
               kt = true;
           } catch (Exception e1) {
               System.out.println("The price can not negative");
               kt = true;
           }
        }while (kt);
        return true;
    }
    
    public boolean removeLogPet(int id) {
        int i = findLogPet(id);
        if(i == -1) return false;
        //dich chuyen len 1 ptu
        for (int j = i; j < n; j++) {
            list[j]=list[j+1];
        }
        n--;//giam 1 ptu
        return true;
    }
    public boolean removeLogService(int id) {
        int i = findLogService(id);
        if(i == -1) return false;
        //dich chuyen len 1 ptu
        for (int j = 0; j < n; j++) {
            list[j] = list[j+1];
        }
        n--;//giam 1 ptu
        return false;
    }
}
