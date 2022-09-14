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
public class Mis {
    Staff staff;
    Task task;
    int workingHours;

    public Mis() {
        staff=null;
        task=null;
        workingHours=0;
    }

    public Mis(Staff staff, Task task, int workingHours) {
        this.staff = staff;
        this.task = task;
        this.workingHours= workingHours;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    
    
    
     public void output(){
        System.out.println("thong tin su dung dich vu");
        if(staff!=null && task!=null){
        staff.outputStaff();
        task.outputTask();
        System.out.println("Working Hours:"+workingHours);
        }
        else System.out.println("empty!");
     }
}
