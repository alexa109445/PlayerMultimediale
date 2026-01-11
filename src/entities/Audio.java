package entities;

public class Audio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        if (volume < 1) volume = 1;
        else if (volume > 10) volume = 10;
        this.volume = volume;
    }

    public void alzaVolume() {
        if (volume < 10) volume++;
    }

    public void abbassaVolume() {
        if (volume > 1) volume--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String riga = titolo;
            for (int z = 0; z < volume; z++) {
                riga += "!";
            }
            System.out.println(riga);
        }
    }
}