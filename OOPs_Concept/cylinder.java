package OOPs_Concept;

public class cylinder {
    
    public double radius;
    public double height;
     public double Area()
     {
        return Math.PI*radius*radius;
     }

     public double totalSurfacearea()
     {
        return 2*Area()+Circumference()*height;
     }
     public double Circumference()
     {    
        return 2*Math.PI*radius;
     }
     public double volume()
     {
        return Area()*height;
     }
     public static void main(String[] args) {
        cylinder c=new cylinder();
        c.radius=7;
        c.height=10;

        System.out.println("Area:"+c.Area());
        System.out.println("Total Area"+c.totalSurfacearea());
        System.out.println("Volume"+c.volume());
     }
    
}

    

