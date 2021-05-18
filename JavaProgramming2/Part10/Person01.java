package Part10;

public class Person01 {
    private String name;
    private Education education;

    public Person01(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public Education getEducation() {
        return this.education;
    }

    public String toString() {
        return String.format("%s, %s", this.name, this.education);
    }
}
