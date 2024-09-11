import java.util.*;  
public class luckyNumber {
 

 
public static int count = 2;  
//function that checks if the given number is lucky or not  
//returns 1 if the number is lucky, else returns 0  
static boolean isLuckyNumber(int n)  
{  
if(count > n)  
return true;  
if(n%count == 0)  
return false;     
//determines the position of the given number  
n = n-(n/count);  
//increments the count variable by 1  
count++;  
return isLuckyNumber(n);  
}  
//driver code  
public static void main (String args[])  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number: ");   
//reads an integer from the user  
int num=sc.nextInt();  
//calling user-defined function   
if(isLuckyNumber(num))  
System.out.println(num+" is a Lucky Number.");  
else  
System.out.println(num+" is not a Lucky Number.");  
}  
}  
    

