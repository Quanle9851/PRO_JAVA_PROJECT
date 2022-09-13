
import java.util.LinkedList;
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
public class ClockList extends LinkedList<Clock>{
    Scanner sc=new Scanner(System.in);
    public void addClock(){
        Clock clk=new Clock();
        clk.input();
        if(this.add(clk)==true)
            System.out.println("add successfully.");
        else
            System.out.println("add failed!");
    }
    private int search(String id){
        return this.indexOf(new Clock(id));
    }
    public void removeClock(){
        String id;
        System.out.println("Input clock id which will be removed:");
        id=sc.nextLine();
        int pos=search(id);
        if(pos<0) System.out.println("not found!");
        else{
            this.remove(pos);
            System.out.println("Clock"+id+"was deleted");
        }
    }
    public void updateClock() {
        String id; // id of updated clock
        System.out.print("Input clock id which will be updated: ");
        id = sc.nextLine(); int pos =search (id);
        if (pos<0) System.out.println("Not found!");
        else{
            this.get (pos). input ();
            System.out.println("clock + id + was updated.");

        }
    }
    public void print () {
        for (Clock clk : this) {
            System.out.println(clk);
        }
    }

    public void printPrice () { 
        int pricel, price2;
        System.out.println("Input price range.");
        System.out.print("Price 1:");
        pricel = Integer.parseInt(sc.nextLine());
        System.out.print("Price 2: ");
        price2 = Integer.parseInt(sc.nextLine());
        if (pricel > price2) {
            int t = pricel;
            pricel= price2;
            price2= t;
        }
        for (Clock clk : this) {
            int price=clk.getPrice();
            if(price>=pricel && price<=price2)
                System.out.println(clk);
        }
    }
}