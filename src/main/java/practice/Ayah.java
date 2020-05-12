package practice;

public class Ayah {
    public final int id;
    public final String surahName;
    public final int ayahInSurah;
    public final boolean startOfRuku;

    public Ayah(int id, String surahName, int ayahInSurah, boolean startOfRuku) {
        this.id = id;
        this.surahName = surahName;
        this.ayahInSurah = ayahInSurah;
        this.startOfRuku = startOfRuku;
    }
}
