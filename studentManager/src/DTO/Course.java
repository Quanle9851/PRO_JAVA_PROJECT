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
public class Course {
    private String code;
    private String name;
    private long creadits;

    public Course() {
        code="";
        name="";
        creadits=0;
    }

    public Course(String code, String name, long creadit) {
        this.code = code;
        this.name = name;
        this.creadits = creadit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreadit() {
        return creadits;
    }

    public void setCreadits(long creadit) {
        this.creadits = creadit;
    }
    
    public void inputCourse(){
        boolean error=false;
        
        do{
            try{
                String pattern= "[A-Z]{3}[0-9]{3}";  
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter code course(format:PRO192):");
                code=sc.nextLine();
                if(! code.matches(pattern))
                    throw new Exception("format is wrong!");
                error=false;
                if(code.equals(""))
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
               System.out.println("input creadits:");
               creadits= sc.nextInt();
               if(creadits<0)
            throw new Exception();
        error=false;
        }catch(InputMismatchException e){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e2){
            System.out.println("creadits must be greater than 0!");
            error=true;
        }
       }while(error);
    }
    
    public void outputCourse(){
        System.out.println("   *COURSE*  ");
        System.out.println("CODE: "+code);
        System.out.println("NAME: "+name);
        System.out.println("CREADITS:"+creadits);
    }
}
