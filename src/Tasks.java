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
}
