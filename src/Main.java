//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        double startTime  = System.nanoTime();
        int result=Tasks.getMin(5, new int[]{10, 1, 32, 3, 45});
        double endTime  = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Result: "+result);
        System.out.println("Duration: "+duration+" milliseconds");
        //Task 2
        double startTime2  = System.nanoTime();
        double result2=Tasks.getAverage(4, new int[]{3 , 2, 4, 1});
        double endTime2  = System.nanoTime();
        double duration2 = (endTime2 - startTime2)/1000000;
        System.out.println("Result: "+result2);
        System.out.println("Duration: "+duration2+" milliseconds");
        //Task 3
        double startTime3  = System.nanoTime();
        String result3=Tasks.isPrime(7);
        double endTime3  = System.nanoTime();
        double duration3 = (endTime3 - startTime3)/1000000;
        System.out.println("Result: "+result3);
        System.out.println("Duration: "+duration3+" milliseconds");
        //Task 4
        double startTime4  = System.nanoTime();
        int result4=Tasks.factorial(5);
        double endTime4  = System.nanoTime();
        double duration4 = (endTime4 - startTime4)/1000000;
        System.out.println("Factorial of 5 :" + result4);
        System.out.println("Duration: "+duration4+" milliseconds");
        //Task 5
        double startTime5  = System.nanoTime();
        int result5=Tasks.fibonacci(17);
        double endTime5  = System.nanoTime();
        double duration5 = (endTime5 - startTime5)/1000000;
        System.out.println("Fibonacci of 17 :" + result5);
        System.out.println("Duration: "+duration5+" milliseconds");


    }
}