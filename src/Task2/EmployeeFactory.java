package Task2;

import java.util.Random;

public class EmployeeFactory {

    String[] names = {"Anna:Female", "Bob:Male", "Jane:Female", "Tom:Male", "Maks:Male" , "Lina:Female"};

    String[] employeeType = {"Developer", "Manager", "Designer"};
    String type;


    Employee[] getRandomEmployees(int size) {

        Employee[] randomEmployees = new Employee[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            String nameRandom = names[random.nextInt(names.length)];
            count = i+1;

            type = getRandomEmployeeType();

            if (type == "Developer") {
                Employee employee = new Developer(count, getRandomAge(), nameRandom.split(":")[0], nameRandom.split(":")[1], getRandomSalary(), getRandomFixedBugs());
                randomEmployees[i] = employee;
            }
            if (type == "Manager") {
                Employee employee = new Manager(count, getRandomAge(), nameRandom.split(":")[0], nameRandom.split(":")[1], getRandomSalary());
                randomEmployees[i] = employee;
            }
            if (type == "Designer") {
                Employee employee = new Designer(count, getRandomAge(), nameRandom.split(":")[0], nameRandom.split(":")[1], getRandomSalary(), getRandomRate(), getRandomWorkedDays());
                randomEmployees[i] = employee;
            }



        }
        return randomEmployees;
    }


    int getRandomSalary () {
        Random random = new Random();
        return random.nextInt(5000) +1000;
    }
    int getRandomAge () {
        Random random = new Random();
        return random.nextInt(60) + 18;
    }
    int getRandomFixedBugs () {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
    int getRandomRate () {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }
    int getRandomWorkedDays () {
        Random random = new Random();
        return random.nextInt(21) + 1;
    }
    String getRandomEmployeeType () {
        Random random = new Random();
        String typeRandom = employeeType[random.nextInt(employeeType.length)];
        return typeRandom;
    }

}
