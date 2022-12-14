/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion_NQueens;

import java.util.ArrayList;

/**
 *
 * @author Bao
 */
public class N_Queen_Problem {
    int size, nQueens;
    ArrayList<QueenPosition> positions=null;
    ArrayList<QueenPosition> solution;
    boolean solved=false;
    boolean succeeded=false;
    public N_Queen_Problem(int size, int nQueens){
        this.size = size;
        this.nQueens= nQueens;
        positions = new ArrayList();
        int i,j;
        for (i=0; i<size; i++)
            for(j=0; j<size; j++)positions.add(new QueenPosition(i,j));
    }
    
    public boolean reverseValid (QueenPosition pos, int index){
        if (index==0) return true;
        for (int i=index-1; i>=0;i--){
            QueenPosition p=solution.get(i);
            if (!pos.valid(p)) return false;
        }
        return true;
    }
    
    private void recuriveSolve (int index){
        if (solved) return;
        int i,j;
        for (i=0; i<positions.size() && !solved; i++){
            j=solution.size()-1;
            while (j>=index) solution.remove(j--);
            QueenPosition pos = positions.get(i);
            if (reverseValid(pos,index)){
                solution.add(pos);
                if(index==nQueens-1)
                    solved = succeeded =true;
                else recuriveSolve(index+1);
            }
        }
    }
    private void recuriveSolve (){
        solved = succeeded = false;
        if(this.size < this.nQueens) solved = true;
        else {
            solution = new ArrayList();
            recuriveSolve(0);
        }
    }
    public static void main(String[] args){
        int size=8;
        int nQueens=8;
        N_Queen_Problem problem = new N_Queen_Problem(size, nQueens);
        problem.recuriveSolve();
        if(problem.solved){
            if(problem.succeeded){
                System.out.println("A solution:");
                System.out.println(problem.solution);
            }
            else System.out.println("No Solution!");
        }
        else System.out.println("the problem is not solved yet.");
    }
}
