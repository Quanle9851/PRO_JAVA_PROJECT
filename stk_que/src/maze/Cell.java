/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

/**
 *
 * @author Quan
 */
public class Cell {
    public static char EMPTY_VAL='0',BLOCKED='1';
    int x,y;
    char value;
    boolean visited=false;
    Cell previous=null;
    public Cell(int x,int y,char Value){
        this.x=x;
        this.y=y;
        this.value=value;               
    }
    public boolean canMoveto(){
        return (visited==false&& value != BLOCKED);
    }

    @Override
    public String toString() {
        return "(" +x+", "+y+", "+value+")";
    }
}
