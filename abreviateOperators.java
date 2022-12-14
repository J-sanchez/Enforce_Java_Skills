public class abreviateOperators {
   
    public static void main(String[] args) {
        int result = 1;
        result -= result;
        
        int results = result--;
        int resulted = result++;

        System.out.println(result);
        System.out.println(results);
        System.out.println(resulted);
     }
}
/*
 * We can use shorthand -= or += to add and subtract. 
 */