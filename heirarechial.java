class vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class car extends vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class bike extends vehicle {
    void ride() {
        System.out.println("Bike is riding...");
    }
}

public class heirarechial{
    public static void main(String[] args) {

        car c = new car();
        c.start();
        c.drive();

        bike b = new bike();
        b.start();
        b.ride();
    }
}