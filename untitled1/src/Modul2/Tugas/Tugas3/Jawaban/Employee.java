package Modul2.Tugas.Tugas3.Jawaban;

public class Employee extends Person implements EmployeeInterface {

    public Employee(String employeeName, int employeeAge, double salary, String jobDescription) {
        super(employeeName, employeeAge, salary, jobDescription);
    }

    @Override
    public void e() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description: " + jobDescription);
    }

    @Override
    public double c() {
        return salary * 12;
    }

    @Override
    public void s(double raisePercentage) {
        salary += (salary * raisePercentage / 100);
    }
}

