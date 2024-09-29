public class oddNumber {

public static void main(String[] args)   
{  
System.out.println("List of odd numbers: ");       
//method calling  
displayOddNumbers(1, 100);   
}   
//method that checks the number is odd or not  
private static void displayOddNumbers(int number, int end)   
{   
if(number>end)   
return;   
if(number%2!=0)   
{   
//prints the odd numbers  
System.out.print(number +" ");   
//calling the method and increments the number by 2 if the number is odd  
displayOddNumbers(number + 2, end);   
}   
else   
{   
//increments the number by 1 if the number is odd  
displayOddNumbers(number + 1, end);   
}   
}   
}  
    
