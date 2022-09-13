/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Dog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Bao
 */
public class FileDao {
    public static ArrayList<Dog> loadData(String filename) throws Exception{
        FileReader f=new FileReader(filename);
        BufferedReader bf=new BufferedReader(f);
        ArrayList<Dog> list= new ArrayList<>();
        while(bf.ready()){
            String s=bf.readLine();
            String[] tmp=s.split("-");
            if(tmp.length==2){
                Dog d=new Dog( Integer.parseInt(tmp[0].trim()), tmp[1]);
                list.add(d);
            }
        }
     return list;
    }
    public static void saveData(String filename, ArrayList<Dog> list) throws Exception{
        PrintWriter w=new PrintWriter(filename);
        
    }
}
