import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AyahPickerTest {
    List<Ayah> testData = new ArrayList<>();
    @Before public void setUp() {
        testData = Utils.readData("src/test/resources/test_data.csv");
    }

    @Test public void
    picks_verses_to_read_based_on_input_of_7() {
        AyahPicker ayahPicker = new AyahPicker(testData);

        assertThat(ayahPicker.pickVerses(7, testData.get(0)), equalTo("Read from 1:1 to 1:7"));
    }

    @Test public void
    picks_verses_up_to_end_of_ruku() {
        AyahPicker ayahPicker = new AyahPicker(testData);

        assertThat(ayahPicker.pickVerses(5, testData.get(0)), equalTo("Read from 1:1 to 1:7"));
    }

    @Test public void
    rounds_up_to_the_next_ruku_if_selection_is_over_7() {
        AyahPicker ayahPicker = new AyahPicker(testData);

        assertThat(ayahPicker.pickVerses(8, testData.get(0)), equalTo("Read from 1:1 to 2:7"));
    }

    //test for if it picks the end of the qur'an
}
