interface A{
    void pay();
    void display();
    default void show(){
        System.out.println("Hi from ");
    }
}
interface B{
    void pay();
    default void display(){
        System.out.println("Hi From B");
    }
}

class UPI implements A, B{
    public void pay(){
        System.out.println("Payment done by UPI ");
    }
    public void display(){
        System.out.println("Hi from A");
        B.super.display();
    }
}

public class Interface {
    public static void main(String[] args) {
        A a = new UPI();
        a.pay();
        B b = new UPI();
        b.pay();
        UPI u = new UPI();
        u.pay();
        u.display();

    }
}