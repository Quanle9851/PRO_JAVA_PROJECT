
import java.util.Scanner;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.function.Function;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class Clock {
    String ID="";
    String manufacturer="";
    int price=0;
    Scanner sc= new Scanner(System.in);
    public static Comparator comparator = new Comparator(){
        @Override
        public int compare(Object t, Object t1) {
            return ((Clock)t).ID.compareTo(((Clock)t1).ID);
        }
        
    };

    public Clock() {
    }
    
    
    public Clock(String ID){
        this.ID=ID;
    }

    public Clock(String ID, String manu, int p) {
        this.ID = ID;
        this.manufacturer = manu;
        this.price = p;
    }

    @Override
    public String toString() {
        return ID + ", " + manufacturer + ", " + price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    

    public static Comparator getComparator() {
        return comparator;
    }

    public static void setComparator(Comparator comparator) {
        Clock.comparator = comparator;
    }
    
    public void input(){
        boolean error=false;
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter id:");
                ID=sc.nextLine();
                
                if(ID.equals(""))
                    throw new Exception("id can not empty");
               error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               error=true;
           }
        }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter manufact:");
                manufacturer=sc.nextLine();
                if(manufacturer.equals(""))
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
       
    }
    public void update(String id){
        boolean error=false;
        ID=id;
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter manufact:");
                manufacturer=sc.nextLine();
                if(manufacturer.equals(""))
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
       
    }
}
