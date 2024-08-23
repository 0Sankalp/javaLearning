// there are two paramete prsent formal paramete and actual aprameter
package method;

public class simplemethod {
    static int max(int x,int y)
    {
        if(x>y)
        return x;    // these are formal paramter 
        else
        return y;

    }
    public static void main(String[] args) {
        int a=10,b=15,c;
        c=max(a,b);                  // this is actual parameter
        System.out.println(c);
    }
    
}



