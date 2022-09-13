/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DAO.FileDao;
import java.util.ArrayList;

/**
 *
 * @author Bao
 */
public class DogList {
    ArrayList<Dog> list;
    final String filename="data.txt";
    public DogList(){
        try{
            list=FileDao.loadData(filename)
        }catch (Exception e);
    }
}
