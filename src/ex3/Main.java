package ex3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> rubrica = new HashMap<String, Integer>();
        rubrica.put("paperino", 32545);
        rubrica.put("topolino", 383838);
        rubrica.put("pippo", 93484);
        System.out.println(rubrica);
        rubrica.remove("pippo");
        System.out.println(rubrica);

        System.out.println(rubrica.get("paperino"));
        System.out.println(rubrica.get(93484));
    }
}
