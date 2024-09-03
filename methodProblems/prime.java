package methodProblems;

public class prime {

    static boolean isprime(int n)
    {    
        for(int i=2;i<n/2;i++)
        {
            if (n%i==0) 
                return false;
        }
        return true;
    }
    public static void main(String[]args){
        
        System.err.println(isprime(0));
    }
    
}
