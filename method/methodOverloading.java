/* Method overloading-
 * writting more than one method having samen name but differnt datatype.
 * diffrence are there in parameter list
 * number of parameter are diffrent
 * In the given program you will going to see hoe the method overloading works
 */



 public class methodOverloading {
 
     int max(int x,int y)// these are two parameter given
     {
         return x>y?x:y;
     }
 
     float max(float x,float y)// for finding diff bw decimal number using float
     {
         return x>y?x:y;
 
     }
 
     int max(int x,int y,int z)// for finding diff bw three number
     {
         return x>y&&x>z?x:(x>z?y:z);
     }
 
     
 }
 