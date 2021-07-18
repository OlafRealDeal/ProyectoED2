package flores.familytree;

import com.google.gson.Gson;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    Tree ft = new Tree("Adan");
        ft.marry("Adan", "Eva");
        ft.addChild("Adan/Eva", "Cain");
        ft.addChild("Adan/Eva", "Abel");
        ft.marry("Cain", "Rut");
        ft.marry("Abel", "Rut");
        ft.addChild("Abel/Rut", "Daniel");
        
        Gson gson = new Gson();
        String text = gson.toJson(ft);
        System.out.println(text);
        
  }

}
