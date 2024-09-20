package arrayQuestion;

public class jaggedAraay {
    
 
        public static void main(String[] args) {  
              
            // create a jagged array with three rows  
            int[][] jaggedArray = {  
                {1, 2, 3},   // first row has three columns  
                {4, 5},      // second row has two columns  
                {6, 7, 8, 9} // third row has four columns  
            };  
              
            // loop through each row of the jagged array  
            for (int i = 0; i < jaggedArray.length; i++) {  
                  
                // loop through each column of the current row  
                for (int j = 0; j < jaggedArray[i].length; j++) {  
                      
                    // print the value at the current position in the array  
                    System.out.print(jaggedArray[i][j] + " ");  
                }  
                  
                // move to the next line for the next row  
                System.out.println();  
            }  
        }  
    }  

    /*
     * A jagged array in Java is a collection of arrays where each array may contain a varied number of elements. 
     * A two-dimensional array, in contrast, requires all rows and columns to have the same length.
     */