package PracticeProblem;

import java.util.Scanner;

public class problem2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;

        }
        System.out.println("Sum of"+n+"Number is "+sum);
    }
    
}
