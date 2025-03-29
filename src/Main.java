//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 3
        double startTime  = System.nanoTime();
        String result = Tasks.isPrime(19);
        double endTime  = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Result: "+result);
        System.out.println("Duration: "+duration+" milliseconds");


    }
}