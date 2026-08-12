class animals{
    void eat(){
        System.out.println("Animals are eating...");
    }
}
class Dog extends animals{
    void bark(){
        System.out.println("Barking...");
    }
}
public class main{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}