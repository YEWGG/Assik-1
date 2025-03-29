//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 4
        double startTime  = System.nanoTime();
        int result = Tasks.factorial(5);
        double endTime  = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Factorial of 5: "+result);
        System.out.println("Duration: "+duration+" milliseconds");


    }
}