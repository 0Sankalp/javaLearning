package methodProblems;

public class sum {
    // Method to calculate the sum of varargs
    public static int sum(int... A) {
        int sum = 0;
        // Loop to iterate through the elements of the array A
        for (int i = 0; i < A.length; i++) {
            sum += A[i]; // Adding each element to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sum(10, 20, 30,40,50); // Passing variable arguments
        System.out.println("The sum is: " + result); // Output: 60
    }
}
