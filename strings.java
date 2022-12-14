public class strings {
    static String myString = "This is my string";
    static String myNewString = "I wish I had \u00241,000,000.00";
    static String numberString = "250.55";
    static String numberStrings = numberString + "49.45";
    static String lastString = "10";
    static int myInt = 50;
    static double doubleNumber = 120.47; 
    public static void main(String[] args) {
        System.out.println("My string: " + myString + ", THIS IS MORE! ");
        System.out.println("My string: " + myNewString + " and I want more");

        System.out.println(numberString + "\n" + numberStrings);

        System.out.println(lastString + myInt);
        System.out.println(lastString + myInt + doubleNumber);
        //Cannot add a string to an Int it will only concatenate
    }
}
