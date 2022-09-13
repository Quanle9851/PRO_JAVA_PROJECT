
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class DogList {
    TreeSet<Dog> t;
    public DogList(){
        t = new TreeSet<>();
    }
    public boolean addDog(Dog d){
        return t.add(d);
    }
}
