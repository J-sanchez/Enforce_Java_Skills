public class primTypes {

    // Find the min and max value of wrapper class Integer to set an int to
    static int myMinIntValue = Integer.MIN_VALUE;
    static int myMaxValue = Integer.MAX_VALUE;
    static int myMinIntTest = 2_147_483_647;

    // Find the min and max value of wrapper class Byte to set an byte to

    static byte myMinByteValue = Byte.MIN_VALUE;
    static byte myMaxByteValue = Byte.MAX_VALUE;
    static byte myMinByteTest = 127;

// Find the min and max value of wrapper class Short to set an short to

    static short myMinShortValue = Short.MIN_VALUE;
    static short myMaxShortValue = Short.MAX_VALUE;

    //Type Long
    static long myLongSize = Long.SIZE;
    static long myLongMax = Long.MAX_VALUE;
    static long myLongMin = Long.MIN_VALUE;
 static long myLongValue = 500500L;

    public static void main(String[] args) {
        System.out.println("This is the min value: " + myMinIntValue);

        System.out.println("-This is the max value: " + myMaxValue);

        System.out.println("--Min to Max value range (" + myMinIntValue + " to " + myMaxValue + ")");
        
        //Try adding & subracting a number to the Max and Min value
                //The outcome is negative (overflow) we tried to put too large num
                System.out.println("---Add 1 to Max: " + (myMaxValue + 1));
                //Underflow
                System.out.println("----Subract 1 to Min " + (myMinIntValue - 1));
                    
                //Test if data point is in max 
        System.out.println("-----Test: " + myMinIntTest);
                 
 ////////////////////////////////////////////////////////////////////////////////////

        //BYTE


        System.out.println("------This is the Byte min value: " + myMinByteValue);

        System.out.println("-------This is the Byte max value: " + myMaxByteValue);
        
        System.out.println("---------Min to Max Byte value range (" + myMinByteValue + " to " + myMaxByteValue + ")");
                
////                                                                                 
    
//SHORT
        
    System.out.println("---------This is the Short min value: " + myMinShortValue);

        System.out.println("----------This is the Short max value: " + myMaxShortValue);

    System.out.println("-----------Min to Max Short value range (" + myMinShortValue + " to " + myMaxShortValue + ")");
        

    //Long  Have to include suffix L on actual value
    System.out.println("------------This is the size of a long: " + myLongSize);
    System.out.println("-------------This is the Short min value: " + myLongMin);

    System.out.println("--------------This is the Short max value: " + myLongMax);

    System.out.println("---------------Min to Max Short value range (" + myLongMin + " to " + myLongMax + ")");
    }



}
  