
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class Doglist {
    HashMap<Integer, Dog> h;
    
    public Doglist(){
        h=new HashMap<>();
    }
    
    public void addDog(Dog d){
        h.put(d.id, d);
    }
    
    public void displayAll(){
        Collection<Dog> tmp=h.values();
        for(Dog dog : tmp){
            System.out.println(dog);
        }
    }
    
    public Dog searchDog(int id){
        return h.get(id);
    }
    
    public boolean updateDog(int id){
        Dog kq=searchDog(id);
        if(kq==null) return false;
        Scanner sc=new Scanner(System.in);
        kq.name=sc.nextLine();
        return true;
        
    }
    
    public boolean killDog(int id){
         Dog killedDog = h.remove(id);
         if(killedDog==null) return false;
         return true;
    }
    
    public void testWriteFile(){
        String filename="dog.dat";
        ArrayList<Dog> list=new ArrayList<>();
        list.add(new Dog(1,"Tung"));
        list.add(new Dog(2,"son"));
        list.add(new Dog(3,"Khoa"));
        FileDAO.writeBinaryDogs(filename, list);
    }  
}
