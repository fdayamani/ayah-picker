package application;

import java.util.List;

public class AyahPicker {
    private List<Ayah> ayaat;

    public AyahPicker(List<Ayah> ayaat) {
        this.ayaat = ayaat;
    }

    public String pickVerses(int ayaatToRead, Ayah startingAyah) {
        String startReference = startingAyah.makeReference();
        Ayah endAyah = startingAyah;
        String endReference = endAyah.makeReference();

        return "Read from " + startReference + " to " + endReference;
    }
}
