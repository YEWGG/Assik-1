//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 2
        double startTime  = System.nanoTime();
        double result = Tasks.getAverage(4, new int[]{3,2,4,1});
        double endTime  = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Result: "+result);
        System.out.println("Duration: "+duration+" milliseconds");


    }
}