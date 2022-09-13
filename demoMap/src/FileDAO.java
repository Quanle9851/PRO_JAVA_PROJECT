/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class FileDAO {
    public static void writeBinaryDogs(String filename,ArrayDogList<Dog>){
        FileOutputStream f=null;
       ObjectOutputStream of=null;
try {
     f=new FileOutputStream(filename);
          of=new ObjectOutputStream(f);
          of.writeObject(list);
           
       } catch (Exception e) {
       }
       finally{
           try {
               if(f!=null) f.close();
              if(of!=null) of.close();
           } catch (Exception e) {
           }
       }
    }
}
