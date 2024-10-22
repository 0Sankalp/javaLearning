    package OOPs_Concept;

    public class constructor {
        
      
        int id;  
        String name;  
        //method to display the value of id and name  
        void display(){System.out.println(id+" "+name);}  
          
        public static void main(String args[]){  
        
        //creating objects  
        constructor s1=new constructor();  
        constructor s2=new constructor();  
        //displaying values of the object  
        s1.display();  
        s2.display();  
        }  
        }  


    //example of default constructor which displays the default values  
