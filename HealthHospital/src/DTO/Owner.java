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
public class Owner {
    private int id;
    private String name;
    private String address;

    public Owner(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Owner() {
        id=0;
        name="";
        address="";
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void inputOwner(){
       boolean error=false;
       
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("enter Owner id:");
               id= sc.nextInt();
               if(id<0)throw new Exception();
                error=false;
            } catch (InputMismatchException e) {
                System.out.println("FORMAT WRONG!");
                error=true;
            } catch (Exception e2) {
                System.out.println("value > 0!");
                error=true;
            }
        } while (error);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Owner name:");
                name=sc.nextLine();
                if(name.equals(""))
                    throw new Exception("name can not empty");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
       
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Owner address:");
                address=sc.nextLine();
                if(address.equals(""))
                    throw new Exception("address can not empty");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
    }
    
    public void outputOwner(){
        System.out.println("owner id:"+ id);
        System.out.println("owner name:"+ name);
        System.out.println("owner address:"+ address);
        
    }
}
