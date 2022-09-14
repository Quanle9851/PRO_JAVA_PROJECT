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
public class Lea {
    Student student;
    Course course;
    

    public Lea() {
        student=null;
        course=null;
    }

    public Lea(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    
    
     public void output(){
        System.out.println("Thong tin dang ky mon hoc");
        if(student!=null && course!=null){
        student.outputStudent();
        course.outputCourse();
        }
        else System.out.println("empty!");
     }
}
