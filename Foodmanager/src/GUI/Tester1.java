/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.FoodList;
import DTO.Menu;
import java.util.ArrayList;

/**
 *
 * @author Bao
 */
public class Tester1 {
    public static void main(String[] args) {
        FoodList list = new FoodList();
        String filename = "FoodList.txt";
        list.loadfromFile(filename);
        ArrayList<String> options = new ArrayList<>();
        options.add("Add new food");
        options.add("Remove food by ID");
        options.add("Search food by name");
        options.add("Print the list in descending order of expired date");
        options.add("Save food to file");
        options.add("Quit");
        Menu menu = new Menu();
        int userChoice;
        do{
        userChoice = menu.getChoice(options);
            switch (userChoice){
                case 1:
                    list.addFood();
                    break;
                case 2: 
                    list.removeFood();
                    break;
                case 3: 
                    list.searchFood();
                    break;
                case 4: 
                    list.printAll();
                    break;
                case 5: 
                    list.savetoFile(filename);
                    break;
            }
        } while(userChoice >= 1 && userChoice < options.size());
        list.savetoFile(filename);
    }
}
