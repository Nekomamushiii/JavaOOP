package EncapsulationLab.ReverseTeam;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName.length() < 3)
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3)
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        this.lastName = lastName;
    }

    protected final int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0)
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 460)
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }

}
