public class Container {
    private int currentLiter;
    private int maxLiter;

    public Container() {
        this.currentLiter = 0;
        this.maxLiter = 100;
    }

    public int contains() {
        return this.currentLiter;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + currentLiter <= 100) {
                currentLiter += amount;
            } else {
                currentLiter = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            currentLiter -= amount;
            if (currentLiter <0) {
                currentLiter = 0;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%d/100", currentLiter);
    }
    
}
