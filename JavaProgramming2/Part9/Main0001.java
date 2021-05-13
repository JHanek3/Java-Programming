package Part9;
import java.util.ArrayList;

public class Main0001 {
    
    public static void main(String[] args) {
        // Write tests here
        // Person00 ada = new Person00("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        // Person00 esko = new Person00("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        // System.out.println(ada);
        // System.out.println(esko);

        // // Student00 ollie = new Student00("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        // // System.out.println(ollie);
        // // System.out.println("Study credits " + ollie.credits());
        // // ollie.study();
        // // System.out.println("Study credits "+ ollie.credits());
        // Student00 ollie = new Student00("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        // System.out.println(ollie);
        // ollie.study();
        // System.out.println(ollie);

        // Teacher00 ada = new Teacher00("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        // Teacher00 esko = new Teacher00("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        // System.out.println(ada);
        // System.out.println(esko);

        // Student00 ollie = new Student00("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        // int i = 0;
        // while (i < 25) {
        // ollie.study();
        // i = i + 1;
        // }
        // System.out.println(ollie);

        

        ArrayList<Person00> persons = new ArrayList<Person00>();
        persons.add(new Teacher00("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student00("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
    public static void printPersons(ArrayList<Person00> persons) {
        for (Person00 person: persons) {
            System.out.println(person);
        }
    }
}
