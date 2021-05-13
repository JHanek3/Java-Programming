package Part9;

public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(String.format("%s purrs", this.getName()));
    }

    public void makeNoise() {
        purr();
    }
    
}
