public class Tasks {
    //Task 1
    public static int getMin(int n, int [] array) {
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    /*

     * This method finds the minimum element within array.

     * It uses a for loop.

     * Time complexity: 0(n), where n is the input number.

     * The loop algorithm iterates through all elements with indexes from 1 to n-1,

     * resulting in linear time complexity.

     *

     * @param n and array, they are length of array and elements of array respectively.

     * @return the minimum element from array.

     */
    //Task 2
public static double getAverage(int n, int [] array) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum / n;
    }
    /*

     * This method finds the average of all elements within array.

     * It uses a for loop.

     * Time complexity: 0(n), where n is the input number.

     * The loop algorithm iterates through all elements with indexes from 0 to n-1,

     * resulting in linear time complexity.

     *

     * @param n and array, they are length of array and elements of array respectively.

     * @return the average of all elements from array.

     */
    //Task 3
    public static String isPrime(int n) {
        if (n <= 1) {
            return "COMPOSITE";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "COMPOSITE";
            }
        }
        return "PRIME";
    }
    /*

     * This method checks if the input number is prime or composite.

     * It uses a for loop.

     * Time complexity: 0(sqrt(n)), where n is the input number.

     * The loop algorithm iterates through all elements with indexes from 2 to sqrt(n),

     * resulting in square root time complexity.

     *

     * @param n, it is the input number.

     * @return "PRIME" if the number is prime, "COMPOSITE" otherwise.

     */
    //Task 4
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    /*

     * This method calculates the factorial of a given number.

     * It uses recursion.

     * Time complexity: 0(n), where n is the input number.

     * The recursion algorithm iterates through all elements with indexes from n to 1,

     * resulting in linear time complexity.

     *

     * @param n, it is the input number.

     * @return the factorial of the input number.

     */
    //Task 5
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    /*

     * This method calculates the nth Fibonacci number.

     * It uses recursion.

     * Time complexity: 0(2^n), where n is the input number.

     * The recursion algorithm iterates through all elements with indexes from n to 1,

     * resulting in exponential time complexity.

     *

     * @param n, it is the input number.

     * @return the nth Fibonacci number.

     */
}
