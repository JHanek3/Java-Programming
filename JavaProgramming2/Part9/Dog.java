package Part9;

public class Dog extends Animal implements NoiseCapable{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(String.format("%s barks", this.getName()));
    }

    public void makeNoise() {
        bark();
    }
}
