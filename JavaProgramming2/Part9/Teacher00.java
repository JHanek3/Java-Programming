package Part9;

public class Teacher00 extends Person00 {
    private int salary;

    public Teacher00(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s\n\s\ssalary %d euro/month", super.toString(), getSalary());
    }
}
