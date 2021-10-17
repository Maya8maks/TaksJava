import java.util.Random;

public class EmployeeFactory {

    String[] names = {"Anna:Female", "Bob:Male", "Jane:Female", "Tom:Male", "Maks:Male" , "Lina:Female"};

    Employee[] getRandomEmployees(int size) {
        Random random = new Random();

        Employee[] randomEmployees = new Employee[size];

        for (int i = 0; i < size; i++) {
            Employee employee = new Employee();
            employee.id = i + 1;
            employee.age = random.nextInt(100) + 18;
            String nameRandom = names[random.nextInt(names.length)];
            employee.name = nameRandom.split(":")[0];
            employee.gender = nameRandom.split(":")[1];
            employee.fixedBugs = random.nextInt(10) + 1;
            employee.salary = random.nextInt(10000) +1000;
            employee.defaultBugRate = random.nextInt(5) +1;

            randomEmployees[i] = employee;
        }
        return randomEmployees;
    }


}
