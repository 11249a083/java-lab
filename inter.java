interface car{
    void stop();
    void start();
}
class toyota implements car{
    public void stop(){
        System.out.println("Toyota stopped");
    }
    public void start(){
        System.out.println("Toyota started");
    }
    void drive(){
        System.out.println("Toyota is driving");
    }
}
public class inter{
    public static void main(String[] args) {
        toyota t = new toyota();
        t.start();
        t.drive();
        t.stop();
    }
}