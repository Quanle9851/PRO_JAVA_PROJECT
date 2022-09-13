
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyễn Đoàn Tú
 */
public class Clock {
    String id="",manufact="";
    int price=0, guarantee=0;

    public Clock() {
        id="";
        manufact="";
        price=0;
        guarantee=0;
    }
    public Clock(String id){
        this.id=id;
    }
    public Clock(String id, String manufact,int price,int guarantee){
        this.id=id;
        this.manufact=manufact;
        this.price=price;
        this.guarantee=guarantee;
    }
    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Clock)obj).id);
    }
    

    public String getId() {
        return id;
    }

    public String getManufact() {
        return manufact;
    }

    public int getPrice() {
        return price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public String toString() {
        return id+", "+manufact+", "+price+", "+ guarantee;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Id");
        id=sc.nextLine();
        System.out.println("Input Manufact:");
        manufact=sc.nextLine();
        System.out.println("Input price:");
        price=sc.nextInt();
        System.out.println("guarantee");
        guarantee=sc.nextInt();
    }
    
}
