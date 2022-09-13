/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Clock implements Comparable<Clock>{
    String id="", manufact="";
    int price=0, guarantee=0;
    Scanner sc=new Scanner(System.in);

    public Clock() {
        
    }
    
    public Clock(String id){
        this.id=id;
    }
    
    public Clock(String id, String manufact,int price, int guarantee){
        this.id = id;
        this.manufact = manufact;
        this.price = price;
        this.guarantee = guarantee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public String toString() {
        return "ID:"+id+"    Manufact:"+manufact+"    Price:"+price+"    Guarantee:"+guarantee;
    }
    public void input(String ID){
        boolean error=false;
        id=ID;
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter manufact:");
                manufact=sc.nextLine();
                if(manufact.equals(""))
                    throw new Exception("manufact can not empty");
               error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter pricce:");
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
        
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter guarantee:");
               guarantee= sc.nextInt();
               if(guarantee < 0 && guarantee>36) throw new Exception();
                    error=false;
            } catch (InputMismatchException e) {
                System.out.println("Format Wrong!");
                error=true;
            } catch (Exception e2) {
                System.out.println("guarantee>=0 and =< 36");
                error= true;
            }
        } while (error);
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Clock)obj).id);
    }
    @Override
    public int compareTo(Clock clk){
          if(getId() == null || clk.getId()==null)
            return 0;
        return getId().compareTo(clk.getId());
    }
    
}
