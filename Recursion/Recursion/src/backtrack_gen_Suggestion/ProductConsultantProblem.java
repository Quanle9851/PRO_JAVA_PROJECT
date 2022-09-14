
package backtrack_gen_Suggestion;

import java.util.ArrayList;
import backtrack_gen.*;
import java.util.Collections;

public class ProductConsultantProblem {
    double maxBudget;
    int noProduct;
    ArrayList<ArrayList<Product>> domains;
    boolean solved=false;
    ArrayList<Suggestion> solutions;
    public ProductConsultantProblem(double maxBudget){
        this.maxBudget=maxBudget;
        noProduct=0;
        domains=new ArrayList();
        solutions=new ArrayList();
    }
    public void addRequest(ArrayList<Product> domain){
        noProduct++;
        domains.add(domain);
    }
    public Suggestion getSuggestion(Configuration conf){
        Suggestion suggestion =new Suggestion();
        double sumCost=0;
        for(int i=0; i<conf.size();i++){
            ArrayList<Product> domain=domains.get(i);
            int productIndex=conf.get(i);
            Product p=domain.get(productIndex).price;
            suggestion.add(p);
            sumCost+= domain.get(productIndex).price;
        }
        suggestion.setCost(sumCost);
        return suggestion;
    }
    public boolean isAccepted(Suggestion suggestion){
        return suggestion.getCost()<=this.maxBudget;
    }
    public void solve(){
        solved=false;
        BackTrackGenerator gen=new BackTrackGenerator();
        for(int i=0;i<noProduct;i++)gen.addDomain(domains.get(i));
        gen.init();
        Configuration config=gen.getFirstConfig();
        while (config != null){
            Suggestion suggestion=this.getSuggestion(config);
            if(isAccepted(suggestion))solutions.add(suggestion);
            config=gen.nextConfiguration();
        }
        solved=true;
    }
}
