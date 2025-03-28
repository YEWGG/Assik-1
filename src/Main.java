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
        //Task 6
        double startTime6  = System.nanoTime();
        double result6=Tasks.power(2, -5);
        double endTime6  = System.nanoTime();
        double duration6 = (endTime6 - startTime6)/1000000;
        System.out.println("2^5 :" + result6);
        System.out.println("Duration: "+duration6+" milliseconds");
        //Task 7
        double startTime7  = System.nanoTime();
        Tasks.printReverse(5, new int[]{1, 2, 3, 4, 5});
        double endTime7  = System.nanoTime();
        double duration7 = (endTime7 - startTime7)/1000000;
        System.out.println("\n"+"Duration: "+duration7+" milliseconds");
        //Task 8
        double startTime8  = System.nanoTime();
        String result8=Tasks.isAllDigits("1234d56");
        double endTime8  = System.nanoTime();
        double duration8 = (endTime8 - startTime8)/1000000;
        System.out.println("Result: "+result8);
        System.out.println("Duration: "+duration8+" milliseconds");
        //Task 9
        double startTime9  = System.nanoTime();
        int result9=Tasks.getBinomialCoefficient(7,3);
        double endTime9  = System.nanoTime();
        double duration9 = (endTime9 - startTime9)/1000000;
        System.out.println("Result: "+result9);
        System.out.println("Duration: "+duration9+" milliseconds");




    }
}