/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Staff;
import DTO.Manager;
import DTO.Task;
import DTO.ManagerList;
import DTO.Mis;
import DTO.MisList;
import DTO.TaskList;
import DTO.StaffList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Bao
 */
public class Tester3 {
    public static void main(String[] args){
        StaffList list1=new StaffList();
        TaskList list3=new TaskList();
        ManagerList list2=new ManagerList();
        MisList list4 = new MisList();
        int choice=0;
        int choice1=0;
        int choice2=0;
        int choice3=0;
        Scanner sc=new Scanner(System.in);
        
        do{
            
            System.out.println("          ***QUAN LY CONG VIEC***");
            System.out.println("      1.Quan Ly Danh Sach Nhan Vien");
            System.out.println("      2.Quan Ly Danh Sach Quan Ly");
            System.out.println("      3.Quan Ly Danh Sach Cong Viec");
            System.out.println("      4.Phan Cong Quan Ly");
            System.out.println("      5.Phan Cong Cong Viec");
            System.out.println("Please choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach Staff***");
                            System.out.println("              1.Add Staff");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("Please choice:");
                            choice1=sc.nextInt();
                            switch(choice1){
                                case 1:
                                    Staff s=new Staff();
                                    do{
                                    s.inputStaff();
                                    if(list1.find(s.getId())!= -1){
                                        System.out.println("The id has exists at:"+(list1.find(s.getId())));}
                                    }
                                    while(list1.find(s.getId())!=-1 );
                                    if(list1.addStaff(s))
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
                                    if(list1.updateStaff(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                    System.out.println("enter id to remove!");
                                    idremove=sc.nextInt();
                                    if(list1.removeStaff(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                            }
                        }while(choice1<=4);
                        break;
                        
                case 2: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach manager***");
                            System.out.println("              1.Add Manager");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("Please choice:");
                            choice2=sc.nextInt();
                            switch(choice2){
                                case 1:
                                    Manager m=new Manager();
                                    do{
                                    m.inputStaff();
                                    if(list2.find(m.getId())!= -1){
                                        System.out.println("The id has exists at:"+(list2.find(m.getId())));}
                                    }
                                    while(list2.find(m.getId())!=-1 );
                                    if(list2.addManager(m))
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
                                    if(list2.updateManager(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                    System.out.println("enter id to remove!");
                                    idremove=sc.nextInt();
                                    if(list2.removeManager(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                                    }
                            }while(choice2<=4);
                    break;
                
                case 3: do
                        {
                            System.out.println("       ***Quan ly danh sach Task***");
                            System.out.println("              1.Add Task");
                            System.out.println("              2.Display all ");
                            System.out.println("              3.Update ");
                            System.out.println("              4.Remove ");
                            System.out.println("Please choice!");
                            choice3=sc.nextInt();
                            switch(choice3){
                                case 1: 
                                    Task t=new Task();
                                    do{
                                        t.inputTask();
                                        if(list3.find(t.getId())!= -1){ System.out.println("The id has exists at:"+(list3.find(t.getId())));}
                                        }
                                        while(list3.find(t.getId())!=-1 );
                                        if(list3.addTask(t))
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
                                        if(list3.updateTask(idupdate))
                                            System.out.println("updated!");
                                        else 
                                            System.out.println("update fail!");
                                    break;
                                case 4:
                                    int idremove;
                                        System.out.println("enter id to remove!");
                                        sc=new Scanner(System.in);
                                        idremove=sc.nextInt();
                                        if(list3.removeTask(idremove))
                                            System.out.println("removed!");
                                        System.out.println("removed fail!");
                                        break;
                            }
                        }while(choice3<=4);
                        break;
                   
                case 4:
          
                             System.out.println("       ***Phan Cong Quan Ly***");
                             System.out.println("enter staff id:");
                             int staffid = sc.nextInt();
                             Staff s=list1.search(staffid);
                             if(s==null){ System.out.println("id has not exist!"); break;}
                             System.out.println("enter manager id:");
                             int managerid= sc.nextInt();
                             Manager m=list2.search(managerid);
                             if(m==null){ System.out.println("id has not exist!"); break;}
                             s.setManager(m);
                             break;
                             
                case 5:      int choice4 = 0;
                            do{
                                System.out.println("         ***Quan Ly Phan Cong Nhien Vu");
                                System.out.println("              1. add Misstion");
                                System.out.println("              2. update");
                                System.out.println("              3. remove");
                                System.out.println("              4. display all");
                                System.out.println("         please choice:");
                                choice4=sc.nextInt();
                                switch(choice4){
                                    case 1:
                                        boolean error=false;
                                        int wh = 0;
                                        System.out.println("enter staff id:");
                                        staffid = sc.nextInt();
                                        s = list1.search(staffid);
                                        if(s==null){ System.out.println("id has not exist!"); break;}
                                        System.out.println("enter task id:");
                                        int taskid = sc.nextInt();
                                        Task t = list3.search(taskid);
                                        if(t==null){ System.out.println("id has not exist!"); break;}
                                        
                                        do{
                                           try{
                                               sc=new Scanner(System.in);
                                               System.out.println("enter working hours:");
                                               wh= sc.nextInt();
                                               if(wh<0)
                                            throw new Exception();
                                        error=false;
                                        t.setTotalHours(t.getTotalHours()+wh);
                                        }catch(InputMismatchException e){
                                            System.out.println("format is wrong! try again!");
                                            error=true;
                                        }catch(Exception e1){
                                            System.out.println("salary must be greater than 0!");
                                            error=true;
                                        }
                                       }while(error);
                                        
                                        if(s!=null && t!=null) {
                                            Mis x = new Mis(s,t,wh);
                                            if(list4.addMis(x)) {
                                                System.out.println("Finish!");
                                            } else {
                                                System.out.println("ERROR!");
                                            }
                                        } else System.out.println("id is invalid");
                                        break;
                                    case 2: 
                                        System.out.println("enter staff id to update:");
                                        int idstaffupdate = sc.nextInt();
                                        System.out.println("enter task id need to update:");
                                        int idtaskupdate = sc.nextInt();

                                        if(list4.updateMisStaff(idstaffupdate)) {
                                            System.out.println("updated");
                                        }
                                        else System.out.println(" update fail");

                                        if(list4.updateMisTask(idtaskupdate)) {
                                            System.out.println(" updated");
                                        }
                                        else System.out.println(" update fail");
                                        break;
                                    case 3:
                                        System.out.println("enter staff id to remove:");
                                        int idStaffremove = sc.nextInt();
                                        System.out.println("enter task id to remove");
                                        int idtaskremove = sc.nextInt();
                                        if(list4.removeMisStaff(idStaffremove)){
                                            System.out.println("removed");
                                        }
                                        else System.out.println("pet fail");
                                        break;
                                    case 4: 
                                        
                                            list4.displayAll();
                                        break;
                                  
                                        
                                }
                            }while(choice4<=4);
                            break;
                                        
                                          
            }
        }while(choice<=5);
    }
}
