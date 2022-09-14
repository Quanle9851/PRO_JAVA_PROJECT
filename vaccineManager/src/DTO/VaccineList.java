/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class VaccineList extends ArrayList<Vaccine>{
    public VaccineList(String filename){
        try {
            File f = new File(filename);
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] split = data.split(";");
            String ID = split[0];
            String name = split[1];     
            this.add(new Vaccine(ID, name));
            }
        } catch (Exception e) {
                System.out.println(e);
        }         
    }

    public boolean isIDExist(String ID){
        return search(ID) != null;
    }
      
    public Vaccine search(String ID) {
        for (Vaccine x : this) {
            if (x.getVaccineID().equals(ID)) {
                return x;
            }
        }
        return null;
    }
    
        public void printList(){
        this.forEach((x) -> {
            System.out.println(x.toString());});
            System.out.println("Total: " + this.size() + " item(s).");
    }
}
