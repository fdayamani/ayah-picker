import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UtilsTest {
    @Test public void
    generatesCorrectListOfRukuat() {
        List<Ayah> ayaat = Utils.readData("src/test/resources/test_data.csv");
        assertThat(Utils.findRuku(ayaat), equalTo(List.of(ayaat.get(0),ayaat.get(7), ayaat.get(14), ayaat.get(27))));
    }
}
