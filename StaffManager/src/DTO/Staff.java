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
public class Staff {
    int id;
    String name;
    String gender;
    long basicSalary;
    Manager manager;

    public Staff() {
        id=0;
        name="";
        gender="female";
        basicSalary=0;
        manager=null;
    }

    public Staff(int id, String name, String gender, long basicSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    public void inputStaff(){
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
               System.out.println("input name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("ten ko de trong");
               error=false;
               }catch(Exception e3){
                System.out.println(e3.getMessage());
                error=true;
            }
       }while(error);
       
       do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input Student gender(male/female):");
                gender=sc.nextLine(); 
                if(!gender.matches("male") && !gender.matches("female") )
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println("Format wrong!");
               error=true;
           }
        }while(error);
       
       do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input basic salary:");
               basicSalary= sc.nextLong();
               if(basicSalary<0)
            throw new Exception();
        error=false;
        }catch(InputMismatchException e5){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e6){
            System.out.println("salary must be greater than 0!");
            error=true;
        }
       }while(error);
       
     }  
    
    public void outputStaff(){
         System.out.println("ID: "+id+"      NAME: "+name+"       GENDER: "+gender+"       BASIC SALARY: "+ basicSalary);
         if(manager!=null){
            System.out.println("Managed by:"+manager.getName());
         }
     }

    void output() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
