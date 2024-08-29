package PracticeProblem;
import java.util.Scanner;


public class problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int m=n;
        int rev=0,r;

        while (n>0) 
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;

            
        }
        if (rev==m) {
            System.out.println("number is Pallindrine");

            
        }
        else
        System.out.println("number is not a Pallindrone");
       
    }

    
}
