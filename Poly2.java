class A {
    void show() {
        System.out.println("Showing from A");
    }
}

class B extends A {
    void show() {
        System.out.println("Showing from B");
    }
}

public class Poly2 {
    public static void main(String[] args) {
        A b = new B();
        b.show();
    }
}