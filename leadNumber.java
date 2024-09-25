import java.util.Scanner;  
public class leadNumber
 {
   
 
static boolean isLead(int number)   
{  
//variables stores the sum of odd and even digits respectively      
int oddSum = 0, evenSum = 0;  
//loop executes untill the given number becomes 0  
for (int i = number; i != 0; i = i/10)   
{  
//determines the last digit      
int currentDigit = i % 10;  
//check the digit is even or not  
if (currentDigit % 2 == 0)  
//if digit is even add it to the variable evenSum  
evenSum = evenSum+currentDigit;  
//if digit is odd add it to the variable oddSum  
else oddSum = oddSum+currentDigit;  
}  
//compares the sum of even and odd digits  
return evenSum == oddSum;  
}  
//drive code  
public static void main(String args[])   
{  
Scanner sc=new Scanner(System.in);      
System.out.print("Enter a number: ");  
//reads an integer from the user  
int number=sc.nextInt();  
System.out.printf("It's%sa Lead number", isLead(number) ? " " : " not ");  
}  


}
