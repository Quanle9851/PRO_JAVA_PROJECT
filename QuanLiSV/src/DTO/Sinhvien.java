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
public class Sinhvien {
    
    int Ma;
    String Ten;
    
    //contructor
    public Sinhvien(){
        Ma=0;
        Ten="";
    }
    public Sinhvien(int a,String b){
        Ma=a;
        Ten=b;
    }
    //geter
    public int getMa(){
        return Ma;
    }
    public String getTen(){
        return Ten;
    }
    //setter
    public void setMa(int Ma){
        if(Ma>0)
            this.Ma=Ma;
    }
    public void setTen(String Ten){
        if(Ten!=null && !Ten.isEmpty())
            this.Ten=Ten;
    }
     
    
    public void nhapSV(){
        boolean nhaptiep=false;
       do{
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma: ");
        this.Ma=sc.nextInt();
        if(Ma<0)
            throw new Exception();
        nhaptiep=false;
        }catch(InputMismatchException e){
            System.out.println("nhap sai format");
            nhaptiep=true;
        }catch(Exception e2){
            System.out.println("ma ko la so am");
            nhaptiep=true;
        }
        }while(nhaptiep);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("nhap ten");
                this.Ten=sc.nextLine();
                if(Ten.equals(""))
                   throw new Exception("ten ko de trong");
            }catch(Exception e3){
                System.out.println(e3.getMessage());
                nhaptiep=true;
            }
        }while(nhaptiep);
//System.out.println("nhap ten: ");
        //sc=new Scanner(System.in);
        //Ten=sc.nextLine();
        }
    
    public void xuatSV(){
        System.out.println("ma:"+Ma);
        System.out.println("Ten:"+Ten);
    }
}
