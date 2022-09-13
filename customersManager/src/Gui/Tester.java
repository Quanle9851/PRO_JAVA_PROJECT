/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DTO.Customers;
import DTO.CustomersList;
import DTO.Invoice;
import DTO.InvoiceList;
import DTO.Item;
import DTO.ItemList;
import DTO.Order;
import DTO.OrderDetail;
import DTO.OrderDetailList;
import DTO.OrderList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Quan
 */
public class Tester {
    public static void main(String[] args){
        CustomersList list1=new CustomersList();
        OrderList list2=new OrderList();
        ItemList list3=new ItemList();
        InvoiceList list4 = new InvoiceList();
        OrderDetailList list5=new OrderDetailList();
        int choice=0;
        int choice1=0;
        int choice2=0;
        int choice3=0;
        int choice4=0;
        Scanner sc=new Scanner(System.in);
        
        do{
            
            System.out.println("          ***QUAN LY SHOP WEB***");
            System.out.println("      1.Quan Ly Danh Sach Khach Hang");
            System.out.println("      2.Quan Ly Danh Sach Order");
            System.out.println("      3.Quan Ly Danh Sach Hang Hoa");
            System.out.println("      4.Quan ly danh sach Hoa Don");
            System.out.println("      5.Order san pham");
            System.out.println("      6.order detail");
            System.out.println("      7.in hoa don");
            System.out.println("Please choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach khach hang***");
                            System.out.println("              1.Add Customers");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("Please choice:");
                            choice1=sc.nextInt();
                            switch(choice1){
                                case 1:
                                    Customers c=new Customers();
                                    do{
                                    c.inputCustomers();
                                    if(list1.find(c.getId())!= -1){
                                        System.out.println("The id has exists at:"+(list1.find(c.getId())));}
                                    }
                                    while(list1.find(c.getId())!=-1 );
                                    if(list1.addCustomers(c))
                                        System.out.println("addes!");
                                    else System.out.println("add fail!");
                                    break;
                                case 2:
                                    list1.displayAll();
                                    break;
                                case 3: 
                                    int idupdate;
                                    System.out.println("<Enter id to update>");
                                    idupdate=sc.nextInt();
                                    if(list1.updateCustomers(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                    System.out.println("enter id to remove!");
                                    idremove=sc.nextInt();
                                    if(list1.removeCustomers(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                            }
                        }while(choice1<=4);
                        break;
                        
                case 2: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach Order***");
                            System.out.println("              1.Add order");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("        Please choice:");
                            choice2=sc.nextInt();
                            switch(choice2){
                                case 1:
                                    Order o=new Order();
                                    do{
                                    o.inputOrder();
                                    if(list2.find(o.getId())!= -1){
                                        System.out.println("id has exists at:"+(list2.find(o.getId())));}
                                    }
                                    while(list2.find(o.getId())!=-1 );
                                    if(list2.addOrder(o))
                                        System.out.println("addes!");
                                    else System.out.println("add fail!");
                                    break;
                                case 2:
                                    list2.displayAll();
                                    break;
                                case 3: 
                                    int idupdate;
                                    System.out.println("<Enter ID to update>");
                                    idupdate=sc.nextInt();
                                    if(list2.updateOrder(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                    System.out.println("enter ID to remove!");
                                    idremove=sc.nextInt();
                                    if(list2.removeOrder(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                                    }
                            }while(choice2<=4);
                    break;
                
                case 3: do
                        {
                            System.out.println("       ***Quan ly danh sach hang hoa***");
                            System.out.println("              1.Add Item");
                            System.out.println("              2.Display all ");
                            System.out.println("              3.Update ");
                            System.out.println("              4.Remove ");
                            System.out.println("      Please choice!");
                            choice3=sc.nextInt();
                            switch(choice3){
                                case 1: 
                                    Item i=new Item();
                                    do{
                                        i.inputItem();
                                        if(list3.find(i.getId())!= -1){ System.out.println("The id has exists at:"+(list3.find(i.getId())));}
                                        }
                                        while(list3.find(i.getId())!=-1 );
                                        if(list3.addItem(i))
                                             System.out.println("addes!");
                                        else System.out.println("add fail!");
                                    break;
                                case 2: 
                                    list3.displayAll();
                                    break;
                                case 3:
                                    int idupdate;
                                        System.out.println("<Enter ID to update>");
                                        sc=new Scanner(System.in);
                                        idupdate=sc.nextInt();
                                        if(list3.updateItem(idupdate))
                                            System.out.println("updated!");
                                        else 
                                            System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                        System.out.println("enter IDto remove!");
                                        sc=new Scanner(System.in);
                                        idremove=sc.nextInt();
                                        if(list3.removeItem(idremove))
                                            System.out.println("removed!");
                                        System.out.println("removed fail!");
                                        break;
                            }
                        }while(choice3<=4);
                        break;
                        
                case 4: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach Hoa Don***");
                            System.out.println("              1.Add Invoice");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("        Please choice:");
                            choice4=sc.nextInt();
                            switch(choice4){
                                case 1:
                                    Invoice iv=new Invoice();
                                    do{
                                    iv.inputInvoice();
                                    if(list4.find(iv.getMa())!= -1){
                                        System.out.println("Ma has exists at:"+(list4.find(iv.getMa())));}
                                    }
                                    while(list4.find(iv.getMa())!=-1 );
                                    if(list4.addInvoice(iv))
                                        System.out.println("addes!");
                                    else System.out.println("add fail!");
                                    break;
                                case 2:
                                    list4.displayAll();
                                    break;
                                case 3: 
                                    int idupdate;
                                    System.out.println("<Enter Ma to update>");
                                    idupdate=sc.nextInt();
                                    if(list4.updateInvoice(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                    System.out.println("enter Ma to remove!");
                                    idremove=sc.nextInt();
                                    if(list4.removeInvoice(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                                    }
                            }while(choice4<=4);
                    break;
                   
                case 5:
          
                             System.out.println("       ***order san pham***");
                             System.out.println("enter customer id:");
                             sc=new Scanner(System.in);
                             int customersid = sc.nextInt();
                             Customers c=list1.search(customersid);
                             if(c==null){ System.out.println("id has not exist!"); break;}
                             System.out.println("enter order id:");
                             int orderid= sc.nextInt();
                             Order o=list2.search(orderid);
                             if(o==null){ System.out.println("id has not exist!"); break;}
                             o.setCustomers(c);
                             break;
                             
                case 6:      
                            do{
                                System.out.println("                ***Order Detail***");
                                System.out.println("              1. add Item");
                                System.out.println("              2. display all");
                                System.out.println("              3. remove");
                                System.out.println("              4.update");
                                System.out.println("         please choice:");
                                choice4=sc.nextInt();
                                switch(choice4){
                                    case 1:
                                        boolean error=false;
                                        int q=0;
                                        System.out.println("enter order id:");
                                        sc=new Scanner(System.in);
                                        orderid = sc.nextInt();
                                        o = list2.search(orderid);
                                        if(o==null){ System.out.println("id has not exist!"); break;}
                                        System.out.println("enter Item id:");
                                        sc=new Scanner(System.in);
                                        int itemid = sc.nextInt();
                                        Item i = list3.search(itemid);
                                        if(i==null){ System.out.println("code has not exist!"); break;}
                                        
                                        do{
                                           try{
                                               sc=new Scanner(System.in);
                                               System.out.println("enter quantity:");
                                               q= sc.nextInt();
                                               if(q<0)
                                            throw new Exception();
                                        error=false;
                                        o.setTotalQuantity(o.getTotalQuantity()+q);
                                        }catch(InputMismatchException e){
                                            System.out.println("format is wrong! try again!");
                                            error=true;
                                        }catch(Exception e1){
                                            System.out.println("quantity must be greater than 0!");
                                            error=true;
                                        }
                                           
                                       }while(error);
                                        if(o!=null && i!=null) {
                                            OrderDetail x = new OrderDetail(o,i,q);
                                            if(list5.addOrderDetail(x)) {
                                                System.out.println("Finish!");
                                            } else {
                                                System.out.println("ERROR!");
                                            }
                                        } else System.out.println("id is invalid");
                                        break;
                                    
                                    case 3:
                                        System.out.println("enter order id to remove:");
                                        sc=new Scanner(System.in);
                                        int idremove = sc.nextInt();
                                        if(list5.removeOrderDetailOrder(idremove)){
                                            System.out.println("compleate removed");
                                        }
                                        else System.out.println("remove fail");
                                        break;
                                    case 2:
                                            list5.displayAll();
                                        break; 
                                    
                                    case 4: System.out.println("enter order id to update:");
                                        sc=new Scanner(System.in);
                                        int idupdate = sc.nextInt();
                                        System.out.println("enter Item id to update:");
                                        sc=new Scanner(System.in);
                                        int codeupdate = sc.nextInt();

                                        if(list5.updateOrderDetailOrder(idupdate)) {
                                            System.out.println("student updated");
                                        }
                                        else System.out.println("update fail!!");

                                        if(list5.updateOrderDetailItem(codeupdate)) {
                                            System.out.println("course updated");
                                        }
                                        else System.out.println("update fail!!");
                                        break;
                                }
                            }while(choice4<=3);
                          break;
                          
                case 7 : System.out.println("       ***In Hoa Don***");
                             System.out.println("enter order id:");
                             sc=new Scanner(System.in);
                             orderid = sc.nextInt();
                             o=list2.search(orderid);
                             if(o==null){ System.out.println("id has not exist!"); break;}
                             System.out.println("enter invoice id:");
                             int invoiceid= sc.nextInt();
                             Invoice in=list4.search(invoiceid);
                             if(in==null){ System.out.println("id has not exist!"); break;}
                             if(o.getInvoice()!=null){System.out.println("each order have only one invoice!!");break;}
                             
                             o.setInvoice(in);
                             
                             break;
                                        
                                          
            }
        }while(choice<=7);
    }
}
