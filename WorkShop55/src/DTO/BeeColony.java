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
public class BeeColony extends Colony implements Role{
    
    private String type;

    public BeeColony() {
        
    }
    public BeeColony(int size, String place,String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "The colony's type is: " + type + "\nSize is about: " + size + "\nThe place is: " + place;
    }
    
    
    
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees.");  
    }
    
    
    
}

