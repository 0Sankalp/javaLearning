import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int year=sc.nextInt();
        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    System.out.println("Its a leap year");
                }
                else
                System.out.println("Not a Leap year");
            }
            else
            {
                System.out.println("Its a leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }

    }
    
}
