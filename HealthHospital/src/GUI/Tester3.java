/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.LogList;
import DTO.OwnerList;
import DTO.Pet;
import DTO.ServiceList;
import DTO.PetList;
import DTO.Service;
import DTO.Log;
import DTO.Owner;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Tester3 {
    public static void main(String[] args){
        PetList list1 = new PetList();
        OwnerList list2 = new OwnerList();
        ServiceList list3 = new ServiceList();
        LogList list4 = new LogList();
        int choice=0;
        int choice1=0;
        int choice2=0;
        int choice3=0;
        Scanner sc=new Scanner(System.in);
        
        do{
            
            System.out.println("          ***Health Hospital***");
            System.out.println("      1.Quan Ly Danh Sach thu cung");
            System.out.println("      2.Quan Ly Danh Sach chu");
            System.out.println("      3.Quan Ly Danh Sach dich vu");
            System.out.println("      4.Cap nhat thong tin chu so huu cho thu cung");
            System.out.println("      5.cap nhat su dung dich vu");
            System.out.println("      6.EXSIT");
            System.out.println("Please choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach Pet***");
                            System.out.println("              1.Add Pet");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("Please choice:");
                            choice1=sc.nextInt();
                            switch(choice1){
                                case 1:
                                    Pet p=new Pet();
                                    do{
                                    p.inputPet();
                                    if(list1.find(p.getId())!= -1){
                                        System.out.println("The id has exists at:"+(list1.find(p.getId())));}
                                    }
                                    while(list1.find(p.getId())!=-1 );
                                    if(list1.addPet(p))
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
                                    if(list1.updatePet(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                    System.out.println("enter id to remove!");
                                    idremove=sc.nextInt();
                                    if(list1.removePet(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                          
                            }
                        }while(choice1<=4);
                        break;
                        
                case 2: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach Owner***");
                            System.out.println("              1.Add Owner");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("Please choice:");
                            choice2=sc.nextInt();
                            switch(choice2){
                                case 1:
                                    Owner o=new Owner();
                                    do{
                                    o.inputOwner();
                                    if(list2.find(o.getId())!= -1){
                                        System.out.println("The id has exists at:"+(list2.find(o.getId())));}
                                    }
                                    while(list2.find(o.getId())!=-1 );
                                    if(list2.addOwner(o))
                                        System.out.println("addes!");
                                    else System.out.println("add fail!");
                                    break;
                                case 2:
                                    list2.displayAll();
                                    break;
                                case 3: 
                                    int idupdate;
                                    System.out.println("<Enter id to update>");
                                    idupdate=sc.nextInt();
                                    if(list2.updateOwner(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                    System.out.println("enter id to remove!");
                                    idremove=sc.nextInt();
                                    if(list2.removeOwner(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                                    }
                            }while(choice2<=4);
                    break;
                
                case 3: do
                        {
                            System.out.println("       ***Quan ly danh sach Service***");
                            System.out.println("              1.Add Service");
                            System.out.println("              2.Display all ");
                            System.out.println("              3.Update ");
                            System.out.println("              4.Remove ");
                            System.out.println("Please choice!");
                            choice3=sc.nextInt();
                            switch(choice3){
                                case 1: 
                                    Service s=new Service();
                                    do{
                                        s.inputService();
                                        if(list3.find(s.getId())!= -1){ System.out.println("The id has exists at:"+(list3.find(s.getId())));}
                                        }
                                        while(list3.find(s.getId())!=-1 );
                                        if(list3.addService(s))
                                            System.out.println("addes!");
                                        else System.out.println("add fail!");
                                    break;
                                case 2: 
                                    list3.displayAll();
                                    break;
                                case 3:
                                    int idupdate;
                                        System.out.println("<Enter id to update>");
                                        sc=new Scanner(System.in);
                                        idupdate=sc.nextInt();
                                        if(list3.updateService(idupdate))
                                            System.out.println("updated!");
                                        else 
                                            System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                        System.out.println("enter id to remove!");
                                        sc=new Scanner(System.in);
                                        idremove=sc.nextInt();
                                        if(list3.removeService(idremove))
                                            System.out.println("removed!");
                                        System.out.println("removed fail!");
                                        break;
                            }
                        }while(choice3<=4);
                        break;
                   
                case 4:
          
                             System.out.println("       ***Cap nhat Thong tin chu so huu***");
                             System.out.println("enter Pet id:");
                             int petid = sc.nextInt();
                             Pet p=list1.search(petid);
                             if(p==null){ System.out.println("id has not exist!"); break;}
                             System.out.println("enter Owner id:");
                             int ownerid= sc.nextInt();
                             Owner o=list2.search(ownerid);
                             if(o==null){ System.out.println("id has not exist!"); break;}
                             p.setOwner(o);
                             break;
                             
                case 5:
                            int choice4 = 0;
                            do{
                                System.out.println("         ***Quan Ly Su Dung Dich Vu");
                                System.out.println("              1. add log");
                                System.out.println("              2. update");
                                System.out.println("              3. remove");
                                System.out.println("              4. display all");
                                System.out.println("              5. exit");
                                System.out.println("         please choice:");
                                choice4=sc.nextInt();
                                switch(choice4){
                                    case 1:
                                        System.out.println("enter pet id:");
                                        petid = sc.nextInt();
                                        System.out.println("enter service id:");
                                        int serviceid = sc.nextInt();
                                        p = list1.search(petid);
                                        Service s = list3.search(serviceid);
                                        if(p!=null && s!=null) {
                                            Log x = new Log(p,s);
                                            if(list4.addLog(x)) {
                                                System.out.println("Finish!");
                                            } else {
                                                System.out.println("ERROR!");
                                            }
                                        } else System.out.println("id is invalid");
                                        break;
                                    case 2: 
                                        System.out.println("Enter pet id to update:");
                                        int idpetupdate = sc.nextInt();
                                        System.out.println("Enter service id to update:");
                                        int idserviceupdate = sc.nextInt();

                                        if(list4.updateLogPet(idpetupdate)) {
                                            System.out.println("Pet updated");
                                        }
                                        else System.out.println("Pet update fail");

                                        if(list4.updateLogService(idserviceupdate)) {
                                            System.out.println("Service updated");
                                        }
                                        else System.out.println("Service update fail");
                                        break;
                                    case 3:
                                        System.out.println("enter pet id to remove:");
                                        int idpetremove = sc.nextInt();
                                        System.out.println("enter service id to remove");
                                        int idserviceremove = sc.nextInt();
                                        if(list4.removeLogPet(idpetremove)){
                                            System.out.println("REMOVED");
                                        }
                                        else System.out.println("REMOVE FALL!");
                                        break;
                                    case 4: 
                                        
                                            list4.displayAll();
                                        break;
                                    case 5:
                                        System.out.println("Have a good day!");
                                        break;
                                    default: 
                                        System.out.println("you choice wrong, try again!");
                                        break;
                                }
                            }while(choice4< 5);
                            break;
                                                                        
            }
        }while(choice<=5);
    }
}
