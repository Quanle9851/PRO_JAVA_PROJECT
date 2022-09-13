/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class Dog implements Comparable<Dog>{
    int id;
    String name;

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{ " + "id=" +id+ ", name"
    }

    @Override
    public int compareTo(Dog o) {
        if( id > o.id) return 1;
        else if(id < o.id) return -1;
        return 0;
    }
    
}
