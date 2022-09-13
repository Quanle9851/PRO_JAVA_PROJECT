/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Book {
   private String id;
   private String title;
   private String publisher;
   
   //contructor
   public Book(){
       id="";
       title="";
       publisher="";
   }
   public Book(String a,String b,String c){
       id=a;
       title=b;
       publisher=c;
   }
   
   //getter
   public String getid(){
       return id;
   }
   public String gettitle(){
       return title;
   }
   public String getpublisher(){
       return publisher;
   }
   
   //setter
   public void setid(String id){
       if(id!=null && !id.isEmpty())
           this.id=id;
   }
   public void settitle(String title){
       if(title!=null && !title.isEmpty())
           this.title=title;
   }
   public void getpublisher(String publisher){
       if(publisher!=null && !publisher.isEmpty())
           this.publisher=publisher;
   }
    
    
   
    public void inputBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap id:");
        id=sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println("nhap title:");
        title=sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println("nhap publisher:");
        publisher=sc.nextLine();
    }
    
    public void outputBook(){
        System.out.println(id+","+ title+","+ publisher);
   
    }
}
