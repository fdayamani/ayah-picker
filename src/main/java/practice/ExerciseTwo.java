package practice;

import java.util.List;

public class ExerciseTwo {
    public static void main (String[] args) {
        /*Exercise Two: Given a random starting ayah in the Holy Qur'an,
        figure out what the end ayah would be if you wanted to read 20 verses.*/
        String path = "src/main/resources/ayaat.csv";

        List<Ayah> ayaat;
        ayaat = Utils.readData(path);

        Ayah startingAyah;
        startingAyah = Utils.selectRandomStartPoint(ayaat);

        int idOfStartingAyah;

        int idOfEndingAyah;

        Ayah endAyah;


//        System.out.println("Read from " + startingAyah.surahName + ":" + startingAyah.ayahInSurah +
//                " to " + endAyah.surahName + ":" + endAyah.ayahInSurah);
    }
}
