/*
 * A number is said to be nude number if all the digits of the number is the factor of that number.
 *  In short, nude numbers are those numbers that expose their factor.
 */


    public class NudeNumbers  
{  
// a method that finds out the total  
// number of digits present in the number n or not  
public int countDig(int n)  
{  
int count = 0;  
while(n != 0)  
{  
count = count + 1;  
n = n / 10;  
}  
return count;  
}  
// a method that checks whether  
// the number n is Nude or not  
public boolean isNudeNum(int n)  
{  
int digCount = countDig(n);  
// creating a copy of the number n  
int m = n;  
while(m != 0)  
{  
int dig = m % 10;  
if(dig == 0)  
{  
    // 0 cannot divide any number hence  
    // the number is not a nude number  
    return false;  
}  
if(n % dig != 0)  
{  
// reaching here means we have got at least  
// digit that does not divide the number n completely  
return false;  
}  
m = m / 10;  
}  
// reaching here means  
// each digit of the number is the   
// factor of the number n  
return true;  
}  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class NudeNumbers  
NudeNumbers obj = new NudeNumbers();  
int m = 10;  
int n = 60;  
System.out.println("Nude numbers between " + m + " to " + n + " are:");  
// a loop that checks the Nude numbers from 10 to 60  
for(int i = m; i <= n; i++)  
{  
if(obj.isNudeNum(i))  
{  
System.out.print(i + " ");  
}  
}  
}  
}

    

