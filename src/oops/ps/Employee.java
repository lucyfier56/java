package oops.ps;


abstract class Employee {

    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }


    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public abstract void work();
}
