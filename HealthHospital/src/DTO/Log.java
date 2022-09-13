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
public class Log {
    Pet pet;
    Service service;
    String date;

    public Log(Pet pet, Service service) {
        this.pet = pet;
        this.service = service;
    }

    public Log() {
        pet=null;
        service=null;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    public void output(){
        System.out.println("thong tin su dung dich vu");
        if(pet!=null && service!=null){
        pet.outputPet();
        service.outputService();
        }
    }
}
