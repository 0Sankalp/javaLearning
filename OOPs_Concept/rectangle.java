package OOPs_Concept;

public class rectangle {
    public double length;
    public double breadth;
     public double Area()
     {
        return length*breadth;
     }

     public double perimeter()
     {
        return 2*(length+breadth);
     }
     public boolean isSquare()
     {
        //return length==breadth
        if (length==breadth) 
        return true;
        else
        return false;    
        
     }
     public static void main(String[] args) {
        rectangle r=new rectangle();
        r.length=10.5;
        r.breadth=12;

        System.out.println("Area:"+r.Area());
        System.out.println("Permiter"+r.perimeter());
        System.out.println("It is a sqaure"+r.isSquare());
     }
    
}
