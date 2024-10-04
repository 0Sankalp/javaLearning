package Questions;

public class dynamicBinding {
    void eat(){System.out.println("animal is eating...");}  
   }  
     
   class Dog extends dynamicBinding{  
    void eat(){System.out.println("dog is eating...");}  
     
    public static void main(String args[]){  
     dynamicBinding a=new Dog();  
     a.eat();  
    }  
   
    
}
