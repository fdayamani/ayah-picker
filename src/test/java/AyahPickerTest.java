import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AyahPickerTest {
    List<Ayah> testData = new ArrayList<>();
    @Before public void setUp() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/test_data.csv"));
            reader.readLine();
            reader.lines().forEach(line -> {
                String[] values = line.split(",");
                testData.add(new Ayah(Integer.valueOf(values[0]), Integer.valueOf(values[1]), Integer.valueOf(values[2]), Boolean.valueOf(values[3])));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test public void
    picks_verses_to_read_based_on_input() {
        AyahPicker ayahPicker = new AyahPicker(testData);

        assertThat(ayahPicker.pickVerses(5, 1), equalTo("Read from 1:1 to 1:7"));
    }
}
