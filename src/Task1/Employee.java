package Task1;

public class Employee implements Cloneable {
    long id;
    String name;
    int age;
    int salary;
    String gender;
    int fixedBugs;
    int defaultBugRate;

    public Employee() {
    }

    public Employee(long id, String name, int age, int salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString() {
        String info = "id = " + id +
                ",name = " + name +
                ",age = " + age +
                ",gender = " + gender +
                ",salary = " + salary +
                ",fixedBugs = " + fixedBugs +
                ",defaultBugRate = " + defaultBugRate;
        return info;
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

}
