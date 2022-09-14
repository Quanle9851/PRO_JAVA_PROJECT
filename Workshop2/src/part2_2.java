
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class part2_2 {
    public String inputString() throws Exception{
        String s="";
                String pattern= "SE[0-9]{3}";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the String:");
                s=sc.nextLine();
                if(! s.matches(pattern))
                    throw new Exception();
                return s;
    }
    public static void main(String[] args){
        part2_2 obj=new part2_2();
        boolean error=false;
        do{
            try{
                 String s=obj.inputString();
                 System.out.println("the String is "+s);
                 error=false;
        }catch(Exception e){
                System.out.println("The string is invalid!");
                error=true;
        }
    }while(error);
}
}