package methodProblems;

public class hcf {
    static int HCF(int m,int n){
        while (m!=n) 
        {
            if (m>n) m=m-n;
            else n=n-m;
            
        }
        return m;
      
    }
    public static void main(String[]args)
    {
        System.out.println(HCF(25,15)); // number to check the hcf
    }
    
}

// the hcf will be 5