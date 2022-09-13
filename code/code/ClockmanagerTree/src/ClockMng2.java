/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class ClockMng2 {
    public static void main(String[] args){
        String filename = "ClockList1.txt";
        ClockList list= new ClockList();
        list.loadfromFile(filename);
        menu mnu = new menu();
        mnu.add("Add new clock");
        mnu.add("Remove a clock");
        mnu.add("Update a clock");
        mnu.add("List all clock");
        mnu.add("Lis all clock in range");
        mnu.add("Quit");
        int userChoice;
        do{
            userChoice = mnu.getUserChoice();
            switch (userChoice){
                case 1: list.addClock(); break;
                case 2: list.removeClock();break;
                case 3: list.updateClock();break;
                case 4: list.output(); break;
                case 5: list.printPrice(); break;
            }
        }
        while (userChoice >=0 && userChoice < 6);
        list.savetoFile(filename);
    } 
}
