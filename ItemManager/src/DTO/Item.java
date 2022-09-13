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
public class Item {
    protected int value;
    protected String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
        value=0;
        creator="";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void output(){
        System.out.println("Value:"+value);
        System.out.println("Creator:"+creator);
    }
    
    public void input(){
        boolean error=false;
        do{
           try{
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter value:");
               value=sc.nextInt();
               if(value<=0)
                   throw new Exception();
               error=false;
               }catch(InputMismatchException e2){
                    System.out.println("entered wrong format!!");
                    error=true;
               }catch(Exception e){
                    System.out.println("value must be greater than 0!!");
                    error=true;
               }
        }while(error);
        
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter creator:");
                creator=sc.nextLine();
                if(creator.equals("")){
                    throw new Exception("creators are not empty!!");
                }
                error=false;
            }catch(Exception e2){
                System.out.println(e2.getMessage());
                error=true;
            }
        }while(error);
    }
    
}
