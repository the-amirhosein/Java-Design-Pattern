package Composite;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer(100, "Gholi", "Java developer");
        Developer developer2 = new Developer(101, "Eli", "Java developer");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(developer1);
        engDirectory.addEmployee(developer2);

        Manager manager1 = new Manager(200, "Goli", "SEO Manager");
        Manager manager2 = new Manager(201, "Ali", "Goli's Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(manager1);
        accDirectory.addEmployee(manager2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();

    }
}
