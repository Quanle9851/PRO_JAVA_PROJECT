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
public class Service {
    private int id;
    private String name;
    private int price;

    public Service(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Service() {
        id=0;
        name="";
        price=0;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void inputService(){
       boolean error=false;
       
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Service id:");
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
                System.out.println("Enter Service name:");
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
               System.out.println("Enter Service pricce:");
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
    }
    
    public void outputService(){
        System.out.println("service id:"+ id);
        System.out.println("Service name:"+ name);
        System.out.println("service price:"+ price);
    }
}
