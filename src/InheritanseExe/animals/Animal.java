package InheritanseExe.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private void setName(String name) {
        if(name.trim().isEmpty())
            throw new IllegalArgumentException("Invalid input!");
        this.name = name;
    }

    private void setAge(int age) {
        if(age<=0)
            throw new IllegalArgumentException("Invalid input!");
        this.age = age;
    }

    private void setGender(String gender) {
        if(!gender.equals("Male") && !gender.equals("Female"))
            throw new IllegalArgumentException("Invalid input!");
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public  String produceSound(){return null;};

    @Override
    public String toString() {
        return String.format("%s\n", this.getClass().getSimpleName()) +
                String.format("%s %s %s\n", this.getName(), this.getAge(), this.getGender()) +
                String.format("%s", this.produceSound());
    }
}
