/**
 * @author Drumstyle92
 * class that contains the main.
 */
public class Test {
    /**
     * @param args main parameter.
     * method that contains a while loop that displays the first 10 digits of the Fibonacci sequence.
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int i = 2;
            // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        System.out.println("----------FibonacciSequence--------");
            System.out.println(num1);
        while(i <= 10){
            int sum = num1 + num2;
               num2 = num1;
               num1 = sum;

            System.out.println(sum);
            ++i;
        }
        System.out.println("----------------End-----------------");
    }
}
