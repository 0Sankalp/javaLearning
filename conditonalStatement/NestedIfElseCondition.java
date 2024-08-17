
public class NestedIfElseCondition {
    public static void main(String[] args) {
        double totalMarks = 382;
        double perc = (totalMarks / 500) * 100;
        String grade; // Declaring grade variable outside if-else blocks

        if (perc >= 80) {
            grade = "A+";
        } else if ((perc >= 70) && (perc < 80)) {
            grade = "A";
        } else if ((perc >= 60) && (perc < 70)) {
            grade = "B+";
        } else {
            grade = "B";
        }

        System.out.println("The percentage of the student is: " + perc);
        System.out.println("\nThe grade of the student is: " + grade);
    }
}
