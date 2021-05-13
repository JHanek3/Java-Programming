package Part9;

public class Person00 {
    protected String name;
    protected String address;

    public Person00(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s\n\s\s%s", name, address);
    }
}


