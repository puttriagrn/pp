package CONCERT;

public class Person {
    protected String employeeInfo;
    protected int employeeAge;
    protected double salary;
    protected String jobDescription;

    public Person(String empName, int age, double empSalary, String jobDescription) {
        employeeInfo = empName;
        employeeAge = age;
        salary = empSalary;
        this.jobDescription = jobDescription;
    }
}
