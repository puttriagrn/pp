package CONCERT;

public class Employee extends Person implements EmployeeInfo {

    public Employee(EmployeeInfo employeeInfo1) {
        super(employeeInfo1.empName(), employeeInfo1.age(), employeeInfo1.empSalary(), employeeInfo1.jobDescription());
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("Employee Name: " + employeeInfo);
        System.out.println("Age: " + employeeAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description: " + jobDescription);
    }

    @Override
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    @Override
    public void applyRaise(double raisePercentage) {
        salary += (salary * raisePercentage / 100);
    }

    private static record EmployeeInfo(String empName, int age, double empSalary, String jobDescription) {
    }
}

