public class Null_pointer {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Exception Message: " + e.getMessage());
            System.out.println("Exception class name: " + e.getClass());

            // Stack trace
            System.out.println("Stack Trace:");
            e.printStackTrace();
        }

        System.out.println("Program Continue");
    }
}