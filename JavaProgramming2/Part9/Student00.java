package Part9;

public class Student00 extends Person00 {
    private int studyCredits;

    public Student00(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }

    public int credits() {
        return studyCredits;
    }

    public void study() {
        studyCredits++;
    }

    @Override
    public String toString() {
        return String.format("%s\n\s\sStudy credits %d", super.toString(), credits());
    }
}
