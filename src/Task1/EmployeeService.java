package Task1;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeService {
    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    int calculateSalaryAndBonus() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.salary + calculateBonus(employee.fixedBugs, employee.defaultBugRate);
        }

        return sum;
    }

    Employee getById(long id) {

        for (Employee employee : employees) {
            if (employee.id == id) {

                return employee;
            }
        }
        return null;
    }

    Employee[] getByName(String name) {
        Employee[] employeesArray = new Employee[employees.length];
        int index = 0;
        for (Employee employee : employees) {
            if (employee.name == name) {
                employeesArray[index] = employee;
                index++;
            }
        }
        Employee[] employeesByName = new Employee[index + 1];
        for (int i = 0; i <= index; i++) {
            employeesByName[i] = employeesArray[i];
        }

        return employeesByName.length > 0 ? employeesByName : null;
    }

    Employee[] sortByName() {
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        return employees;
    }

    Employee[] sortByNameAndSalary() {
        sortByName();
        Employee newEmployee;
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length; j++) {
                if (employees[i].name.equals(employees[j].name) && employees[j].salary > employees[i].salary) {
                    newEmployee = employees[i];
                    employees[i] = employees[j];
                    employees[j] = newEmployee;
                }
            }
        }
        return null;
    }

    Employee edit(Employee employee) {
        Employee searchEmployee = getById(employee.id);
        Employee oldEmployee = null;
        if (searchEmployee != null) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].id == employee.id) {
                    oldEmployee = employees[i];
                    employees[i] = employee;
                    break;
                }
            }
        }

        return oldEmployee;
    }

    Employee remove(long id) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].id == id) {
                index = i;
                break;
            }
        }
        Employee[] newEmployeesArray = new Employee[employees.length - 1];
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i != index) {
                newEmployeesArray[counter] = employees[i];
                counter++;
            }
        }
        Employee removeEmployee = employees[index];
        employees = newEmployeesArray;

        return removeEmployee;
    }

    int calculateBonus(int fixedBugs, int defaultBugRate) {
        int bonus = 0;
        if (fixedBugs > 0 && defaultBugRate > 0) {
            bonus = fixedBugs * defaultBugRate / 100;
        }
        return bonus;
    }


}
