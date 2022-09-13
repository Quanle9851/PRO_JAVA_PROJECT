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
public class Food implements Comparable<Food>{
    String ID;
    String Name;
    float weight;
    String type;
    String place;
    String expDate;
    
    public Food() {        
    }
    public Food(String ID, String Name, float weight, String type, String place, String expDate) {
        this.ID = ID;
        this.Name = Name;
        this.weight = weight;
        this.type = type;
        this.place = place;
        this.expDate = expDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpdate(String expDate) {
        this.expDate = expDate;
    }
    @Override
    public int compareTo(Food o){
          if(getExpDate() == null || o.getExpDate()==null)
            return 0;
        return o.getExpDate().compareTo(getExpDate());
    }
    @Override
    public String toString() {
        return "ID=" + ID + ", Name=" + Name + ", weight=" + weight + "(kg), type=" + type + ", place=" + place + ", expdate=" + expDate;
    }
}
