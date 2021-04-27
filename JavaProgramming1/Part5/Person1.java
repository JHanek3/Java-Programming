
public class Person1 {

    private String name;
    private Pet pet;

    public Person1(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person1(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person1() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString() {
        return String.format("%s, has a friend called %s (%s)", this.name, this.pet.getName(), this.pet.getBreed());
    }

}
