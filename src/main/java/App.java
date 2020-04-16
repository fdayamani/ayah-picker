import java.util.List;

import static java.lang.Integer.parseInt;

public class App {
    public static void main (String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("Please enter how many verses you wish to recite");
        }
        List<Ayah> ayaat = Utils.readData("src/main/resources/ayaat.csv");
        Ayah startingVerse = Utils.selectRandomStartPoint(Utils.findRuku(ayaat));
        AyahPicker ayahPicker = new AyahPicker(ayaat);
        System.out.println(ayahPicker.pickVerses(parseInt(args[0]), startingVerse));
    }
}
