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
import DTO.TaskList;
import DTO.StaffList;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Tester2 {
    public static void main(String[] agrs){
        StaffList list1=new StaffList();
        TaskList list2=new TaskList();
        ManagerList list3=new ManagerList();
        int choice=0;
        int choice2=0;
        int choice3=0;
        Scanner sc=new Scanner(System.in);
        
        // ham menu quan ly danh sach Pet
        do
        {
            System.out.println("***Quan Ly Danh Sach Staff***");
            System.out.println("1.Add Staff");
            System.out.println("2.Display all");
            System.out.println("3.Update");
            System.out.println("4.remove");
            System.out.println("Please choice:");
            choice=sc.nextInt();
            switch(choice){
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
        }while(choice<=4);
        
        //ham Menu quan ly danh sach Owner 
    do
    {
        System.out.println("***Quan ly danh sach Task***");
        System.out.println("1.Add Task");
        System.out.println("2.Display all ");
        System.out.println("3.Update ");
        System.out.println("4.Remove ");
        System.out.println("Please choice!");
        choice2=sc.nextInt();
        switch(choice2){
            case 1: 
                Task t=new Task();
                do{
                    t.inputTask();
                    if(list2.find(t.getId())!= -1){ System.out.println("The id has exists at:"+(list2.find(t.getId())));}
                    }
                    while(list2.find(t.getId())!=-1 );
                    if(list2.addTask(t))
                        System.out.println("addes!");
                    else System.out.println("add fail!");
                break;
            case 2: 
                list2.displayAll();
                break;
            case 3:
                int idupdate;
                    System.out.println("<Enter id to update>");
                    sc=new Scanner(System.in);
                    idupdate=sc.nextInt();
                    if(list2.updateTask(idupdate))
                        System.out.println("updated!");
                    else 
                        System.out.println("update fail!");
                break;
            case 4:
                int idremove;
                    System.out.println("enter id to remove!");
                    sc=new Scanner(System.in);
                    idremove=sc.nextInt();
                    if(list2.removeTask(idremove))
                        System.out.println("removed!");
                    System.out.println("removed fail!");
                    break;
        }
    }while(choice2<=4);
    
    do
        {
            System.out.println("***Quan Ly Danh Sach manager***");
            System.out.println("1.Add Manager");
            System.out.println("2.Display all");
            System.out.println("3.Update");
            System.out.println("4.remove");
            System.out.println("Please choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    Staff s=new Manager();
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
        }while(choice<=4);
                
}
}
