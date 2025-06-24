package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        arrayNumbersOrdinati(5);
        listaInversa(arrayNumbersOrdinati(5));
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

        for (int i = 0; i < lista.size(); i++) {
            nuovaLista.add((Integer) lista.get(i));
        }

        for (int i = lista.size(); i >= 0; i--) {
            int eleToAdd = (Integer) lista.get(i);
            nuovaLista.add(eleToAdd);
        }

        System.out.println(nuovaLista);
        return nuovaLista;
    }


}
