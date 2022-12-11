public class floatDouble {
    static float myFloatMax = Float.MAX_VALUE;
    static float myFloatMin = Float.MIN_NORMAL;
    static double myDoubleMax = Double.MAX_VALUE;
    static double myDoubleMin = Double.MIN_VALUE;
    //Show differences between types
   static int myInt = 5;
   static float myFloat = 6;
   static double myDouble = 6.089;
    
   static float myNewFloat = (float) 5.25;
   static float myOtherFloat = 5.38f;

    public static void main(String[] args) {
        System.out.println("float width: 32 bits in width, min value: 1.4E-45, max value: 3.4028235E38");
        //Check Float values
        System.out.println("---Check the values of float: " + myFloatMin + " to " + myFloatMax);
        System.out.println("double width: 64 bits in width, min value: 4.9E-324, max value: 1.7976932348623157E308");
        System.out.println("---Check the values of Double: " + myDoubleMin + " to " + myDoubleMax);
        //Check the differences between the types
        System.out.println("Check difference in types: " + "Int: " + myInt + "\n" + "Float: " + myFloat + "\n" + "Double: " + myDouble);
        System.out.println("Show how to cast the value from Double to Float: " + myNewFloat);
        System.out.println("Show to refrain from having to cast Float: " + myOtherFloat);

    }

}
//use a floating point number when we need more precision
//double: java's default type for any decimal or real number
//float: used when both the width and precision of the type... Precision refers to the format and amount of space occupied by the relevant type
//float width: 32 bits in width, min value: 1.4E-45, max value: 3.4028235E38
//double width: 64 bits in width, min value: 4.9E-324, max value: 1.7976932348623157E308