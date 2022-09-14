/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.PhanSo;

/**
 *
 * @author Bao
 */
public class Tester {
    public static void main(String[] args){
        PhanSo x=new PhanSo();
        x.nhapPS();
        x.xuatPS();
        
        PhanSo y=new PhanSo();
        y.nhapPS();
        y.xuatPS();
        
        PhanSo c=x.congPS(y.Tuso,y.Mauso);
        c.rutgonPS(c.Tuso,c.Mauso);
        c.xuatPS();
        
        PhanSo t=x.truPS(y.Tuso,y.Mauso);
        t.rutgonPS(c.Tuso,c.Mauso);
        t.xuatPS();
        
        PhanSo n=x.nhanPS(y.Tuso,y.Mauso);
        n.rutgonPS(c.Tuso,c.Mauso);
        n.xuatPS();
        
        PhanSo h=x.chiaPS(y.Tuso,y.Mauso);
        h.rutgonPS(c.Tuso,c.Mauso);
        h.xuatPS();
    }
}
