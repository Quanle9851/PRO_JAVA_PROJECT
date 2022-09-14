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
public class Diem {
    private double x,y;
    
    //contructor
    public Diem(){
        x=0;
        y=0;
    }
    public Diem(float x,float y){
        this.x=x;
        this.y=y;
    }
    
    public void NhapDiem(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap hoanh do:");
        x=sc.nextFloat();
        System.out.println("nhap tung do:");
        y=sc.nextFloat();
    }
    
    public void XuatDiem(){
        System.out.println("diem A("+x+";"+y+")");
    }
    
    public double getDistance(double x, double y){
        double d=Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        return d;        
    }
    
    //hàm này để lấy x từ point
    public double getX(){
        return x;
    }
    //hàm này để lấy y từ point
    public double getY(){
        return y;
    }
    //hàm này để cập nhật x của point
    public void setX(double x){
        this.x=x;
    }
    //hàm này để cập nhật y của point
    public void setY(double y){
        this.y=y;
    }    
}
