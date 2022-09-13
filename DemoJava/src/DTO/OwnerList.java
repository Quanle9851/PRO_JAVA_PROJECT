/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import DTO.Owner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class OwnerList {
    ArrayList<Owner> list;
    public OwnerList () {
        list = new ArrayList<>();
    }
    public boolean addOwner(Owner p){
        return list.add(p);
    }
    public void displayAll() {
        //cach 1
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).output();
//        }

        //cach 2
        for (Owner p : list) {
            p.output();
        }
    }
    public int findOwner(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id)
                return i;
        }
        return -1;
    }
    public Owner searchOwner(int id){
        for (Owner p : list) {
            if(p.getId()==id) 
                return p;
        }
        return null;
    }
    public boolean updateOwner(int id) {
        Owner p = searchOwner(id);
        if(p == null) return false;
        boolean inputcontinue=false;
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Owner'name:");
                p.setName(sc.nextLine());
                if(p.getName().equals(""))
                    throw new Exception("the name can not empty");
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               inputcontinue =true;
           }
        }while(inputcontinue);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Owner'address:");
                p.setAddress(sc.nextLine());
                if(p.getAddress().equals(""))
                    throw new Exception("the name can not empty");
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               inputcontinue =true;
           }
        }while(inputcontinue);
        return true;
    }

    //xóa và trả về hàm xóa
    public boolean removeOwner(int id){
        Owner tmp=searchOwner(id);
        return list.remove(tmp);        
    }
    public void sortById() {
        Collections.sort(list);
    } 
}
