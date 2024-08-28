package PracticeProblem;
import java.util.Scanner;

// reversing a number
public class problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int rev=0,r;

        while (n>0) 
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;

            
        }
        System.out.println("Revrse Number"+rev);
    }

    
}
