/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class Tester {
    public static void main(String[] args){
        
        Doglist ds=new Doglist();
        Dog d=new Dog(20, "a");
        ds.addDog(d);
        ds.addDog(new Dog(10,"b"));
        ds.addDog(new Dog(30,"c"));
        ds.addDog(new Dog(25,"d"));
        ds.addDog(new Dog(10,"tester"));
        ds.displayAll();
        int id=20;
        Dog kq=ds.searchDog(id);
        if(kq==null) System.out.println("Not found!");
        else System.out.println(kq);
    }
}
