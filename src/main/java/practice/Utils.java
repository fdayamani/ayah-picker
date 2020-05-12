package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;

public class Utils {
    public static List<Ayah> readData(String path) {
        List<Ayah> data = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            reader.readLine();
            reader.lines().forEach(line -> {
                String[] values = line.split(",");
                data.add(new Ayah(parseInt(values[0]), values[2], parseInt(values[3]), parseBoolean(values[4])));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static Ayah selectRandomStartPoint(List<Ayah> ayaat) {
        int totalAyaat = ayaat.size();
        int ayah = (int)(Math.random() * totalAyaat);
        return ayaat.get(ayah - 1);
    }


}
