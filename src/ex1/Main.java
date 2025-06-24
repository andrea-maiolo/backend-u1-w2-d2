package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> paroleSet = new HashSet<>();
        ArrayList<String> paroleDuplicate = new ArrayList<>();
        //  HashSet<String> paroleDuplicate = new HashSet<>();

        System.out.println("inserisci il numero di parole");
        int numParole = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numParole; i++) {
            System.out.println("inserisci la " + (i + 1) + " parola");
            String parolaCorrente = scanner.nextLine();
            if (paroleSet.contains(parolaCorrente)) {
                System.out.println("la parola " + parolaCorrente + " e gia presente");
                paroleDuplicate.add(parolaCorrente);

            }
            paroleSet.add(parolaCorrente);
        }

        System.out.println("il tuo set e " + paroleSet);
        System.out.println("le parole distinte sono " + paroleSet.size());
        System.out.println("queste sono le parole duplicate " + paroleDuplicate);
    }
}
