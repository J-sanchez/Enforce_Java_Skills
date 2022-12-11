public class floatPrecision {
    static int myInt = 5;
    static float myFloat = 5.24f;
    static double myDouble = 5.234d;

    //Variable for the challenge 
    static double numberOfPounds = 200d;
    static double conversionKilo = 0.45359237d;

    static double newNumber = 3_5038_89.0984 + 345_3432.432;
    public static void main(String[] args) {
        System.out.println("Print the variables: " + "Int: " + myInt + "  Float: " + myFloat + "  Double: " + myDouble);

        //Chack math
        System.out.println(
                "Divide int by 2: " + (myInt / 2) + " We expect 2.5, but based on the type Integer we get 2 because int does not account for decimal numbers, therefore it takes the floor value");
        System.out.println("Divide Float by 2: " + (myFloat / 2));
        System.out.println("Divide Double by 2 & 3: " + (myDouble / 2) + "\n" + "Divide by 3: " + (myDouble / 3));



        //Challenge
        System.out.println("Challenge Convert Pounds to Kilograms: " + (numberOfPounds * conversionKilo));
        System.out.println("Look at using underscores to write number: " + newNumber + "\n" + "check dividing by conversion factor: " + (newNumber / conversionKilo));
    }
}
