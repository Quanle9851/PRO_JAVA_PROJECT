/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import DTO.Input;
import java.util.ArrayList;

/**
 *
 * @author Bao
 */
public class Menu {
    public int getChoice(ArrayList options){
        System.out.println("\nWelcome to Vaccine Management - <SE150533 - Le Minh Quan>"); 
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i+1) + ". " + options.get(i));
        }        
        int choice = Input.inputInt("Input your choice: ", 1, options.size());
        return choice;
    }
}
