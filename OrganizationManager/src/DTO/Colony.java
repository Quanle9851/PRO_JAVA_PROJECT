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
public class Colony extends Organization{
    protected String place;

    public Colony(){
        super();
        place="";
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }
    
    public void grow(){
        System.out.println("an annual cycle of growth that begins in spring");
    }
    
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
    
    @Override
    public String toString(){
         return "The colony size is" + size + "\n,The colony's place is " + place ;
    }
}
