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
public class Manager extends Staff{
    long bonusSalary;

    public Manager() {
        super();
        bonusSalary=0;
    }

    public Manager(int id, String name, String gender, long basicSalary,long bonusSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
    }
    
    

    public long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }
    
    /*public void inputManager(){
        inputStaff();
        Scanner sc=new Scanner(System.in);
        System.out.println("input bonus:");
        bonusSalary=sc.nextLong();
    }*/
    
    /*public void outputManager(){
        outputStaff();
        System.out.println("bonus:"+bonusSalary);
    }*/

    @Override
    public void outputStaff() {
        super.outputStaff();
        System.out.println("bonus:"+bonusSalary);
    }

    @Override
    public void inputStaff() {
        boolean error=false;
        super.inputStaff();
        do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("input bonus salary:");
               bonusSalary= sc.nextLong();
               if(bonusSalary<0)
            throw new Exception();
        error=false;
        }catch(InputMismatchException e){
            System.out.println("format is wrong! try again!");
            error=true;
        }catch(Exception e2){
            System.out.println("salary must be greater than 0!");
            error=true;
        }
       }while(error);
    }
    
    
}
