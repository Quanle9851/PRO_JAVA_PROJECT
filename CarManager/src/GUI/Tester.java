/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Car;

/**
 *
 * @author Bao
 */
public class Tester {
     public static void main(String[] args){
        Car c=new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        Car c2=new Car("black",150,true,true);
        c2.pressAcceleratorButton();
        c2.setColour("White");
        System.out.println("Colour of c2:"+c2.getColour());
        c2.output();
    }       
}
