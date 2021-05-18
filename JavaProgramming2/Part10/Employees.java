package Part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private List<Person01> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person01 personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person01> peopleToAdd) {
        for (Person01 person: peopleToAdd) {
            this.employees.add(person);
        }
    }

    public void print() {
        Iterator<Person01> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        if (this.employees.size() == 1) {
            for (Person01 person: this.employees) {
                if (person.getEducation() == education) {
                    System.out.println(person);
                }
            }

        } else {
            Iterator<Person01> iterator = employees.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getEducation() == education) {
                    System.out.println(iterator.next());
                }
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person01> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
