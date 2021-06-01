package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name==null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name should not be null, empty, or over 40 characters in length");
        } else {
            this.name = name;
        }
        if(age<0 || age>120) {
            throw new IllegalArgumentException("Age should not be less than 0 or over 120");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
