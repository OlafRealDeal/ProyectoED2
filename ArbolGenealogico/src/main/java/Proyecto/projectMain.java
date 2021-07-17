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
        Tree AG = new Tree("Adan", "Eva");
        System.out.println(AG.showTree());
        AG.addChild("Adan/Eva", "olaf");
        AG.addChild("Adan/Eva", "elsa");
        System.out.println(AG.showTree());
        AG.marry("olaf", "Rut");
        System.out.println(AG.showTree());
    }
    
}
