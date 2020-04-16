import java.util.Objects;

public class Ayah {
    private int id;
    private int surah;
    private int ayahInSurah;
    private boolean startofRuku;

    public Ayah(int id, int surah, int ayahInSurah, boolean startofRuku) {
        this.id = id;
        this.surah = surah;
        this.ayahInSurah = ayahInSurah;
        this.startofRuku = startofRuku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ayah ayah = (Ayah) o;
        return id == ayah.id &&
                surah == ayah.surah &&
                ayahInSurah == ayah.ayahInSurah &&
                startofRuku == ayah.startofRuku;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surah, ayahInSurah, startofRuku);
    }
}
