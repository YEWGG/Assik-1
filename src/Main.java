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
    }
}