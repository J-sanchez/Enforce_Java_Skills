public class primChallenge {
    static byte myByte = 10;
    static short myShort = 400;
    static int myInt = 200;
    static long myLong = 50000L;

    public static void main(String[] args) {
        System.out.println("Challenge: Print a Byte value: " + myByte);
        System.out.println("Challenge: Print a Short value: " + myShort);
        System.out.println("Challenge: Print an Integer value: " + myInt);
        //Simple calculation
        System.out.println("Challenge: Print Long and 10x the sum of first 3 variables: " + myLong + " \n" + "Sum of all: " + ((myLong)+(10L*(myByte+myShort+myInt))));
        System.out.println("Try simple calculcation: "+ (myShort + myByte));
    }
}
