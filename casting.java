public class casting {
    static short myMinShortValue = Short.MIN_VALUE;
    static int myMinIntValue = Integer.MIN_VALUE;
    static byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
    static short firstShort = 15;
    static int firstInt = 200;
    static byte firstByte = 4, secondByte = 6;
   
    //Math Functions
    static int myTotalMinInt = (myMinIntValue / 2);
    //casting to treat or convert a number from one type to another
    //Best pracitce - use an integer unless a different type is absolutely needed
    static byte myTotalMinByte = (byte) (myMinByteValue / 2);
    static short myTotalMinShort = (short) (myMinShortValue / 2);

    public static void main(String[] args) {
        System.out.println(myMinShortValue + "\n" + myMinIntValue);
        System.out.println(myMinByteValue + "\n" + myMaxByteValue);
        System.out.println("My First Short = " + firstShort);
        System.out.println("My First Int = " + firstInt);
        System.out.println("My First & Second Byte = " + firstByte + " & " + secondByte);
       
        //Math Functions
        System.out.println(myTotalMinInt);
        System.out.println(myTotalMinByte);
        System.out.println(myTotalMinShort);

    }

}
