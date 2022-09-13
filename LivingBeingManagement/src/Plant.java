/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class Plant extends LivingBeing{
    int year;
    
    public Plant(){
        super();
    }

    public Plant(int year, String name) {
        super(name);
        this.year = year;
    }
    
    
    
}
