
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class ClockList extends TreeSet<Clock>{
    public ClockList(){
        super(Clock.comparator);
    }
    public Clock search(String ID){
        return this.ceiling(new Clock(ID));
    }
    
    public void output(){
        Iterator it = this.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("total:"+this.size());
    }
    
    public void addClock(){
        Clock clk =new Clock();
        clk.input();
        if(this.add(clk)==true)
            System.out.println("Added Successfully");
        else
            System.out.println("Added failed!");
    }
    public void removeClock(){
        String id;
        System.out.println("Input clock id which will be removed:");
        Scanner sc = new Scanner(System.in);
        id=sc.nextLine();
        Clock ck = search(id);
        if (ck==null || !ck.getID().equals(id))
            System.out.println("CLOCK "+id+" does not exist");
        else {
            this.remove(ck);
            System.out.println("Clock"+id+"was delected.");
        }
    }
    public void updateClock(){
        String id;
        System.out.println("Intput clock id which will be updated:");
        Scanner sc = new Scanner(System.in);
        id=sc.nextLine();
        Clock ck = search(id);
         if (ck==null || !ck.getID().equals(id))
            System.out.println("CLOCK "+id+" does not exist");
        else {
            ck.update(id);
            System.out.println("Clock"+id+"was updated.");
        }
    }
    public void printPrice(){
        Scanner sc= new Scanner(System.in);
        int price1, price2;
        System.out.println("input price range.");
        System.out.println("price 1:");
        price1=Integer.parseInt(sc.nextLine());
        System.out.println("price 2:");
        price2=Integer.parseInt(sc.nextLine());
        if (price1 > price2){
            int t = price1;
            price1=price2;
            price2=t;
        }
        for (Clock clk : this){
            int price = clk.getPrice();
            if ( price >= price1 && price <= price2)
                System.out.println(clk);
        }
    }
    
    public void loadfromFile (String filename){
        try {
            File f = new File(filename);
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] split = data.split(",");
                String ID = split[0];
                String manufact = split[1];
                int price = Integer.parseInt(split[2]);
                this.add(new Clock(ID, manufact, price));
            }
        } catch (Exception e) {
                System.out.println(e);
            } 
    }
    
    public void savetoFile(String filename){
        if (this.isEmpty()) { 
            System.out.println("The list is Empty!");
        } else {
            try {
                File f = new File(filename);
                FileWriter fw = new FileWriter(f);
                BufferedWriter pw = new BufferedWriter(fw);
                for (Clock e : this) {
                   
                    fw.write(e.getID() + "," + e.getManufacturer() + "," + e.getPrice());
                    fw.write("\n");
                }
                pw.close();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }      
    }
}
