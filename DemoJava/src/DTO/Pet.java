package DTO;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tu
 */
public class Pet implements Comparable <Pet> {
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private Owner owner; // gans field vao
    public Pet() {
        id = 0;
        name = "";
        birthday = "";
        gender= "";
        owner = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    public void input(){
       
       boolean inputcontinue = false;
        do {
            try {
               Scanner sc=new Scanner(System.in);
               System.out.println("input Pet'id:");
               id= sc.nextInt();
               if(id < 0) 
                            throw new Exception();
                        inputcontinue = false;
            } catch (InputMismatchException e) {
                System.out.println("Input wrong format");
                inputcontinue = true;
            } catch (Exception e2) {
                System.out.println("value is not negative");
                inputcontinue = true;
            }
        } while (inputcontinue);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("input Pet'name:");
                name=sc.nextLine();
                if(name.equals(""))
                    throw new Exception("the name can not empty");
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(e.getMessage());
               inputcontinue =true;
           }
        }while(inputcontinue);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                String Pattern = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
                System.out.println("input Pet'birthday(dd/mm/yyyy):");
                birthday=sc.nextLine();
                if(!birthday.matches(Pattern))
                    throw new Exception();
                inputcontinue = false;
           } catch (Exception e) {
               System.out.println(" birthday is wrong format");
               inputcontinue = true;
           }
        }while(inputcontinue);
        do{
            try{
                Scanner sc=new Scanner(System.in);
                sc=new Scanner(System.in);
                System.out.println("input Pet'gender(only 'male' or 'female'):");
                gender=sc.nextLine(); 
                if(!gender.matches("male") && !gender.matches("female") )
                    throw new Exception();
                inputcontinue = false;
            } catch (Exception e) {
               System.out.println("Pet's gender wrong format");
               inputcontinue = true;
           }
        }while(inputcontinue);
            
    }
    
    public void output(){
        System.out.println("Pet's id:"+ id);
        System.out.println("Pet's name:"+ name);
        System.out.println("Pet's bd:"+ birthday);
        System.out.println("Pet's gender:"+ gender);
        if(owner!=null){
            System.out.println("chu so huu:");
            owner.output();
        }
    }

    @Override
    public int compareTo(Pet o) {
        if( id > o.id ) return 1;
        else if(id < o.id) return -1;
        return 0;
    }
}
