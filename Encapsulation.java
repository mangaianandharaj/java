// Encapsulated Class
public class Encapsulation {
    private String name;
    private int age;
    private int roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

// Main Class to Test Encapsulation
public class Main {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        obj.setAge(21);
        obj.setRoll(101);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll Number: " + obj.getRoll());
    }
}
