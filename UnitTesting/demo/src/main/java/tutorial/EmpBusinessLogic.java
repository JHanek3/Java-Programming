package tutorial;
/*
calculate the yearly salary of an employee
the appraisal amount of an employee
*/
public class EmpBusinessLogic {
    
    //Calculate the yearly salary of the employee
    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMontlySalary() * 12;
        return yearlySalary;
    }

    //Calculate the appraisal amount of employee
    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;

        if (employeeDetails.getMontlySalary() < 10000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }

        return appraisal;
    }


}
