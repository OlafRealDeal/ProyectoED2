package flores.familytree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olaf
 */
public class Node {
      
    private String male;
    private String female;
    private List<Node> children;
    
    public Node(String male){
        this.male = male;    
        this.female = female;
        this.children = new ArrayList<Node>();
    }

    public String getMale(){
        return male;
    }
    public void setMale(String male){
        this.male = male;
    }
    public String getFemale(){
        return female;
    }
    public void setFemale(String female){
        this.female = female;
    }
    public void addChild(Node T){
        children.add(T);
    }
    public int numberofChildren(){
        return children.size();
    }
    public Node getChild(int i){
        if(i >= 1 && i <= children.size()){
            return children.get(i-1);
        }else{
            System.err.println("Child number " +i+" doesnt exist");
            return null;
        }
    }
    public boolean Leaf(){
        return children.size()==0;
    }
    public String visualize(){
        String s = "[" + male;
        if(female!=null){
            s+="/"+female;
        }
        s+="]";
        return s;
    }
    
}
