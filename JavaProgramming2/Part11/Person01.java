

public class Person01 {

    private String name;
    private int age;

    public Person01(String name, int age) {

        if (name == null || name.equals("") || name.length() > 40) {
            throw new IllegalArgumentException("Incorrect name");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Incorrect age");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
