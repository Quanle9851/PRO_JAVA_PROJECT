/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author Bao
 */
public class Menu {
     public int getChoice(ArrayList options){
        Enter input = new Enter();
        System.out.println("\nWelcome to Food Management - @2021 by <SE150533-LÊ MINH QUÂN>"); 
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i+1) + ". " + options.get(i));
        }
        int choice = input.EnterInteger("please enter your choice: ", 1, options.size());
        return choice;
    }
}
