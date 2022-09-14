/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack_gen;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author quan
 */
public class BackTrackGenerator {
    protected int noOfSet=0;
    ArrayList<IntMinMaxSet> isDomains=new ArrayList();
    Configuration curConfig=new Configuration();
    boolean initated = false;
    public void addDomain(int min,int max){
        IntMinMaxSet aSet=new IntMinMaxSet(min,max);
        isDomains.add(aSet);
        noOfSet++;
    }
    public void addDomain(Collection list){
        IntMinMaxSet aSet=new IntMinMaxSet(list);
        isDomains.add(aSet);
        noOfSet++;
    }
    public void init(){
        curConfig.clear();
        for(int i=0;i<noOfSet;i++){
            IntMinMaxSet set=isDomains.get(i);
            set.reset();
            curConfig.add(set.nextValue());
        }
        initated=true;
    }
    public void reset(){
        initated=false;
    }
    private boolean isLastConfiguration(){
        for(int i=0;i<noOfSet;i++)
            if(!isDomains.get(i).isLastValue())return false;
        return true;
    }
    private Configuration copyConfiguration(){
        Configuration result=new Configuration(curConfig.size());
        for(int i=0; i<curConfig.size();i++)
            result.add(curConfig.get(i).intValue());
        return result;
    }
    public Configuration getConfiguration(){
        init();
        return copyConfiguration();
    }
}
