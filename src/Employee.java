public class Employee implements Cloneable{
    int id;
    String name;
    int age;
    int salary;
    String gender;
    int fixedBugs;
    int defaultBugRate;

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
