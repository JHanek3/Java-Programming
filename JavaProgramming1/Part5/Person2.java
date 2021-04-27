
import java.util.Objects;

public class Person2 {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person2(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {
        // location
        if (this == compared) {
            return true;
        }
        // type
        if (!(compared instanceof Person2)) {
            return false;
        }

        Person2 comparedPerson = (Person2) compared;

        if (this.name.equals(comparedPerson.name) &&
            this.birthday.equals(comparedPerson.birthday) &&
            this.height == comparedPerson.height &&
            this.weight == comparedPerson.weight) 
        {
            return true;
        }
        return false;
        
    }

}
