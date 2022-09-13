package DTO;

/**
 *
 * @author tu
 */
public class Log {
    Pet pet;
    Service service;

    public Log() {
        pet = null;
        service = null;
    }

    public Log(Pet pet, Service service) {
        this.pet = pet;
        this.service = service;
    }

    public Pet getPet() {
        return pet;
    }

    public Service getService() {
        return service;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
    public void output() {
        System.out.println("thong tin su dung dich vu");
        pet.output();
        service.output();
    }
    
}
