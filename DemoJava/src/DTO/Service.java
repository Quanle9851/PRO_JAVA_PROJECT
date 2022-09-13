package DTO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Service implements Comparable <Service>{
    private int id;
    private String name;
    private int price;
    public Service(){
        id=0;
        name="";
        price=0;
    }
    public Service(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void input() {
        boolean inputcontinue = false;
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("input Service'id:");
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
                System.out.println("input Service'name:");
                name=sc.nextLine();
                if(name.equals(""))
                    throw new Exception("the name can not empty");
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               inputcontinue =true;
           }
        }while(inputcontinue);
        
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("input Service'pricce:");
               price= sc.nextInt();
               if(price < 0) 
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
    }
    
    public void output() {
        System.out.println("set's id: " + id);
        System.out.println("set's name: " + name);
        System.out.println("set's price: " + price);
    }

    @Override
    public int compareTo(Service s) {
        if(id>s.id) return 1;
        else if(id<s.id) return -1;
        return 0;
    }
    
}
