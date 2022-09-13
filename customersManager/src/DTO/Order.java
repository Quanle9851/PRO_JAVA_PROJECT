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
public class Order {
    private int id;
    private String orderDate;
    private String shipDate;
    private int totalQuantity;
    private Customers customers;
    private Invoice invoice;

    public Order() {
        id=0;
        orderDate="";
        shipDate="";
        totalQuantity=0;
        customers=null;
        invoice=null;
        
    }

    public Order(int id, String orderDate, String shipDate, int totalQuantity, Customers customers,Invoice invoice) {
        this.id = id;
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.totalQuantity = totalQuantity;
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    
    public void inputOrder(){
       boolean error=false;
       do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input order id:");
               id= sc.nextInt();
               if(id<0)
            throw new Exception();
        error=false;
        }catch(InputMismatchException e){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e2){
            System.out.println("id must be greater than 0!");
            error=true;
        }
       }while(error);
       
       do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter order date:");
                orderDate=sc.nextLine();
                if(! orderDate.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(orderDate.equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
       
      do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter ship date:");
                shipDate=sc.nextLine();
                if(! shipDate.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(shipDate.equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
      
    }
    
    public void outputOrder(){
        if(customers!=null){
            System.out.println("CUSTOMER:");
            customers.outputCustomers();
        }
        System.out.println("ID ORDER:"+ id);
        System.out.println("ORDER DATE:"+ orderDate);
        System.out.println("SHIP DATE:"+ shipDate);
        System.out.println("Total Quantity:"+ totalQuantity);
        
        if(invoice!=null){
            System.out.println("INVOICE:");
            invoice.outputInvoice();
        }
        
    }
}
