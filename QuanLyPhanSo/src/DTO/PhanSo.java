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
public class PhanSo {
    
    public int Tuso;
    public int Mauso;
    
    //contructor
    public PhanSo(){
        Tuso=0;
        Mauso=0;
    }
    public PhanSo(int Tuso,int Mauso){
        this.Tuso=Tuso;
        this.Mauso=Mauso;
    }
    
    public void nhapPS(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap tu so:");
        Tuso=sc.nextInt();
        System.out.println("nhap mau so:");
        Mauso=sc.nextInt();
    }
    
    public void xuatPS(){
        System.out.println("phan so:"+Tuso+"/"+Mauso);
    }
    
    public PhanSo congPS(int Tuso,int Mauso){
        int tmp1=this.Tuso*Mauso+this.Mauso*Tuso;
        int tmp2=this.Mauso*Mauso;
        PhanSo kq=new PhanSo(tmp1,tmp2);
        return kq;
    }
    
    public PhanSo truPS(int Tuso, int Mauso){
        int tmp1=this.Tuso*Mauso-this.Mauso*Tuso;
        int tmp2=this.Mauso*Mauso;
        PhanSo kq=new PhanSo(tmp1,tmp2);
        return kq;
    }
    
    public PhanSo nhanPS(int Tuso, int Mauso){
        int tmp1=this.Tuso*Tuso;
        int tmp2=this.Mauso*Mauso;
        PhanSo kq=new PhanSo(tmp1,tmp2);
        return kq;
    }
    
    public PhanSo chiaPS(int Tuso,int Mauso){
        int tmp1=this.Tuso*Mauso;
        int tmp2=Tuso*this.Mauso;
        PhanSo kq=new PhanSo(tmp1,tmp2);
        return kq;
    }
    
    public PhanSo rutgonPS(int tu,int mau){
        int uscln;
        int a=tu;
        int b=mau;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }uscln=a;
        int tmp1=tu/uscln;
        int tmp2=mau/uscln;
        PhanSo PS=new PhanSo(tmp1, tmp2);
        return PS;
    }
}
