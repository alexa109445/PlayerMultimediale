package entities;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void alzaVolume() {
        if (volume < 10) volume++;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void diminuisciLuminosità() {
        if (luminosità > 0) luminosità--;
    }

    public void aumentaLuminosità() {
        if (luminosità < 10) luminosità++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String riga = titolo;
            for (int x = 0; x < volume; x++) {
                riga += "!";
            }
            for (int y = 0; y < luminosità; y++) {
                riga += "*";
            }
        }
    }
}
