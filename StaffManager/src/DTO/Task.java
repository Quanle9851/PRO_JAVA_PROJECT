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
public class Task {
    int id;
    String title;
    String beginDate;
    String endDate;
    int totalHours;

    public Task() {
    }

    public Task(int id, String title, String beginDate, String endDate, int totalHours) {
        this.id = id;
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.totalHours = totalHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }
    
    public void inputTask(){
        boolean error=false;
        do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input id:");
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
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input title:");
               title=sc.nextLine();
               if(title.equals(""))
                   throw new Exception("ten ko de trong");
               error=false;
               }catch(Exception e3){
                System.out.println(e3.getMessage());
                error=true;
            }
       }while(error);
        
        do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter begin date:");
                beginDate=sc.nextLine();
                if(! beginDate.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(beginDate.equals(""))
                   throw new Exception("ten khong de trong!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
        
        do{
            try{
                String pattern= "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter end date:");
                endDate=sc.nextLine();
                if(! endDate.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(endDate.equals(""))
                   throw new Exception("ten khong de trong!");
            }catch(Exception e5){
                System.out.println(e5.getMessage());
                error=true;
            }
        }while(error);
    }
    
    public void outputTask(){
        System.out.println(id+"  "+title);
        System.out.println("Begin Date: "+beginDate);
        System.out.println("End Date: "+endDate);
        System.out.println("Total Hours:"+totalHours);
    }
}
