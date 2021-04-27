public class Archive {
    public String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.identifier, this.name);
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedFigure = (Archive) compared;

        return (this.identifier.equals(comparedFigure.identifier));
    }

}
