import java.util.*;
public class Birds {
    private ArrayList<Bird> birdList;

    public Birds() {
        this.birdList = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        birdList.add(bird);
    }

    public void printBirds() {
        birdList.sort(Comparator.comparing(Bird::getNumberObservations).reversed());

        for (Bird bird: birdList) {
            System.out.println(bird);
        }
    }

    public void observedList(String name) {
        Boolean match = false;

        for (Bird bird: birdList) {
            if (name.equals(bird.getName())) {
                bird.observed();
                match = true;
            }
        }
        if (!match) {
            System.out.println("Not a bird!");
        }
    }
    public void printBird(String name) {
        for (Bird bird: birdList) {
            if (name.equals(bird.getName())) {
                System.out.println(bird);
            }
        }
    }

}

