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

}
