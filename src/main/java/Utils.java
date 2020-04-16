import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
                data.add(new Ayah(parseInt(values[0]), parseInt(values[1]), parseInt(values[2]), parseBoolean(values[3])));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static List<Ayah> findRuku(List<Ayah> ayaat) {
        List<Ayah> rukuat = ayaat.stream()
                .filter(ayah -> ayah.startofRuku)
                .collect(Collectors.toList());
        return rukuat;
    }

    public static Ayah selectRandomStartPoint(List<Ayah> rukuat) {
        int totalRukuat = rukuat.size();
        int ruku = (int)(Math.random() * totalRukuat);
        return rukuat.get(ruku - 1);
    }
}
