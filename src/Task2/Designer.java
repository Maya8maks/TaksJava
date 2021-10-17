package Task2;

import java.util.Random;

public class Designer extends Employee {

    int rate;
    int workedDays;

    public Designer(int id, int age, String name, String gender, int salary, int rate, int workedDays) {
        super(id, age, name, gender, salary);
        this.rate = rate;
        this.workedDays = workedDays;
    }

    int getFullSalary() {
        Random random = new Random();
        int calcSalary = salary + (rate * workedDays);
        return calcSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rate=" + rate +
                ", workedDays=" + workedDays;
    }
}
