package methodProblems;

public class validate {
    // Overloaded method to validate the name
    boolean validate(String name) {
        // Regex to match alphabets and spaces
        return name.matches("[a-zA-Z\\s]+");
    }

    // Overloaded method to validate the age
    boolean validate(int age) {
        // Age should be between 3 and 15 (inclusive)
        return age >= 3 && age <= 15;
    }

    public static void main(String[] args) {
        // Creating an object of the Validate class to test the methods
        validate validator = new validate();

        // Testing the name validation
        System.out.println(validator.validate("John Doe")); // true (valid name)
        System.out.println(validator.validate("John123"));  // false (invalid name)

        // Testing the age validation
        System.out.println(validator.validate(10));  // true (valid age)
        System.out.println(validator.validate(2));   // false (invalid age)
    }
}
