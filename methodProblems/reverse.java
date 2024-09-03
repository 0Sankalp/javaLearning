// overladed method to reverse a int or array
package methodProblems;

public class reverse {
    int reverse(int n)
    {
    int rev=0;

    while (n!=0) 
        {
        rev=rev*10+n%10;
        n=n/10;
    }
    return rev;
    
}
public static void main(String[] args) {
    
}
}
