package PracticeProblem;

import java.util.Scanner;

public class problem3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int  n=sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is"+fact);
    
}
}
