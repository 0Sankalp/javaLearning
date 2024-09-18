/*
 * Thia program is simple class creating program,here I'm just adding the details and
 * adding the foramt on which the detils are going to be filled.
 */

package OOPs_Concept;

public class student {
    
    public int roll;
    public String Name;
    public String course;
    public int m1,m2,m3;

    public int Total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)Total()/3;
    }
    public char Grade()
    {
        if (average()>=60)
        return 'A';
        else
        return 'B';
    }
    public String Details()
    {
        return "Roll No:"+roll+"\n"+"Name:"+Name+"\n"+"Course:"+course+"\n";
    }
    public static void main(String[] args) {
        student s=new student();
        s.roll=8;
        s.Name="Shreyank";
        s.course="BCA";
        s.m1=70;
        s.m2=89;
        s.m3=84;

        System.out.println("Total:"+s.Total());
        System.out.println("Average:"+s.average());
        System.out.println("Grade:"+s.Grade());
        System.out.println("Details:"+s.Details());

    }
    
        
    }

/* 
Output:
Total:243
Average:81.0
Grade:A
Details:Roll No:8
Name:Shreyank
Course:BCA
*/



