
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class Part2 {
    public static void main(String[] args){
        boolean error=false;
        do{
            try{
                String s="";
                String pattern= "SE[0-9]{3}";//Regular Expression
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the String:");
                s=sc.nextLine();
                if(! s.matches(pattern))
                    throw new Exception();
                System.out.println("the String is "+s);
                error=false;
            }catch(Exception e){
                System.out.println("The string is invalid!");
                error=true;
            }
    }while(error);
}
}        