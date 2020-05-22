package homeworks;

public class Imam {
    private final String name;
    private final int yearOfBirth;
    private final int yearOfDeath;
    private final String placeOfBurial;
    private final boolean stillAlive;

    public Imam(String name, int yearOfBirth, int yearOfDeath, String placeOfBurial, boolean stillAlive) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.yearOfDeath = yearOfDeath;
        this.placeOfBurial = placeOfBurial;
        this.stillAlive = stillAlive;
    }
}
