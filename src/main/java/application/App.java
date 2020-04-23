package application;

import java.util.List;

import static application.Utils.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class App {
    public static void main (String[] args) {
        int numberOfAyaatToRead = parseInt(showInputDialog("How many ayaat do you want to read at the moment?"));

        List<Ayah> ayaat = readData("src/main/resources/ayaat.csv");
        Ayah startingVerse = selectRandomStartPoint(findRuku(ayaat));
        AyahPicker ayahPicker = new AyahPicker(ayaat);
        System.out.println(ayahPicker.pickVerses(numberOfAyaatToRead, startingVerse));
    }
}
