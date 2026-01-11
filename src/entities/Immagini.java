package entities;

public class Immagini extends ElementoMultimediale {
    private int luminosità;

    public Immagini(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void aumentaLuminosità() {
        luminosità++;
    }

    public void diminuisciLuminosità() {
        if (luminosità > 0)
            luminosità--;
    }

    public void show() {
        String riga = titolo;
        for (int i = 0; i < luminosità; i++) {
            riga += "*";
        }
        System.out.println(riga);
    }
}

