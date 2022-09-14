/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bao
 */
public class InjectionList extends ArrayList<Injection>{
    VaccineList vac;
    StudentList stu;
    
    public InjectionList(){
        super();
    }
    public InjectionList(VaccineList vac, StudentList stu){
        this.vac= vac;
        this.stu= stu;
    }
    public void addInjection(){
        String ID;
        LocalDate injDate1;
        String injPlace1;
        LocalDate injDate2 = null;
        String injPlace2 = null;
        String stuID;
        String vacID;
        //enter id
       
        do{
            ID = Input.inputNonBlankStr("ID of injection: ");
            if(isIDExist(ID)) System.out.println("the ID is Existed ! try again.");
        }while (isIDExist(ID));
        stuID = Input.StudentID("Student ID : ", this.stu);
        vacID = Input.VaccineID("Vaccine ID : ", this.vac);
        
        injDate1 = Input.inputValidDate1("Input 1st injection date (yyyy-mm-dd) : ");
        injPlace1 = Input.inputNonBlankStr("Input 1st injection place : ");
        Scanner sc = new Scanner(System.in);
        injDate2 = Input.inputValidDate2("Input 2nd injection date (yyyy-mm-dd), can be blank : ",injDate1);
        if (injDate2 != null ) injPlace2 = Input.inputNonBlankStr("Input 2nd injection place : "); 
     
        this.add(new Injection(ID, injDate1, injPlace1, injDate2, injPlace2, stuID, vacID));
        this.stu.search(stuID).injNum++;
        System.out.println("Added successful");
        if (Input.inputPStr("Do you want to add another injection (Y/N)? ","[YN]").equals("Y")) this.addInjection();        
    }
    public void updateInjection(){
        if (this.isEmpty()) {
            System.out.println("The list is empty.");
        } 
        else {
            String uID = Input.inputNonBlankStr("Type in ID of injection to update : ");
            int pos = pos(uID);
            if (pos < 0) {
                System.out.println("Injection ID does not exist. Update Unsuccessfull");
            } else {
                    LocalDate injDate2 = Input.inputValidDate2("Input 2nd injection date (yyyy-mm-dd), leave blank to quit update : ", this.get(pos).injDate1);
                    if (injDate2 != null){
                        String injPlace2 = Input.inputNonBlankStr("Input 2nd injection place :");
                        this.get(pos).setInjDate2(injDate2);
                        this.get(pos).setInjPlace2(injPlace2);
                        System.out.println("This student has completed 2 injection");
                    } else System.out.println("Update call cancel !"); 
                } 
        }           
    }
    public void removeInjection(){
        if (this.isEmpty()) {
            System.out.println("The list is empty.");
        }
        else {
            String rID = Input.inputNonBlankStr("Type in ID of injection to remove : ");
            int pos = pos(rID);
            if (pos < 0) {
                System.out.println("Injection does not exist. Remove Unsuccessfull");
            } else {
                String warning = Input.inputPStr("Are you sure you want to remove injection " + this.get(pos).ID+ "? (Y/N) : ","[YN]");
                if ("Y".equals(warning)) {
                    this.remove(pos);
                    System.out.println(rID + " is removed.");
                } else System.out.println("Remove call cancel ! ");
            }
        }
    }
    public void savetoFile(String filename){
        if (this.isEmpty()) { 
            System.out.println("Empty list!");
        } else {
            try {
                File f = new File(filename);
                FileWriter fw = new FileWriter(f);
                for (Injection e : this) {
    
                    fw.write(e.toString());
                    fw.write("\n");
                }
                System.out.println("Save successfull!");
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }        
    }
    public void loadfromFile (String filename){
        try {
            File f = new File(filename);
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] split = data.split(",");
                String ID = split[0];
                LocalDate injDate1 = LocalDate.parse(split[1],DateTimeFormatter.ISO_LOCAL_DATE);
                String injPlace1 = split[2];
                LocalDate injDate2 = split[3].equals("null") ? null : LocalDate.parse(split[3],DateTimeFormatter.ISO_LOCAL_DATE);
                String injPlace2 = split[4].equals("null") ? null : split[4];
                String stuID = split[5];
                String vacID = split[6];
                if (this.stu.isIDExist(stuID) && !this.isIDExist(ID) && !this.searchByStuID(stuID)){
                    this.add(new Injection(ID, injDate1, injPlace1, injDate2, injPlace2, stuID, vacID));
                    this.stu.search(stuID).injNum++;
                }
            }
        } catch (FileNotFoundException e) {
                System.out.println(e);
            }
    }
    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            System.out.println(String.format("%-20s", "INJECTION INFOMATION"));
            System.out.println("---------------------------------");
            System.out.println(String.format("%-5s | %-9s| %-20s | %-15s | %-15s | %-15s | %-15s",
                                                "ID","StuID","Vaccine type","1st InjDate", "1st InjPlace", "2nd InjDate", "2st InjPlace"));
            this.forEach((x) -> {
                System.out.println(String.format("%-5s | %-9s| %-20s | %-15s | %-15s | %-15s | %-15s",
                                                x.ID,x.stuID,this.vac.search(x.vacID).name,x.injDate1,x.injPlace1,x.injDate2,x.injPlace2));});
            System.out.println("Total: " + this.size() + " item(s).");
        }
    }
    public void searchByStuID (){
        if (this.isEmpty()){
            System.out.println("Empty list.");
        } else {
            String stuID = Input.StudentIDToSearch("Input Student ID to search : ", stu);
            System.out.println("INJECTION INFOMATION");
            System.out.println("---------------------------------");
            System.out.println(String.format("%-5s | %-9s| %-20s | %-15s | %-15s | %-15s | %-15s","ID","StuID","Vaccine type","1st InjDate", "1st InjPlace", "2nd InjDate", "2st InjPlace"));
            this.stream().filter((x) -> (x.getStuID().equals(stuID))).forEachOrdered((x) -> {
                System.out.println(String.format("%-5s | %-9s| %-20s | %-15s | %-15s | %-15s | %-15s",
                                                x.ID,x.stuID,this.vac.search(x.vacID).name,x.injDate1,x.injPlace1,x.injDate2,x.injPlace2));});
        }
    }
    
    private int pos(String ID) {
        if (!this.isEmpty()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getID().equals(ID)) {
                    return i;
                }
            }      
        }
        return -1;
    }    
    private boolean isIDExist(String ID){
        return search(ID) != null;
    }
    private Injection search(String ID) {
        for (Injection x : this) if (x.getID().equals(ID)) return x;
        return null;
    } 
    private boolean searchByStuID (String stuID){
        for ( Injection x : this) if ( x.stuID == stuID) return true;
        return false;
    }
}
