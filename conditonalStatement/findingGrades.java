import java.util.Scanner;

public class findingGrades {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter marks of 3 Subject");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;

        if(avg>=90)
        {
            System.out.println("A Grade");
        }
        else if (avg>=85 && avg<70) {
            System.out.println("Grade B");
            
        }
        else
        {
            System.out.println("Grade C");
        }

    }
    
}
