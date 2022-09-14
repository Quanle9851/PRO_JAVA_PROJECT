/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Campus;
import DTO.CampusList;
import DTO.Course;
import DTO.CourseList;
import DTO.Lea;
import DTO.LeaList;
import DTO.Student;
import DTO.StudentList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class ManagerStudent {
    public static void main(String[] args){
        StudentList list1=new StudentList();
        CampusList list2=new CampusList();
        CourseList list3=new CourseList();
        LeaList list4 = new LeaList();
        int choice=0;
        int choice1=0;
        int choice2=0;
        int choice3=0;
        Scanner sc=new Scanner(System.in);
        
        do{
            
            System.out.println("          ***QUAN LY HOC SINH***");
            System.out.println("      1.Quan Ly Danh Sach Sinh Vien");
            System.out.println("      2.Quan Ly Danh Sach Truong");
            System.out.println("      3.Quan Ly Danh Sach Mon Hoc");
            System.out.println("      4.dang ky nhap hoc");
            System.out.println("      5.dang ky mon hoc");
            System.out.println("Please choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach sinh vien***");
                            System.out.println("              1.Add Student");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("Please choice:");
                            choice1=sc.nextInt();
                            switch(choice1){
                                case 1:
                                    Student s=new Student();
                                    do{
                                    s.inputStudent();
                                    if(list1.find(s.getId())!= -1){
                                        System.out.println("The id has exists at:"+(list1.find(s.getId())));}
                                    }
                                    while(list1.find(s.getId())!=-1 );
                                    if(list1.addStudent(s))
                                        System.out.println("addes!");
                                    else System.out.println("add fail!");
                                    break;
                                case 2:
                                    list1.displayAll();
                                    break;
                                case 3: 
                                    String idupdate;
                                    sc=new Scanner(System.in);
                                    System.out.println("<Enter id to update>");
                                    idupdate=sc.nextLine();
                                    if(list1.updateStudent(idupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    String idremove;
                                    sc=new Scanner(System.in);
                                    System.out.println("enter id to remove!");
                                    idremove=sc.nextLine();
                                    if(list1.removeStudent(idremove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                            }
                        }while(choice1<=4);
                        break;
                        
                case 2: do
                        {
                            System.out.println("      ***Quan Ly Danh Sach Truong***");
                            System.out.println("              1.Add Campus");
                            System.out.println("              2.Display all");
                            System.out.println("              3.Update");
                            System.out.println("              4.remove");
                            System.out.println("        Please choice:");
                            choice2=sc.nextInt();
                            switch(choice2){
                                case 1:
                                    Campus cp=new Campus();
                                    do{
                                    cp.inputCampus();
                                    if(list2.find(cp.getCode())!= -1){
                                        System.out.println("The code has exists at:"+(list2.find(cp.getCode())));}
                                    }
                                    while(list2.find(cp.getCode())!=-1 );
                                    if(list2.addCampus(cp))
                                        System.out.println("addes!");
                                    else System.out.println("add fail!");
                                    break;
                                case 2:
                                    list2.displayAll();
                                    break;
                                case 3: 
                                    int codeupdate;
                                    System.out.println("<Enter code to update>");
                                    codeupdate=sc.nextInt();
                                    if(list2.updateCampus(codeupdate))
                                        System.out.println("updated!");
                                    else 
                                        System.out.println("update fail!");
                                    break;
                                case 4:
                                    int coderemove;
                                    System.out.println("enter code to remove!");
                                    coderemove=sc.nextInt();
                                    if(list2.removeCampus(coderemove))
                                        System.out.println("removed!");
                                    else System.out.println("removed fail!");
                                    break;
                                    }
                            }while(choice2<=4);
                    break;
                
                case 3: do
                        {
                            System.out.println("       ***Quan ly danh sach mon hoc***");
                            System.out.println("              1.Add Course");
                            System.out.println("              2.Display all ");
                            System.out.println("              3.Update ");
                            System.out.println("              4.Remove ");
                            System.out.println("Please choice!");
                            choice3=sc.nextInt();
                            switch(choice3){
                                case 1: 
                                    Course c=new Course();
                                    do{
                                        c.inputCourse();
                                        if(list3.find(c.getCode())!= -1){ System.out.println("The id has exists at:"+(list3.find(c.getCode())));}
                                        }
                                        while(list3.find(c.getCode())!=-1 );
                                        if(list3.addCourse(c))
                                            System.out.println("addes!");
                                        else System.out.println("add fail!");
                                    break;
                                case 2: 
                                    list3.displayAll();
                                    break;
                                case 3:
                                    String codeupdate;
                                        System.out.println("<Enter code to update>");
                                        sc=new Scanner(System.in);
                                        codeupdate=sc.nextLine();
                                        if(list3.updateCourse(codeupdate))
                                            System.out.println("updated!");
                                        else 
                                            System.out.println("update fail!");
                                    break;
                                case 4:
                                    String coderemove;
                                        System.out.println("enter code to remove!");
                                        sc=new Scanner(System.in);
                                        coderemove=sc.nextLine();
                                        if(list3.removeCourse(coderemove))
                                            System.out.println("removed!");
                                        System.out.println("removed fail!");
                                        break;
                            }
                        }while(choice3<=4);
                        break;
                   
                case 4:
          
                             System.out.println("       ***Dang ky nhap hoc***");
                             System.out.println("enter Student id:");
                             sc=new Scanner(System.in);
                             String studentid = sc.nextLine();
                             Student s=list1.search(studentid);
                             if(s==null){ System.out.println("id has not exist!"); break;}
                             System.out.println("enter Campus id:");
                             int campusid= sc.nextInt();
                             Campus cp=list2.search(campusid);
                             if(cp==null){ System.out.println("id has not exist!"); break;}
                             s.setCampus(cp);
                             break;
                             
                case 5:      int choice4 = 0;
                            do{
                                System.out.println("         ***dang ky khoa hoc***");
                                System.out.println("              1. Course registration");
                                System.out.println("              2. update");
                                System.out.println("              3. remove");
                                System.out.println("              4. display all");
                                System.out.println("         please choice:");
                                choice4=sc.nextInt();
                                switch(choice4){
                                    case 1:
                                        boolean error=false;
                                        System.out.println("enter student id:");
                                        sc=new Scanner(System.in);
                                        studentid = sc.nextLine();
                                        s = list1.search(studentid);
                                        if(s==null){ System.out.println("id has not exist!"); break;}
                                        System.out.println("enter course code:");
                                        sc=new Scanner(System.in);
                                        String courseid = sc.nextLine();
                                        Course c = list3.search(courseid);
                                        if(c==null){ System.out.println("code has not exist!"); break;}
                                        
                                        if(s!=null && c!=null) {
                                            Lea x = new Lea(s,c);
                                            if(list4.addLea(x)) {
                                                System.out.println("Finish!");
                                            } else {
                                                System.out.println("ERROR!");
                                            }
                                        } else System.out.println("id is invalid");
                                        break;
                                    case 2: 
                                        System.out.println("enter student id to update:");
                                        sc=new Scanner(System.in);
                                        String idstudentupdate = sc.nextLine();
                                        System.out.println("enter course code to update:");
                                        sc=new Scanner(System.in);
                                        String codecourseupdate = sc.nextLine();

                                        if(list4.updateLeaStudent(idstudentupdate)) {
                                            System.out.println("student updated");
                                        }
                                        else System.out.println("update fail!!");

                                        if(list4.updateLeaCourse(codecourseupdate)) {
                                            System.out.println("course updated");
                                        }
                                        else System.out.println("update fail!!");
                                        break;
                                    case 3:
                                        System.out.println("enter student id to remove:");
                                        sc=new Scanner(System.in);
                                        String idremove = sc.nextLine();
                                        System.out.println("enter course id to remove");
                                        sc=new Scanner(System.in);
                                        String coderemove = sc.nextLine();
                                        if(list4.removeLeaStudent(idremove)){
                                            System.out.println("compleate removed");
                                        }
                                        else System.out.println("remove fail");
                                        break;
                                    case 4: 
                                        
                                            list4.displayAll();
                                        break;
  
                                        
                                }
                            }while(choice4<= 4);
                            break;
                                        
                                          
            }
        }while(choice<=5);
    }
}
