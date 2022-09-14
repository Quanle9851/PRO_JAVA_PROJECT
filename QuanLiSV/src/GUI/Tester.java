/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Sinhvien;

/**
 *
 * @author Bao
 */
public class Tester {
    public static void main(String[] args){
        Sinhvien x=new Sinhvien();//dung bien x de goi ham
        x.nhapSV();//x goi ham nhapSV
        x.xuatSV();//x goi ham xuatSV
        
        //nhap xuat cho sien sinh thu 2
        Sinhvien y=new Sinhvien();
        y.nhapSV();
        y.xuatSV(); 
        
        //khai bao bien z,de chua sinh vien thu ba
        int a=100;
        String b="Chi Pheo";
        Sinhvien z=new Sinhvien(a,b);
        z.xuatSV();
    }
}
