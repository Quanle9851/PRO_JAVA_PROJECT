/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Student {
    private String id;
    private String name;
    private String address;
    private String gender;
    private Campus campus;

    public Student() {
        id="";
        name="";
        address="";
        gender="";
        campus=null;
    }

    public Student(String id, String name, String address, String gender, Campus campus) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.campus = campus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
    
    public void inputStudent(){
        boolean error=false;
        
        do{
            try{
                String pattern= "[A-Z][A-Z][0-9]{6}";  
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter ID Student:");
                id=sc.nextLine();
                if(! id.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(id.equals(""))
                   throw new Exception("ID has not empty!");
            }catch(Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
        }while(error);
        
        do{
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input name:");
               name=sc.nextLine();
               if(name.equals(""))
                   throw new Exception("name can not empty!");
               error=false;
               }catch(Exception e){
                System.out.println(e.getMessage());
                error=true;
            }
       }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Student address:");
                address=sc.nextLine();
                if(address.equals(""))
                    throw new Exception("address can not empty!");
                error=false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
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
    }
    
     public void outputStudent(){
         System.out.println("ID: "+id+"      NAME: "+name+"         ADDRESS: "+address+"       GENDER: "+gender);
         if(campus!=null){
            System.out.println("CAMPUS: "+campus.getName());
         }
     }
}
