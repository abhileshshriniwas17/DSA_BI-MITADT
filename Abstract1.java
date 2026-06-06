abstract class Animal {
    int no_of_legs;
    String color;
    String modes_of_food;
    
    void eat(){
    System.out.println("Eating Time........Dont Disturb me !!!!!");
    
}
    void sleep(){
          System.out.println("Sleeping");

            }


    abstract void speak();

        }
        class Rabbit extends Animal{
            void speak(){
                System.out.println("Rabbit is saying  ..........Something");
            }

            void jumping(){
                System.out.println("Rabbit is Jumping  ..........");
            }
        }
public class Abstract1 {
    public static void main(String[] args) {
        Rabbit chiku = new Rabbit();
        chiku.jumping();
        chiku.eat();
        chiku.color="white with black patches";
        System.out.println(chiku.color);
        }
}
