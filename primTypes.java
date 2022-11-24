public class primTypes {

    // Find the min and max value of wrapper class Integer to set an int to
    static int myMinIntValue = Integer.MIN_VALUE;
    static int myMaxValue = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("This is the min value: " + myMinIntValue);

        System.out.println("This is the max value: " + myMaxValue);

        System.out.println("Min to Max value range (" + myMinIntValue + " to " + myMaxValue + ")");
        
        //Try adding & subracting a number to the Max and Min value
                //The outcome is negative (overflow) we tried to put too large num
                System.out.println("Add 1 to Max: " + (myMaxValue + 1));
                //Underflow
                    System.out.println("Subract 1 to Min " + (myMinIntValue - 1));
    }

}
  