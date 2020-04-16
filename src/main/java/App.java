import java.util.List;

import static java.lang.Integer.parseInt;

public class App {
    public static void main (String[] args) {
        List<Ayah> ayaat = Utils.readData("src/main/resources/ayaat.txt");
        Ayah startingVerse = Utils.selectRandomStartPoint(ayaat);
        AyahPicker ayahPicker = new AyahPicker(ayaat);
        System.out.println(ayahPicker.pickVerses(parseInt(args[0]), startingVerse));
    }
}
