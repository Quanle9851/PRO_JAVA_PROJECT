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
public class Campus {
    private int code;
    private String name;
    private String address;

    public Campus(int code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }

    public Campus() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
    
    public void inputCampus(){
        boolean error=false;
        do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input code:");
               code= sc.nextInt();
               if(code<0)
            throw new Exception();
        error=false;
        }catch(InputMismatchException e){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e2){
            System.out.println("code must be greater than 0!");
            error=true;
        }
       }while(error);
        
        do{
           try{
              
               Scanner sc=new Scanner(System.in);
               System.out.println("input Campus name:");
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
               System.out.println("input Campus address:");
               address=sc.nextLine();
               if(address.equals(""))
                   throw new Exception("address can not empty!");
               error=false;
               }catch(Exception e4){
                System.out.println(e4.getMessage());
                error=true;
            }
       }while(error); 
    }
    
    public void outputCampus(){
        System.out.println("CODE: " +code);
        System.out.println("NAME: " +name);
        System.out.println("ADDRESS: "+address);
    }
}
