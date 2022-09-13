/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Log;
import DTO.LogList;
import Storage.ServiceList;
import DTO.Owner;
//import DTO.OwnerList;
import Storage.OwnerList;
import DTO.Pet;
import DTO.Service;
//import DTO.PetList;
//import DTO.ServiceList;
import java.util.Scanner;
import Storage.PetList;
import java.util.InputMismatchException;
/**
 *
 * @author quan
 */
public class Tester2 {
    public static void main(String[] args) {
        PetList List1 = new PetList();
        OwnerList List2 = new OwnerList();
        ServiceList List3 = new ServiceList();
        LogList List4 = new LogList();
        boolean kt=false;
        int choice;
        do{ 
            kt=false;
        try{
                do{
                    System.out.println("1.Quan ly DS Pet");
                    System.out.println("2.Quan Ly DS Owner");
                    System.out.println("3.Quan ly DS Service");
                    System.out.println("4.Cap nhat thong tin Owner cho pet");
                    System.out.println("5.Ghi nhan su dung Service cho pet");
                    System.out.println("Chon chuc nang:");
                    Scanner sc = new Scanner(System.in);
                    choice = sc.nextInt();

                    switch(choice) {
                        case 1:
                            int choice2 = 0;
                            boolean kt1;
                            do{
                                kt1=false;
                                try{
                            do {   
                                System.out.println("Quan ly Ds Pet");
                                System.out.println("1.add pet");
                                System.out.println("2.display all pet");
                                System.out.println("3. update Pet");
                                System.out.println("4.remove 1 Pet");
                                System.out.println("5.sap sep ds pet");
                                System.out.println("6.Thoat");
                                System.out.println("input choice(number): ");
                                sc = new Scanner(System.in);
                                
                                choice2 = sc.nextInt();
                                if(choice2<0 || choice2 >6)System.out.println("Not a chocie!");
                                        
                                switch(choice2) {
                                    case 1:
                                        Pet p = new Pet();
                                        do{
                                            p.input();
                                        }while(List1.findPet(p.getId()) >=0);
                                       if(List1.addPet(p))
                                        System.out.println("added");
                                        else System.out.println("add fail");
                                        break;
                                    case 2:
                                        if(!List1.equals(""))
                                        List1.displayAll();
                                        else System.out.println("list empty");
                                        break;
                                    case 3:
                                        int idupdate;
                                        boolean kt2;
                                        
                                            try{
                                                sc=new Scanner(System.in);
                                                System.out.println("Nhap pet's id can sua:");
                                                idupdate = sc.nextInt();
                                                if(List1.updatePet(idupdate)){
                                                    System.out.println("updated");
                                                    kt2=false;
                                                } else {
                                                    System.out.println("update fail");
                                                    kt2=false;
                                                }
                                            }catch (Exception e) {
                                                System.out.println("Input wrong format");
                                                kt2=true;
                                            }
                                       
                                        break;
                                    case 4:
                                        int idremove;
                                        boolean kt3=false;
                                            try{
                                                System.out.println("Nhap pet's id can xoa:");
                                                sc=new Scanner(System.in);
                                                idremove = sc.nextInt();
                                                if(List1.removePet(idremove)){
                                                    System.out.println("removed");
                                                } else {
                                                    System.out.println("remove fail");
                                                }
                                            }catch (Exception e) {
                                                System.out.println("Input wrong format");
                                                kt3=true;
                                            }
                                    break;
                                    case 5:
                                        if(List1.equals(""))
                                        System.out.println("list empty");
                                        else {
                                            List1.sortById();
                                            List1.displayAll();
                                        }
                                    break;
                                    
                                }
                            } while (choice2<=5 );
                                } catch (Exception e2) {
                                    System.out.println("not the choice!");
                                    kt1=true;
                                }
                            }while(kt1);
                        break;
                        //lam tuong tu tren cho ownerList
                        //TODO
                        case 2:
                            int choice3 = 0;
                            boolean kt5=false;
                            do{
                                kt5=false;
                                try{
                            do {
                                System.out.println("Quan ly DS owner");
                                System.out.println("1.Add owner");
                                System.out.println("2.Display all owner");
                                System.out.println("3.update owner");
                                System.out.println("4.remove 1 owner");
                                System.out.println("5.sort");
                                System.out.println("Input choice(number):");
                                sc = new Scanner(System.in);
                                choice2=sc.nextInt();
                                if(choice2<0 || choice2 >6)System.out.println("Not a chocie!");
                                switch(choice2) {
                                    case 1:
                                        Owner o = new Owner();
                                        do {
                                            o.input();//dung try catch de bat dieu kien
                                        } while (List2.findOwner(o.getId())>=0);
                                        if(List2.addOwner(o))
                                            System.out.println("added");
                                        else System.out.println("add fail");
                                        
                                        break;
                                    case 2:
                                        if(!List2.equals(""))
                                        List2.displayAll();
                                        else System.out.println("list empty");
                                        break;
                                    case 3:
                                        int idupdate;
                                        boolean kt6=false;
                                            try{
                                                sc=new Scanner(System.in);
                                                System.out.println("Nhap owner's id can sua:");
                                                idupdate =sc.nextInt();
                                                if(List2.updateOwner(idupdate)){
                                                    System.out.println("updated");
                                                    kt6=false;
                                                }
                                                else {
                                                    System.out.println("update fail");
                                                    kt6=false;
                                                }
                                                } catch (Exception e3) {
                                                System.out.println("Input wrong format");
                                                kt6=true;
                                            }
                                        break;
                                    case 4:
                                        int idremove;
                                        boolean kt7=false;
                                                try{
                                                    sc=new Scanner(System.in);
                                                    System.out.println("Nhap owner's id can xoa:");
                                                    idremove =sc.nextInt();
                                                    if(List2.removeOwner(idremove)){
                                                        System.out.println("removed");
                                                        
                                                    } else { 
                                                        System.out.println("remove fail");
                                                        kt7=false;
                                                    }
                                                }catch (Exception e) {
                                                        System.out.println("Input wrong format");
                                                        kt7=true;
                                                    }
                                        break;
                                    case 5:
                                         if(List2.equals(""))
                                        System.out.println("list empty");
                                        else {
                                            List2.sortById();
                                            List2.displayAll();
                                        }
                                    break;
                                }
                            } while (choice2<=5 );
                                } catch (Exception e3) {
                                    System.out.println("not the choice!");
                                    kt5=true;
                                }
                            }while(kt5);
                        break;
        //                    int ans1=0;
        //                    do{
        //                        System.out.println("Thong tin Pet and Owner");
        //                        System.out.println("input Pet'id:");
        //                        sc = new Scanner(System.in);
        //                        int idPet=sc.nextInt();
        //                        System.out.println("input Owner'id:");
        //                        int ownerId=sc.nextInt();
        //                        Pet p=List1.searchPet(idPet);
        //                        Owner w=List2.searchOwner(ownerId);
        //                        p.setOwner(w);
        //                        System.out.println("muon lam tiep tuc(1/0)?");
        //                        ans1=sc.nextInt();
        //                    } while(ans1==1);
        //                    break;
                        case 3:
                            int choice4 = 0;
                            boolean kt9=false;
                            do{ 
                                kt9=false;
                            try{
                            do {
                                System.out.println("Quan ly DS Service");
                                System.out.println("1.add service");
                                System.out.println("2.display all service");
                                System.out.println("3.update service");
                                System.out.println("4.remove 1 service");
                                System.out.println("5.sap xep ds service");
                                System.out.println("Input choice(number):");
                                sc = new Scanner(System.in);
                                choice4 = sc.nextInt();
                                if(choice4<0 || choice4 >6)System.out.println("Not a chocie!");
                                switch(choice4) {
                                    case 1:
                                        Service s = new Service();
                                        do {                                    
                                            s.input();
                                        } while (List3.findService(s.getId())>=0);
                                        if(List3.addService(s))
                                            System.out.println("service added");
                                        else System.out.println("service add fail");
                                        break;
                                    case 2:
                                        if(List3.equals(""))
                                        List3.displayAll();
                                        else System.out.println("list empty");
                                        break;
                                    case 3:
                                        int idupdate;
                                        boolean kt10;
                                            try{
                                                sc=new Scanner(System.in);
                                                System.out.println("Nhap Service's id can sua:");
                                                idupdate = sc.nextInt();
                                                if(List3.updateService(idupdate)){
                                                    System.out.println("updated");
                                                    kt10=false;
                                                } else {
                                                    System.out.println("update fail");
                                                    kt10=false;
                                                }
                                            }catch (Exception e) {
                                                System.out.println("Input wrong format");
                                                kt10=true;
                                            }
                                        break;
                                    case 4:
                                        int idremove;
                                        boolean kt11=false;
                                            try{
                                                System.out.println("Nhap Service's id can xoa:");
                                                sc=new Scanner(System.in);
                                                idremove = sc.nextInt();
                                                if(List3.removeService(idremove)){
                                                    System.out.println("removed");
                                                } else {
                                                    System.out.println("remove fail");
                                                }
                                            }catch (Exception e) {
                                                System.out.println("Input wrong format");
                                                kt11=true;
                                            }
                                    break;
                                    case 5:
                                        if(List3.equals(""))
                                        System.out.println("list empty");
                                        else {
                                            List3.sortById();
                                            List3.displayAll();
                                        }
                                        break;
                            
                                }
                            } while (choice4<=5 );
                                } catch (Exception e4) {
                                    System.out.println("not the choice!");
                                    kt9=true;
                                }
                            }while(kt9);
                        break;


        //                    int ans2=0;
        //                    do{
        //                        System.out.println("Thong tin Service and Owner");
        //                        System.out.println("input Service'id:");
        //                        sc = new Scanner(System.in);
        //                        int idService=sc.nextInt();
        //                        System.out.println("input Owner'id:");
        //                        int serviceId=sc.nextInt();
        //                        Pet p=List1.searchPet(idService);
        //                        Owner w=List2.searchOwner(serviceId);
        //                        p.setOwner(w);
        //                        System.out.println("muon lam tiep tuc(1/0)?");
        //                        ans2=sc.nextInt();
        //                    } while(ans2==1);

                        case 4:
                            int choice5 = 0;
                            do {
                                try{
                                System.out.println("input Pet's id:");
                                int petid = sc.nextInt();
                                System.out.println("input owner's id:");
                                int ownerid = sc.nextInt();
                                Pet p = List1.searchPet(petid);
                                Owner owner = List2.searchOwner(ownerid);
                                if(p!=null && owner!=null) 
                                    p.setOwner(owner);
                                else System.out.println("Pet's id or Owner's id is invalid");
                                System.out.println("co lam nua khong(1/0)?");
                                choice5 = sc.nextInt();
                                    } catch(InputMismatchException e) {
                                        System.out.println("Wrong format");
                                    }   
                            } while(choice5==1);
                            break;
                        case 5:
                            int choice6 = 0;
                            do{
                                System.out.println("1. add log");
                                System.out.println("2. update log");
                                System.out.println("3. remove log");
                                System.out.println("4. display all log");
                                System.out.println("5. exit");
                                System.out.println("nhap choice:");
                                choice6=sc.nextInt();
                                switch(choice6){
                                    case 1:
                                        System.out.println("nhap pet'id need to add:");
                                        int petid = sc.nextInt();
                                        System.out.println("nhap service's id need to add:");
                                        int serviceid = sc.nextInt();
                                        Pet p = List1.searchPet(petid);
                                        Service s = List3.searchService(serviceid);
                                        if(p!=null && s!=null) {
                                            Log x = new Log(p,s);
                                            if(List4.addLog(x)) {
                                                System.out.println("recorded");
                                            } else {
                                                System.out.println("not record");
                                            }
                                        } else System.out.println("pet's id or service's id is invalid");
                                        break;
                                    case 2: 
                                        System.out.println("Nhap pet'id need to update:");
                                        int idpetupdate = sc.nextInt();
                                        System.out.println("Nhap service's id need to update:");
                                        int idserviceupdate = sc.nextInt();

                                        if(List4.updateLogPet(idpetupdate)) {
                                            System.out.println("Pet updated");
                                        }
                                        else System.out.println("Pet update fail");

                                        if(List4.updateLogService(idserviceupdate)) {
                                            System.out.println("Service updated");
                                        }
                                        else System.out.println("Service update fail");
                                        break;
                                    case 3:
                                        System.out.println("Nhap pet'id to remove:");
                                        int idpetremove = sc.nextInt();
                                        System.out.println("Nhap service's id to remove");
                                        int idserviceremove = sc.nextInt();
                                        if(List4.removeLogPet(idpetremove)){
                                            System.out.println("Pet removed");
                                        }
                                        else System.out.println("remove pet fail");
                                        break;
                                    case 4: 
                                        
                                            List4.displayAll();
                                        break;
                                    case 5:
                                        System.out.println("Have a good day!");
                                        break;
                                    default: 
                                        System.out.println("you choice wrong, try again!");
                                        break;
                                }
                            }while(choice6==1 || choice6==2 || choice6==3 || choice6==4 || choice6!=5);
                            break;
                        default:
                            System.out.println("you choice wrong, try again!");
                            break;
                    }
                }while(choice <= 5 );
        }catch (Exception e) {
            System.out.println("Input wrong format");
            kt=true;
        }
        }while(kt);  
    }
}