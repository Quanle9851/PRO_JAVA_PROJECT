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
public class Pet implements Comparable <Pet>{
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private Owner owner;

    public Pet(int id, String name, String birthday, String gender, Owner owner) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.owner = owner;
    }

    public Pet() {
        id=0;
        name="";
        birthday="";
        gender="";
        owner=null;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    public void inputPet(){
       boolean error=false;
       do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input pet id:");
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
               System.out.println("input Pet name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("error");
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
                System.out.println("Enter Pet birthday:");
                birthday=sc.nextLine();
                if(! birthday.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(birthday.equals(""))
                   throw new Exception("error!");
            }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
        }while(error);
       
       do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input Pet gender(male/Female):");
                gender=sc.nextLine(); 
                if(!gender.matches("male") && !gender.matches("female") )
                    throw new Exception();
                error=false;
            } catch (Exception e) {
               System.out.println("Pet's gender wrong format");
               error=true;
           }
        }while(error);
    }
     
    public void outputPet(){
        System.out.println("Pet's id:"+ id);
        System.out.println("Pet's name:"+ name);
        System.out.println("Pet's bd:"+ birthday);
        System.out.println("Pet's gender:"+ gender);
        if(owner!=null){
            System.out.println("chu so huu:");
            owner.outputOwner();
        }
    }

    @Override
    public int compareTo(Pet o) {
        if( id > o.id ) return 1;
        else if( id < o.id) return -1;
        return 0;
    }
    
        
}
