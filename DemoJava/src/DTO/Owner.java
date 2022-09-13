package DTO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Owner implements Comparable<Owner>{
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void input(){
       boolean inputcontinue = false;
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("input Owner'id:");
               id= sc.nextInt();
               if(id < 0) 
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
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Owner'name:");
                name=sc.nextLine();
                if(name.equals(""))
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
                address=sc.nextLine();
                if(address.equals(""))
                    throw new Exception("the name can not empty");
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               inputcontinue =true;
           }
        }while(inputcontinue);
    }
    public void output(){
        System.out.println("owner's id:"+ id);
        System.out.println("owner's name:"+ name);
        System.out.println("owner's address:"+ address);
        
    }

    @Override
    public int compareTo(Owner o) {
        if(id>o.id) return 1;
        else if(id<o.id) return -1;
        return 0;    
    }
}
