import java.util.Objects;

public class Ayah {
    public int id;
    public int surah;
    public int ayahInSurah;
    public boolean startofRuku;

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

    @Override
    public String toString() {
        return "Ayah{" +
                "id=" + id +
                ", surah=" + surah +
                ", ayahInSurah=" + ayahInSurah +
                ", startofRuku=" + startofRuku +
                '}';
    }
}
