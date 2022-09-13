/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Book;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class Tester {
    public static void main(String[] args) {
        int choice;
        Book obj=null;
        do{
            System.out.println("1. input a book");
            System.out.println("2. output a book");
            System.out.println("3. exit");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    obj=new Book();
                    obj.inputBook();
                    break;
                case 2:
                    if (obj!=null)
                        obj.outputBook();
                    else
                        System.out.println("No data");
                    break;
            }
        }while(choice<=2);
    }
}
