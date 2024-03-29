package EncapsulationLab.SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName,String lastName, int age, double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;

    }

    public String getFirsName() {
        return firstName;
    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if(this.getAge()<30){
            bonus/=2;
        }
        this.setSalary(this.getSalary() + (this.getSalary()*bonus/100));
    }

    @Override
    public String toString() {
        return this.firstName+" "+this.lastName+" get "+this.salary+" USD";
    }
}
