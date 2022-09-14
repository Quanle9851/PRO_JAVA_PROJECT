/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import DTO.InjectionList;
import DTO.StudentList;
import DTO.VaccineList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class VaccineManager {
    public static void main(String[] args) {
        String StudentFile = "student.txt";
        String VaccineFile = "vaccine.txt";
        String InjectionFile = "Injection2.txt"; 
        StudentList stulist = new StudentList(StudentFile);
        VaccineList vaclist = new VaccineList(VaccineFile);
        InjectionList injlist = new InjectionList(vaclist, stulist);
        injlist.loadfromFile(InjectionFile);
        
        //menu of option
        ArrayList<String> options = new ArrayList<>();
        options.add("Show all injection infomation  " );
        options.add("Add new injection");
        options.add("Remove an injection");
        options.add("Update an injection");
        options.add("Search injection ");
        options.add("Save to file");
        options.add("Quit");
        Menu menu = new Menu();
        int userChoice;
        do{
            userChoice = menu.getChoice(options);
            switch (userChoice){
                case 1: 
                    injlist.printAll();
                    break;
                case 2: 
                    injlist.addInjection();
                    break;
                case 3: 
                    injlist.removeInjection();
                    break;
                case 4: 
                    injlist.updateInjection();
                    break;
                case 5: 
                    injlist.searchByStuID();
                    break;
                case 6: 
                    injlist.savetoFile(InjectionFile);
                    break;
            }
        } while(userChoice >= 1 && userChoice < options.size());
    }
     
}

