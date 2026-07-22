public class VariablesDemo{
    int instancevar = 10;
    static String staticvar = "I am static";
    public void showvariables(){
        int localvar = 5;
        System.out.println("Instance variable:"+instancevar);
        System.out.println("Local variable:"+localvar);
    }
    public static void main(String[] args){
        VariablesDemo obj = new VariablesDemo();
        obj.showvariables();
        System.out.println("Acessing static variable via class:"+VariablesDemo.staticvar);
    }
}