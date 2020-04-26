package application;

import java.util.Objects;

public class Ayah {
    public int id;
    public String surah;
    public int ayahInSurah;
    public boolean startOfRuku;

    public Ayah(int id, String surah, int ayahInSurah, boolean startOfRuku) {
        this.id = id;
        this.surah = surah;
        this.ayahInSurah = ayahInSurah;
        this.startOfRuku = startOfRuku;
    }

    @Override
    public String toString() {
        return "application.Ayah{" +
                "id=" + id +
                ", surah='" + surah + '\'' +
                ", ayahInSurah=" + ayahInSurah +
                ", startofRuku=" + startOfRuku +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ayah ayah = (Ayah) o;
        return id == ayah.id &&
                ayahInSurah == ayah.ayahInSurah &&
                startOfRuku == ayah.startOfRuku &&
                Objects.equals(surah, ayah.surah);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surah, ayahInSurah, startOfRuku);
    }

    public String makeReference() {
        return surah + ":" + ayahInSurah;
    }

}
