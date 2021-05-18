package Part10;

public class BookInput {
    private String title;
    private Integer ageRange;

    public BookInput(String title, Integer ageRange) {
        this.title = title;
        this.ageRange = ageRange;
    }

    public String getTitle() {
        return this.title;
    }

    public int getAgeRange() {
        return this.ageRange;
    }

    @Override
    public String toString() {
        return String.format("%s (recommended for %d year-olds or older)", this.title, this.ageRange);
    }
    
}
