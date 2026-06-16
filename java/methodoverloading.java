class Adder {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class methodoverloading {

    public static void main(String[] args) {

        Adder A1 = new Adder();

        System.out.println(A1.add(11, 22));
        System.out.println(A1.add(11, 11, 11));

    }

}