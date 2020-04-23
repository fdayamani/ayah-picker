package application;

import javax.swing.*;
import java.util.List;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class App {
    public static void main (String[] args) {
        int numberOfAyaatToRead = parseInt(showInputDialog("How many ayaat do you want to read at the moment?"));

        if (args.length != 1) {
            throw new RuntimeException("Please enter how many verses you wish to recite");
        }
        List<Ayah> ayaat = Utils.readData("src/main/resources/ayaat.csv");
        Ayah startingVerse = Utils.selectRandomStartPoint(Utils.findRuku(ayaat));
        AyahPicker ayahPicker = new AyahPicker(ayaat);
        System.out.println(ayahPicker.pickVerses(numberOfAyaatToRead, startingVerse));
    }
}
