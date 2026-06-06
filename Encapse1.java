class Student {
    int rollNo;
    String name;
    int age;
    private String course;

    int getRollNo() {
        return this.rollNo;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    String getName() {
        return this.name;
    }

    void setName(String n) {
        this.name = n;
    }

    int getAge() {
        return this.age;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void study() {
        System.out.println(name + " is studying");
    }
}

public class Encapse1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Abhilesh");
        System.out.println("Name: " + s1.getName());

        s1.eat();
        s1.study();
    }
}