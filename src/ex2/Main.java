package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //arrayNumbersOrdinati(5);
        listaInversa(arrayNumbersOrdinati(5));
        //printConBoolean(arrayNumbersOrdinati(6), false);
    }

    public static ArrayList arrayNumbersOrdinati(int n) {
        Random random = new Random();
        ArrayList<Integer> listaOrdinata = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int nextNum = random.nextInt(0, 100);
            listaOrdinata.add(nextNum);
        }
        Collections.sort(listaOrdinata);
        System.out.println(listaOrdinata);
        return listaOrdinata;

    }

    public static ArrayList listaInversa(ArrayList lista) {
        ArrayList<Integer> nuovaLista = new ArrayList<>();
        nuovaLista.addAll(lista);
        System.out.println("dopo il primo addall " + nuovaLista);
        System.out.println(nuovaLista.size() + "size della list");
        for (int i = nuovaLista.size() - 1; i >= 0; i--) {
            nuovaLista.add(nuovaLista.get(i));
        }
        
        System.out.println("alla fine " + nuovaLista);
        return nuovaLista;
    }


    public static void printConBoolean(ArrayList lista, boolean b) {
        if (b) {
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }

}
