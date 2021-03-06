package tutorial;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeDetailsTest {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    // test to check appraisal
    @Test
    public void testCalculateAppraisal00() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    @Test
    public void testCalculateAppraisal01() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(10001);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(1000, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }
}
