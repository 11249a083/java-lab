public class exception{
    public static void main(String[] args){
        int a = 7;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("can't be divided by 0");
        }
        finally{
            System.out.println("program exicuted successfully !!");
        }
    }
} 