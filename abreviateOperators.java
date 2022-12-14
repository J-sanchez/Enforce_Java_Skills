public class abreviateOperators {
   
    public static void main(String[] args) {
        int result = 1;
        result -= result;
        
        int results = result--;
        int resulted = result++;

        System.out.println(result);
        System.out.println(results);
        System.out.println(resulted);

        int newResult = 5;
        double newRequest = 5.5;

        newResult = (int) (newResult + newRequest);
        System.out.println(newResult);
        double New = 10;
        New *= 1.5;
        double Newest = 10;
        Newest /= 1.5;

        System.out.println(New);
        System.out.println(Newest);
    }
}
/*
 * We can use shorthand -= or += to add and subtract. Compound assignments
 * -=
 * +=
 * *=
 * /=
 */