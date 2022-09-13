/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class ClockList extends LinkedList<Clock>{
    Scanner sc=new Scanner(System.in);
    
    public void addClock(){
        Clock clk=new Clock();
        String ID="";
        boolean error=false;
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter id:");
                ID=sc.nextLine();
                if(IDExist(ID)==true)
                    throw new Exception("id has Exist!");
                if(ID.equals(""))
                    throw new Exception("id can not empty");
               error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        
        clk.input(ID);
        if(this.add(clk)==true)
            System.out.println("Added Successfully");
        else
            System.out.println("Added failed!");
    }
    
    private int search(String ID) {
        if (!this.isEmpty()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getId().equals(ID)) {
                    return i;
                }
            }      
        }
        return -1;
    }  
    
    private int searchs(String id){
        return this.indexOf(new Clock(id));
    }
    
    public void removeClock(){
        String id;
        System.out.println("Input clock id which will be removed:");
        id=sc.nextLine();
        int pos = search(id);
        if(pos<0) System.out.println("Not found!");
        else {
            this.remove(pos);
            System.out.println("Clock"+id+"was delected.");
        }
    }
    
    public void updateClock(){
        String id;
        System.out.println("Intput clock id which will be updated:");
        id=sc.nextLine();
        int pos = search(id);
        if(pos<0) System.out.println("Not found!");
        else {
            this.get(pos).input(id);
            System.out.println("Clock"+id+"was updated.");
        }
    }
    
    public void print(){
        sortById();
        for (Clock clk: this) System.out.println(clk);
    }
    
    public void printPrice(){
        int price1, price2;
        System.out.println("input price range.");
        System.out.println("price 1:");
        price1=Integer.parseInt(sc.nextLine());
        System.out.println("price 2:");
        price2=Integer.parseInt(sc.nextLine());
        if (price1 > price2){
            int t = price1;
            price1=price2;
            price2=t;
        }
        for (Clock clk : this){
            int price = clk.getPrice();
            if ( price >= price1 && price <= price2)
                System.out.println(clk);
        }
    }
     private boolean IDExist(String ID){
        return searchid(ID) != null;
    }
    private Clock searchid(String ID) {
        for (Clock clk : this) {
            if (clk.getId().equals(ID)) {
                return clk;
            }
        }
        return null;
    }
    public void loadfromFile (String filename){
        try {
            File f = new File(filename);
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] split = data.split(",");
                String ID = split[0];
                String manufact = split[1];
                int price = Integer.parseInt(split[2]);
                int guarantee = Integer.parseInt(split[3]);
                this.add(new Clock(ID, manufact, price, guarantee));
            }
        } catch (Exception e) {
                System.out.println(e);
            } 
    }
    
    public void savetoFile(String filename){
        if (this.isEmpty()) { 
            System.out.println("The list is Empty!");
        } else {
            try {
                File f = new File(filename);
                FileWriter fw = new FileWriter(f);
                BufferedWriter pw = new BufferedWriter(fw);
                for (Clock e : this) {
                   
                    fw.write(e.getId() + "," + e.getManufact() + "," + e.getPrice()+","
                            + e.getGuarantee());
                    fw.write("\n");
                }
                pw.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }      
    }
    public void sortById() {
        Collections.sort(this);
    }
     
}
