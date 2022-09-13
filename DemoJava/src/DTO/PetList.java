/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import DTO.Pet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class PetList extends ArrayList<Pet> {
    ArrayList<Pet> list;
    boolean inputcontinue=false;
    public PetList () {
        list = new ArrayList<>();
    }
    public boolean addPet(Pet p){
        return list.add(p);
    }
    public void displayAll() {
        //cach 1
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).output();
//        }

        //cach 2
        for (Pet p : list) {
            p.output();
        }
    }
    public int findPet(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id)
                return i;
        }
        return -1;
    }
    public Pet searchPet(int id){
        for (Pet p : list) {
            if(p.getId()==id) 
                return p;
        }
        return null;
    }
    public boolean updatePet(int id) {
        
        Pet p = searchPet(id);
        if(p==null)return false;
        do{
            try{
                Scanner sc=new Scanner(System.in);
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
            
        do{
            try{
                Scanner sc=new Scanner(System.in);
                String Pattern = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
                System.out.println("input Pet'birthday(dd/mm/yyyy):");
                p.setBirthday(sc.nextLine());
                if(!p.getBirthday().matches(Pattern))
                    throw new Exception();
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(" birthday is wrong format");
               inputcontinue = true;
           }
        }while(inputcontinue);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Pet'gender(only 'male' or 'female'):");
                p.setGender(sc.nextLine());
                if(!p.getGender().matches("male") && !p.getGender().matches("female") )
                    throw new Exception();
                inputcontinue = false;
            } catch (Exception e) {
               System.out.println("Pet's gender wrong format");
               inputcontinue = true;
           }
        }while(inputcontinue);
        return true;
    }
//sử dụng field giữ lại mã thì cách 1 còn cách 2 thì đổi toàn bộ
//          Pet newpet = new Pet();
//          newpet.input();
//          int i = findPet(id);
//          list.set(i, newpet);
    
    
//    public boolean removePet(int id) {
//        int i = findPet(id);
//        // TH này xóa và trả về hàm bị xóa
//        Pet tmp = list.remove(i);
//        if(tmp != null) return true;
//        
//    }
    //xóa và trả về hàm xóa
    public boolean removePet(int id){
        Pet tmp=searchPet(id);
        return list.remove(tmp);        
    }
    public void sortById() {
        Collections.sort(list);
    }
}
    
//bản chất vấn đề cũng giống nhau nhưng hàm không thao tác trực tiếp lên buffer