package Part9;

public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int initialNumber) {
        this.tacos = initialNumber;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos > 0) {
            this.tacos--;
        }
    }

}
