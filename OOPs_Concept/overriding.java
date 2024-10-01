package OOPs_Concept;

public class overriding 
    
{  
public void bark()  
{  
System.out.println("woof ");  
}  
}  
class Hound extends Dog  
{  
public void sniff()  
{  
System.out.println("sniff ");  
}  
//overrides the method bark() of the Dog class  
public void bark()  
{  
System.out.println("bowl");  
}  
 

public static void main(String args[])  
{  
Dog dog = new Hound();  
//invokes the bark() method of the Hound class  
dog.bark();  
}  
}  

