package by.zimin;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company("IBM", 232454, "USA", 346567, 50_000);
        Company company2 = new Company("Google", 1212234, "USA", 658798, 500_000);

        Employee employee1 = new Employee("Masha", "Ivanova", company1, "Developer");
        Employee employee2 = new Employee("Artur", "Zimin", company2, "Developer");

        employee2.companyInfo(employee2);

    }
}
