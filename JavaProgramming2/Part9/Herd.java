package Part9;

import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;


    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable: herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String finString = "";
        int iterator = 0;
        for (Movable movable: herd) {
            finString += movable.toString();
            if (iterator == herd.size() - 1) {
                continue;
            } else {
                finString += "\n";
            }
            iterator++;
        }
        return finString;
    }

    
}
