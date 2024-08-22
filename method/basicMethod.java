import java.util.Scanner; 

package method;
 

public class basicMethod {
   
    public static void main (String args[])  
    {  
    //creating Scanner class object     
    Scanner scan=new Scanner(System.in);  
    System.out.print("Enter the number: ");  
    //reading value from the user  
    int num=scan.nextInt();  
    //method calling  
    findEvenOdd(num);  
    }  
}