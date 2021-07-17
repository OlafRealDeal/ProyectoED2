package flores.familytree;

/**
 *
 * @author Olaf
 */
public class Tree {
    private Node root;
    
    
    public Tree(String father){
        root = new Node(father);
    }
    
    public Node searchMale(String male){
        return searchMale(root, male);
    }
    private Node searchMale(Node T, String male){
        if(T==null)
            return null;
        if(T.Leaf()){
            if(T.getMale().equals(male))
                return T;
            return null;
        }
        if(T.getMale().equals(male))
            return T;
        for(int i = 1; i <= T.numberofChildren(); i++){
            Node child = searchMale(T.getChild(i), male);
            if(child != null){
                return child;
            }
            
        }
        return null;
    }
    public void marry(String male, String female){
        //looks if the male already exist
        Node nodeMale = searchMale(male);
        if(nodeMale == null){
            System.err.println("The male you are looking for does not exist in the Tree");
            return;
        }
        // looks for the node that contains the male
        if(nodeMale.getFemale()!=null){
            System.err.println("The male is already married with a female");
            return;
        }
        //here we make him marry to a female
        nodeMale.setFemale(female);
    }
    public String showTree(){
        return showTree(root, 1);
    }
    private String showTree(Node T, int level){
        String s = "";
        if(T!=null){
            s = T.getMale();
            if(T.getFemale()!=null){
                s+= "/"+T.getFemale();
            }
            s+="{ \n";
            for(int i=1; i<=T.numberofChildren(); i++){
                s+= separator(level) + showTree(T.getChild(i), level+1)+"\n";
            }
            s+= separator(level-1)+ " } ";
        }
        return s;
    }
    private String separator(int level){
        String s = "";
        for(int i=0; i< level; i++){
            s+= "  ";
        }
        return s;
    }
    public void addChild(String couple, String child){
        //looks if the childs name does not exist
        Node nodeChild = searchMale(child);
        if(nodeChild!=null){
            System.err.println("The childs name already exist in the Tree");
            return;
        }
        //split the couple in male and female
        String[] names = couple.split("/");
        //looks if the male exist
        Node nodeMale = searchMale(names[0]);
        if(nodeMale==null){
            System.err.println("The male does not exist in the Tree");
            return;
        }
        //looks for the couple      
        if(nodeMale.getFemale()==null){
            System.err.println("The male "+names[0]+" is not married");
            return;
        }
        if(!nodeMale.getFemale().equals(names[1])){
            System.err.println("the female "+names[1]+" is not married with "+names[0]);
            return;
        }       
        //here we add the child
        nodeMale.addChild(new Node(child));
    }
    public Node getRoot(){
        return root;
    }
}
