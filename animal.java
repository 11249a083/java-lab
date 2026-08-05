class animal {
    final void sound() {
        System.out.println("Animal make sound");
    }
}
class finalDemo{
    public static void main(String[] args) {
        animal a = new animal();
        a.sound();
    }
}