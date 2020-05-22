package homeworks;

public class Person {
    private final String name;
    private final int age;
    private final boolean isFemale;
    private final double heightInMetres;
    private final String emailAddress;
    private final double weightInKilograms;

    public Person (String name, int age, boolean isFemale, double heightInMetres, String emailAddress, double weightInKilograms) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.heightInMetres = heightInMetres;
        this.emailAddress = emailAddress;
        this.weightInKilograms = weightInKilograms;
    }
}
