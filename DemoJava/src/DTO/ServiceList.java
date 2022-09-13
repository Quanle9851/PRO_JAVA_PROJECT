/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import DTO.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ServiceList {
    ArrayList<Service> list;
    public ServiceList () {
        list = new ArrayList<>();
    }
    public boolean addService(Service p){
        return list.add(p);
    }
    public void displayAll() {
        //cach 1
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).output();
//        }

        //cach 2
        for (Service p : list) {
            p.output();
        }
    }
    public int findService(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id)
                return i;
        }
        return -1;
    }
    public Service searchService(int id){
        for (Service p : list) {
            if(p.getId()==id) 
                return p;
        }
        return null;
    }
    public boolean updateService(int id) {
        Service p = searchService(id);
        if(p==null)return false;
        boolean inputcontinue = false;
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Service'name:");
                System.out.println("input new name:");
                p.setName(sc.nextLine());
                if(p.getName().equals(""))
                    throw new Exception("the name can not empty");
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               inputcontinue =true;
           }
        }while(inputcontinue);
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("input Service'pricce:");
                sc=new Scanner(System.in);
                System.out.println("input new price:");
                p.setPrice(sc.nextInt());
                if(p.getPrice() < 0) 
                    throw new Exception();
                    inputcontinue = false;
            } catch (InputMismatchException e) {
                System.out.println("Input wrong format");
                inputcontinue = true;
            } catch (Exception e2) {
                System.out.println("value is not negative");
                inputcontinue = true;
            }
        } while (inputcontinue);
        return true;
    }
    //xóa và trả về hàm xóa
    public boolean removeService(int id){
        Service tmp=searchService(id);
        return list.remove(tmp);        
    }
    public void sortById() {
        Collections.sort(list);
    }
}
