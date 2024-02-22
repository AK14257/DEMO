public class MyExClass extends Exception {
 public MyExClass(String message) {
 super(message);
 }
 public static void main(String[] args) {
 try {
 // Example of using MyExClass
 validateString("HelloWorld"); // This will throw an exception
 } catch (MyExClass ex) {
 System.out.println("Caught an exception: " + ex.getMessage());
 }
 }
 public static void validateString(String input) throws MyExClass {
 if (input.length() > 10) {
 throw new MyExClass("String too large");
 } else {
 System.out.println("Valid string: " + input);
 }
 }
}
