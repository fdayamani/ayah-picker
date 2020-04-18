import java.util.Objects;

public class Ayah {
    public int id;
    public String surah;
    public int ayahInSurah;
    public boolean startofRuku;

    public Ayah(int id, String surah, int ayahInSurah, boolean startofRuku) {
        this.id = id;
        this.surah = surah;
        this.ayahInSurah = ayahInSurah;
        this.startofRuku = startofRuku;
    }

    @Override
    public String toString() {
        return "Ayah{" +
                "id=" + id +
                ", surah='" + surah + '\'' +
                ", ayahInSurah=" + ayahInSurah +
                ", startofRuku=" + startofRuku +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ayah ayah = (Ayah) o;
        return id == ayah.id &&
                ayahInSurah == ayah.ayahInSurah &&
                startofRuku == ayah.startofRuku &&
                Objects.equals(surah, ayah.surah);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surah, ayahInSurah, startofRuku);
    }
}
