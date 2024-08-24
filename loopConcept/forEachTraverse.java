package loopConcept;
import java.util.*;  

public class forEachTraverse {
    

  public static void main(String args[]){  
   //Creating a list of elements  
   ArrayList<String> list=new ArrayList<String>();  
   list.add("Shreya");  
   list.add("Sankalp");  
   list.add("Dwarika");  
   //traversing the list of elements using for-each loop  
   for(String s:list){  
     System.out.println(s);  
   }  
  
 }   
}  


