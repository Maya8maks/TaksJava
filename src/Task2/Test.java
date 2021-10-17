package Task2;

public class Test {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        int size = 5;
        Employee[] employees = new Employee[size];
        employees = employeeFactory.getRandomEmployees(size);

        EmployeeService employeeService = new EmployeeService(employees);
        employeeService.printEmployees();
        employeeService.calculateSalaryAndBonus();
        employeeService.getById(1L);
        employeeService.getByName("Jane");

        employeeService.sortByName();

        employeeService.sortByNameAndSalary();

        employeeService.edit(employeeFactory.getRandomEmployees(1)[0]);

        employeeService.remove(3L);
        employeeService.add(employeeFactory.getRandomEmployees(1)[0]);

    }

}
