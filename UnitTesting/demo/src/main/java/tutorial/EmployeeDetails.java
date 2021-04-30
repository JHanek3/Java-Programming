package tutorial;
/*
get/set value of employee's name
get/set value of employee's monthly salary
get/set value of employee's age
*/

public class EmployeeDetails {
    private String name;
    private double monthlySalary;
    private int age;

    public String getName() {
        return name;
    }

    public double getMontlySalary() {
        return monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
