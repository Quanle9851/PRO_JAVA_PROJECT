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
public class Item {
    private int id;
    private String name;
    private long price;
    private int status;

    public Item() {
        id=0;
        name="";
        price=0;
        status=0;
    }

    public Item(int id, String name, long price, int status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
     public void inputItem(){
       boolean error=false;
       
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Item id:");
               id= sc.nextInt();
               if(id<0)throw new Exception();
                error=false;
            } catch (InputMismatchException e) {
                System.out.println("Format Wrong!");
                error=true;
            } catch (Exception e2) {
                System.out.println("ID>0!");
                error=true;
            }
        } while (error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Item name:");
                name=sc.nextLine();
                if(name.equals(""))
                    throw new Exception("name can not empty");
               error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Item price:");
               price= sc.nextInt();
               if(price < 0) throw new Exception();
                    error=false;
            } catch (InputMismatchException e) {
                System.out.println("Format Wrong!");
                error=true;
            } catch (Exception e2) {
                System.out.println("price>0");
                error= true;
            }
        } while (error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("Enter Status(1:sold/ 0:not sold):");
                status=sc.nextInt(); 
                if(status!=1 && status!=0) 
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println("Format Wrong!");
               error=true;
           }
        }while(error);
    }
     
     public void outputItem(){
          System.out.println("ID: "+id+"      NAME: "+name+"         PRICE: "+price+"       STATUS: "+status);
     }
}
