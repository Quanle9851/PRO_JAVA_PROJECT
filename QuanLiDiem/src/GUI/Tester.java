/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Diem;

/**
 *
 * @author Bao
 */
public class Tester {
    public static void main(String[] args){
        Diem A=new Diem(1,3);
        Diem B=new Diem(2,3);
        
        A.XuatDiem();
        B.XuatDiem();
        
        double d=A.getDistance(B.getX(),B.getY());
        System.out.println("khoang cach:"+d);
        
        double d2=B.getDistance(A.getX(),A.getY());
        System.out.println("khoang cach:"+d2);
    }
}
