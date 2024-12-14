public class Employee extends Person {

    private String employeeID;
    private String department;

    public Employee() {
        super();
        this.employeeID = "Unknown";
        this.department = "Unknown";
    }

    public Employee(String name, String address, int age, String employeeID, String department) {
        super(name, address, age);
        this.employeeID = employeeID;
        this.department = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

