public class operatorsOperands {
    static int result = 1 + 2; //=3

    static int previousResult = result - 1; // =2
    static char firstChar = 'A';
    static char secondChar = 'B';

    static int newResult = 2;
    static int ourResult = newResult * 10;


    public static void main(String[] args) {
        System.out.println("This is the sum: " + result);

        System.out.println("This is the difference: " + previousResult);

        System.out.println(firstChar + secondChar);
        //When you use the plus operator with Char, thse numbers in memory get added. the 65 of A and 66 of B are added (Unicodes)

        System.out.println("" + firstChar + secondChar);

        System.out.println("Print Result: " + ourResult + "\n" + "Divide: " + (ourResult/3) + "\n" + "Remainder: " + (ourResult%3));
    }
}
/*
 * Operators in Java are special symbols that perform specefic operation on one, two, or three operands, and then return a result.  
 * Operand is a term used to descurbe any pbject that is manipulated by an operator
 * An expression is formed by combining variables, literals, method return values, and operators 
 * = operator is the assignment operator 
 * the addition is the operator of the left and right side of the 
 * 
*/