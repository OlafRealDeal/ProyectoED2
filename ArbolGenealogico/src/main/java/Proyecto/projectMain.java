package Proyecto;

/**
 *
 * @author Olaf
 */
public class projectMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree AG = new Tree("Adan");
        AG.marry("Adan", "Eva");
        AG.addChild("Adan/Eva", "Cain");
        AG.addChild("Adan/Eva", "Abel");
        AG.marry("Cain", "Rut");
        AG.marry("Abel", "Rut");
        AG.addChild("Abel/Rut", "Daniel");
        System.out.println(AG.showTree());
    }
    
}
