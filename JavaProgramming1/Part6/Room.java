import java.util.ArrayList;

public class Room {
    private ArrayList<Person> elements;

    public Room() {
        this.elements = new ArrayList<>();
    }

    public void add(Person person) {
        elements.add(person);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return elements;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        
        int shortest = elements.get(0).height;
        Person shortestPerson = elements.get(0);
        for (Person element: elements) {
            if (element.height < shortest) {
                shortest = element.height;
                shortestPerson = element;
            }
        }
        return shortestPerson;
        
    }

    public Person take() {
        if (isEmpty()) {
            return null;
        }
        Person shortestPersonRemoval = shortest();
        elements.remove(shortestPersonRemoval);
        return shortestPersonRemoval;
    }
    
}
