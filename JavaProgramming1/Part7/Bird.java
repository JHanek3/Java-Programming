public class Bird {
    private String name;
    private String nameLatin;
    private int numberObservations;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.numberObservations = 0;
    }
    
    public String getName() {
        return this.name;
    }

    public String getNameLatin() {
        return this.nameLatin;
    }

    public int getNumberObservations() {
        return this.numberObservations;
    }

    public void observed() {
        this.numberObservations++;
    }

    @Override 
    public String toString() {
        return String.format("%s (%s): %d observations", this.name, this.nameLatin, this.numberObservations);
    }

}
