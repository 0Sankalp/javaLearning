class animal{
    String name;
    String color;

    public void voice(){
    System.out.println("barke");
}
}

public class oops {
    public static void main(String[] args) {
        animal dog = new animal();
        dog.name="max";
        dog.color="black";
        
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.voice();
    }
    
}
