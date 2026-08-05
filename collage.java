class  collage{
    String name;
    static String collage = "SCSVMV";
    collage(String n){
        name = n;
    }
    void display(){
        System.out.println(name + "-" + collage);

    }
    public static void main(String[] arg){
        collage s1 = new collage("deva");
        collage s2 = new collage("priyan");

        s1.display();
        s2.display();
    }
}