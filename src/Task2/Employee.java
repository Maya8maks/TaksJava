package Task2;

public class Employee implements Cloneable{
    long id;
    String name;
    int age;
    int salary;
    String gender;
    int fixedBugs;
    int defaultBugRate;

    public Employee(){};

    public Employee(long id,  int age, String name, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public int getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public void setDefaultBugRate(int defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    @Override
    public String toString() {
        String info = "id = " + id +
                ",name = " + name +
                ",age = " + age +
                ",gender = " + gender +
                ",salary = " + salary;

        return info;
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
    int getFullSalary() {
        return salary;
    }

}
