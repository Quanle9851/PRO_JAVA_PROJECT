/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Bao
 */
public class IntBstNode {
    int key;
    IntBstNode left,right,father;
    public IntBstNode(int key){
        this.key=key; left=right=father=null;
    }

    @Override
    public String toString() {
        return "" + this.key;
    }
    public boolean isLeaf(){
        return left==null && right==null;
    }
    public boolean havingOneChild(){
        return (left!=null && right==null) || (left==null && right!=null);
    }
    public boolean having2Children(){
        return left!=null && right !=null;
    }
}
