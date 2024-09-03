package methodProblems;

public class maxElement {
 
        public static void main(String[] args) {
            int[] array = {3, 5, 7, 2, 8}; // Example array
            int max = array[0]; // Assume the first element is the max initially
    
            // Iterate through the array to find the maximum element
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
    
            System.out.println("The maximum element is: " + max);
        }
    }
    
    
