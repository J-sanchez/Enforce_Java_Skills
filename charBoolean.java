public class charBoolean {

    static char myChar = 'D';
    //Litteral Unicode 
    static char myUnicode = '\u0044';
    //Numerical Literal to char variable 
    static char myDecimalCode = 68;

    //Challenge to Print different forms of the char
    static char myNewChar = '?';
    static char myNewUnicode = '\u003F';
    static char myNewDecimal = 63;

    //Boolean Variables

    static boolean myTrueValue = true;
    static boolean myFalseValue = false;
    static boolean isCustomer21 = true;

    public static void main(String[] args) {
        System.out.println("Print Char: " + myChar + "\n" + "Print Unicode: " + myUnicode + "\n" + "Print DecimalCode: " + myDecimalCode);

        //Print Challenge
        System.out.println("Challenge Char: " + myNewChar + "\n" + "Print Unicode: " + myNewUnicode + "\n"
                + "Print DecimalCode: " + myNewDecimal);
        
        System.out.println(myTrueValue);
    }
}
/* Char allows the user to hold ONLY ONE character at a time, uses single quotesString is many characters and uses double quotes
Use char to store last key pressed in a game by the user
Loop through letters of the alphabet
A char occupies two bytes of memory, or 16 bits, and thus has a width of 16. 
Unicode is an international encoding standard for use with differen languages and scripts with each letter, digit, or symbo is assigned
a unique numeric value that applies across different platforms and programs in the english alphabet we only need 26 characters
However, some languages need more symbols which can be some of 65,535 types of characters https://unicode-table.com/en/ 

A boolean value allows for two opposite choices, true or false, yes or no, one or zero. 
In Java terms, we've got a boolean primitive type, and it can be set to two values only, either true or false. 


*/