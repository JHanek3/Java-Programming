package Part10;


public class MainProgram04 {

    public static void main(String[] args) {
        // test your classes here
        // Person01 anna = new Person01("Anna", Education.PHD);
        // System.out.println(anna);
        // Employees university = new Employees();
        // university.add(new Person01("Petrus", Education.PHD));
        // university.add(new Person01("Arto", Education.HS));
        // university.add(new Person01("Elina", Education.PHD));

        // university.print();
        // university.print(Education.PHD);

        // university.fire(Education.HS);

        // System.out.println("==");

        // university.print();
        Employees t = new Employees(); 
        Person01 h = new Person01("Arto", Education.PHD); 
        t.add(h); 
        t.print(Education.PHD); 
    }
}

