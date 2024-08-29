package PracticeProblem;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to display Fibonacci series");
        System.out.println(" Enter number of terms");
        int n=sc.nextInt();

        int a=0,b=1,c;
      
       System.out.println(a+","+b+",");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
            
        }
    }
    

}
