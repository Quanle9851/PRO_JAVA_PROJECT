/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import static DTO.CheckExDate.toDate;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class FoodList  extends ArrayList<Food>{
    ArrayList<Food> list;
    Scanner sc = new Scanner(System.in);
    
    public FoodList() {
        super();
    }    
    public void addFood(){
        String ID="";
        String name="";
        float weight=0;
        String type="";
        String place="";
        String expDate;
        boolean error;
        System.out.println("Add new food:");
        do {
            try {
                error=false;
                String patter = "^(\\d{3})";
                System.out.print("Food ID(xxx): ");
                ID = sc.nextLine().toUpperCase();

                if (IDExist(ID) == true) {
                    System.out.println("ID has exist! try againt!");
                    error=true;
                }
                if (!ID.matches(patter)) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("ID is wrong format! please try again.");
                error=true;
            }
        } while (error);
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.print("Food Name: ");
                name = sc.nextLine();
                if (name.isEmpty()) {
                    throw new Exception();
                }
                error = false;
            } catch (Exception e) {
                System.out.println("Name is not empty!!Try again.");
                error = true;
            }
        } while (error);
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.print("Food Weight(kg):");
               weight= sc.nextFloat();
               if(weight<0)throw new Exception();
                error=false;
            } catch (InputMismatchException e) {
                System.out.println("FORMAT WRONG!Try again.");
                error=true;
            } catch (Exception e2) {
                System.out.println("weight > 0!");
                error=true;
            }
        } while (error);
        
        do {
            try {
                Scanner sc=new Scanner(System.in);
                System.out.print("Type: ");
                type = sc.nextLine();
                if (type.isEmpty()) {
                    throw new Exception();
                }
                error = false;
            } catch (Exception e) {
                System.out.println("Type is not empty!!Try again.");
                error = true;
            }
        } while (error);
        //nhap place
        do {
            try {
                error=false;
                String patter = "^[1,2,3,4]";
                System.out.print("Place (1: Freezer ; 2: Freezer Door; 3 : Regular; 4 : Door) :");
                place = sc.nextLine().toUpperCase();
                if (!place.matches(patter)) {
                    throw new Exception();
                }
                if (place.isEmpty()) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("place is wrong! please try again.");
                error=true;
            } 
        } while (error);
        
        do {
            error=false;
            System.out.print("date(yyyy-mmmm-ddd): ");
            Scanner sc=new Scanner(System.in);
            String d=sc.nextLine().trim();
            long t =toDate(d);
            if (t<0){System.out.println("Invalid");error=true;}
            else{ expDate=d;
            this.add(new Food(ID, name, weight, type, place,expDate));
            System.out.println("Added successful");}
         }while(error);
            if (Enter.inputNonBlankStr("Do you want to add another item (Y/N)? ").equals("Y")) this.addFood();     
    }
    
    public void removeFood(){
        if (this.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            String rID = Enter.inputNonBlankStr(" ID of the food you want to remove is: ");
            int pos = searchID(rID);
            if (pos < 0) {
                System.out.println("The Food does not exist. Remove Unsuccessfull");
            } else {
                String warning = Enter.inputNonBlankStr("Are you sure you want to remove" + this.get(pos).Name + "? (Y/N)" );
                if ("Y".equals(warning)) {
                    this.remove(pos);
                    System.out.println("The food have "+rID +" is removed.");
                } else System.out.println("Remove Unsuccessfull");
            }
        }
    }
    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            System.out.println("***--------FOOD LIST----------***");
            System.out.println("     -----------------------");
            sortByExpireddDate();
            for (Food x : this) {
                System.out.println(x.toString());
            }
            System.out.println("Total: " + this.size() + " item(s).");
            System.out.println("_________________________________");
        }
    }
    public void searchFood(){
        if (this.isEmpty()) {
            System.out.println("The list is empty!.");
        }else{
            String keyword;
            keyword = Enter.inputNonBlankStr("What is the name of the food you want to search for? : ");
            String reg = ".*("+ keyword +").*";
            boolean checkEmpty = true;
            for (Food x : this) {
                if (x.Name.matches(reg)) {
                    System.out.println(x.toString());
                    checkEmpty = false;
                }
            }
            if (checkEmpty) System.out.println("This food name does not exist");
            
            if (Enter.inputNonBlankStr("Do you want to continue searching (Y/N)? ").equals("Y")) this.searchFood();
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
                for (Food e : this) {
                   
                    fw.write(e.getID() + "," + e.getName() + "," + e.getWeight()+","
                            + e.getType() + ","+ e.getPlace() + ","+ e.getExpDate());
                    fw.write("\n");
                }
                pw.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }        
    }
    public void loadfromFile (String filename){
        try {
            File f = new File(filename);
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] split = data.split(",");
                String ID = split[0];
                String name = split[1];
                float weight = Float.parseFloat(split[2]);
                String type = split[3];
                String place =split[4];
                String expDate=split[5];
                this.add(new Food(ID, name, weight, type, place, expDate));
            }
        } catch (Exception e) {
                System.out.println(e);
            } 
    }
    private int searchID(String ID) {
        if (!this.isEmpty()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getID().equals(ID)) {
                    return i;
                }
            }      
        }
        return -1;
    }   
    
    private boolean IDExist(String ID){
        return search(ID) != null;
    }
    private Food search(String ID) {
        for (Food x : this) {
            if (x.getID().equals(ID)) {
                return x;
            }
        }
        return null;
    }
    public void sortByExpireddDate() {
        Collections.sort(this);
    }

}
