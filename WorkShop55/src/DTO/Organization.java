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
public abstract class Organization {

   protected int size;

    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Organization() {
    }
    

    public Organization(int size) {
        this.size = size;
    }
    
//    public abstract void communicateByTool();
    abstract public void communicateByTool();
      
    
    @Override
    public String toString() {
        return "The organization’s size: " + size;
    }

    public void createWorker() {
    }
    
}
