package by.zimin;

public class Employee {

    private String firstName;
    private String lastName;
    private Company company;
    private String position;


    public Employee(String firstName, String lastName, Company company, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void companyInfo(Employee employee) {
        System.out.println("Company :" + employee.getCompany().getName());
        System.out.println("Company index: " + employee.getCompany().getIndex());
        System.out.println("Company ID: " + employee.getCompany().getId());
        System.out.println("Company location: " + employee.getCompany().getLocation());
        System.out.println("The number of employees: " + employee.getCompany().getNumberOfEmployees());


    }
}
