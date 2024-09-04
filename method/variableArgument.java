public class variableArgument {
    static void show(int...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{3,5,7,9,11,13,15});
    }
    
}

// this program is to add variable uing method in array, here we are also adding a new array

