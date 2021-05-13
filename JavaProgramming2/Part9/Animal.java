package Part9;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        System.out.println(String.format("%s eats", getName()));
    }

    public void sleep() {
        System.out.println(String.format("%s sleeps", getName()));
    }
    
}
