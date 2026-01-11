package entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Crea elemento " + (i + 1) + ": 1=Audio 2=Video 3=Immagine");
            int tipo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Titolo: ");
            String titolo = scanner.nextLine();
            if (tipo == 1) {
                System.out.println("Durata: ");
                int durata = scanner.nextInt();
                System.out.println("Volume: ");
                int volume = scanner.nextInt();

                elementi[i] = new Audio(titolo, durata, volume);
            } else if (tipo == 2) {
                System.out.println("Durata: ");
                int durata = scanner.nextInt();
                System.out.println("Volume: ");
                int volume = scanner.nextInt();
                System.out.println("Luminosità: ");
                int lum = scanner.nextInt();
             
                elementi[i] = new Video(titolo, durata, volume, lum);
            } else {
                System.out.println("Luminosità: ");
                int lum = scanner.nextInt();
                elementi[i] = new Immagini(titolo, lum);
            }
            scanner.nextLine();
        }
        int scelta = -1;
        do {
            System.out.println("Scegli un elemento da eseguire da 1 a 5, premi 0 per uscire: ");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Immagini) {
                    ((Immagini) elemento).show();
                } else {
                    ((Riproducibile) elemento).play();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida!");
            }
        }
        while (scelta != 0);
        System.out.println("Programma terminato ");
    }
}
