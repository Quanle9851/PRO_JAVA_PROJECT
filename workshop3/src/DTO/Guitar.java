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
public class Guitar {
    String serialNumber,builder,model,backWood,topWood;
    int price;
    
    //contructor
    public Guitar(){
        serialNumber="";
        price=0;
        builder="";
        model="";
        backWood="";
        topWood="";
    }
    public Guitar(String serialNumber,int price,String builder,String model,String backWood,String topWood){
        this.serialNumber=serialNumber;
        this.price=price;
        this.builder=builder;
        this.model=model;
        this.backWood=backWood;
        this.topWood=topWood;
    }
    
    //getters
    public String getserialNumber(){
        return serialNumber;
    }
    public int getprice(){
        return price;
    }
    public String getbuilder(){
        return builder;
    }
    public String getmodel(){
        return model;
    }
    public String getbackWood(){
        return backWood;
    }
    public String gettopWood(){
        return topWood;
    }
    
    //setters
    public void setserialNumber(String serialNumber){
        this.serialNumber=serialNumber;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void setbuilder(String builder){
        this.builder=builder;
    }
     public void setmodel(String model){
        this.model=model;
    }
      public void setbackWood(String backWood){
        this.backWood=backWood;
    }
       public void settopWood(String topWood){
        this.topWood=topWood;
    }
       
    public void createSound(){
        System.out.println("serial Number"+serialNumber);
        System.out.println("Price:"+price);
        System.out.println("builder:"+builder);
        System.out.println("model:"+model);
        System.out.println("back Wood:"+backWood);
        System.out.println("top Wood:"+topWood);
    }
}
