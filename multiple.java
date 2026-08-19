interface father{
    void show();
}
interface mother extends father{
    void show();
}
class child1 implements father, mother{
    public void show(){
        System.out.println("This is father");
        System.out.println("This is mother");
    }
}
public class multiple {
    public static void main(String[] args) {
        child1 c = new child1();
        c.show();
    }
}