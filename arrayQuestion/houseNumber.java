public class houseNumber {
    
    

// a method to find the value of the house number  
// located at the position s  

    
    // A method to find the value of the house number located at the position s  
    public int findhouseNum(int s) {
        // For s == 0, the house number is always 1  
        if(s == 0) {
            return 1;
        }
        
        // Variable to hold the house number
        int num = 0;
        
        // First part: (s + 1) ^ 3
        num = (s + 1) * (s + 1) * (s + 1);
        
        // Second part: Sum of squares from 1^2 + 2^2 + ... + s^2  
        for(int i = 1; i <= s; i++) {
            num = num + (i * i);
        }
        
        return num;
    }
    
    // Main method  
    public static void main(String[] args) {
        // Creating an object of the class HouseNumber  
        houseNumber obj = new houseNumber();
        
        System.out.println("The first " + 10 + " house numbers are: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(obj.findhouseNum(i) + " ");
        }
    }
}




/*
output:
The first 10 house numbers are:
1 9 32 78 155 271 434 652 933 1285 */