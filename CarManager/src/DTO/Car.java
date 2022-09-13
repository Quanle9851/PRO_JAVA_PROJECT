/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Bao
 */
public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;
    
    //contructor
    public Car(){
        Colour="";
        EnginePower=0;
        Convertible=false;
        ParkingBrake=false;
    }
    public Car(String Colour,int EnginePower,boolean Convertible, boolean ParkingBrake){
        this.Colour=Colour;
        this.EnginePower=EnginePower;
        this.Convertible=Convertible;
        this.ParkingBrake=ParkingBrake;
    }
    
    //getter
    public String getColour(){
        return Colour;
    } 
    public int getEnginPower(){
        return EnginePower;
    }
    public boolean getConvertible(){
        return Convertible;
    }
    public boolean getParkingBrake(){
        return ParkingBrake;
    }
    
    //setter
    public void setColour(String Colour){
        this.Colour=Colour;
    }
    public void setEnginePower(int EnginePower){
        this.EnginePower=EnginePower;
    }
    public void getConvertible(boolean Convertible){
        this.Convertible=Convertible;
    }
    public void getParkingBrake(boolean ParkingBrake){
        this.ParkingBrake=ParkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You have pressed the start button!");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button!");
    }
    public void output(){
        System.out.println("Colour:"+Colour);
        System.out.println("EnginePower:"+EnginePower);
        System.out.println("Convertible:"+Convertible);
        System.out.println("ParkingBrake:"+ParkingBrake);
    }
    
}
