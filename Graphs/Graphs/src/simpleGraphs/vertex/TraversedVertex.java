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
public class TraversedVertex implements Comparable<TraversedVertex>{
    public Vertex v;
    public int num;
    public TraversedVertex(Vertex v,int num){
        this.v=v;
        this.num=num;
    }

    @Override
    public int compareTo(TraversedVertex t) {
        return num<t.num ? -1:num>t.num? 1:0;
    }

    @Override
    public String toString() {
        return "TraversedVertex{" + "v=" + v.key + ", num=" + v.num + '}';
    }
}
