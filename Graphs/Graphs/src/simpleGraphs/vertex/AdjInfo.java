/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleGraphs.vertex;

/**
 *
 * @author Bao
 */
public class AdjInfo implements Comparable<AdjInfo>{
    public Vertex dest;
    public double weight=1;
    public AdjInfo(Vertex dest){
        this.dest=dest;
    }
    public AdjInfo(Vertex dest, double weight){
        this.dest=dest;
        this.weight=weight;
    }
    @Override
    public int compareTo(AdjInfo t) {
        return dest.compareTo(t.dest);
    }

    @Override
    public String toString() {
        return "AdjInfo{" + "dest=" + dest.key + ", weight=" + weight + '}';
    }

    public double getWeight() {
        return weight;
    }
    
    
}
