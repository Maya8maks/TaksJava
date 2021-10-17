package Task2;

import java.util.Random;

public class Developer extends Employee {

    int fixedBugs;
    int rate = 2;

    public Developer(int id, int age, String name,String gender,  int salary, int fixedBugs) {
        super(id, age, name, gender, salary);
        this.fixedBugs = fixedBugs;
    }

    int getFullSalary() {
        Random random = new Random();
        int calcSalary = salary + (fixedBugs * rate * (random.nextBoolean() ? 2 : 0));
        return calcSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", fixedBugs=" + fixedBugs ;
    }

}
