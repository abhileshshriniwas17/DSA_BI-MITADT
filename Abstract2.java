abstract class Animal {
    int no_of_legs;
    String color;
    String modes_of_food;

    Animal(int no_of_legs, String color, String modes_of_food) {
        this.no_of_legs = no_of_legs;
        this.color = color;
        this.modes_of_food = modes_of_food;
    }

    void eat() {
        System.out.println("Eating Time........Dont Disturb me !!!!!");
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    abstract void speak();

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }
}

abstract class Bird extends Animal {
    Bird(int no_of_legs, String color, String modes_of_food) {
        super(no_of_legs, color, modes_of_food);
    }

    abstract void fly();

    abstract void seat();

    void drink() {
        System.out.println("Drinking");
    }

    void drink2() {
        System.out.println("Drinking again");
    }
}

class Sparrow extends Bird {
    Sparrow() {
        super(2, "Brown", "Seeds");
    }

    void speak() {
        System.out.println("Sparrow is saying ..........Something");
    }

    void fly() {
        System.out.println("Sparrow is flying ..........");
    }

    void seat() {
        System.out.println("Sparrow is seating ..........");
    }
}

class Rabbit extends Animal {
    Rabbit() {
        super(4, "White", "Grass");
    }

    void speak() {
        System.out.println("Rabbit is saying ..........Something");
    }

    void jumping() {
        System.out.println("Rabbit is Jumping ..........");
    }
}

class Crow extends Bird {
    Crow() {
        super(2, "Black", "Omnivore");
    }

    void speak() {
        System.out.println("Crow is saying ..........Something");
    }

    void fly() {
        System.out.println("Crow is flying ..........");
    }

    void seat() {
        System.out.println("Crow is seating ..........");
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Rabbit chiku = new Rabbit();
        Crow cr = new Crow();
        Sparrow sp = new Sparrow();

        cr.fly();
        cr.seat();
        cr.drink();
        cr.speak();

        sp.fly();
        sp.seat();
        sp.drink();
        sp.speak();

        chiku.jumping();
        chiku.eat();
        chiku.speak();

        chiku.setColor("White with black patches");
        System.out.println(chiku.getColor());

        Animal a = new Rabbit();
        a.speak();
    }
}