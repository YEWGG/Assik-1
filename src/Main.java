
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 10
        double startTime  = System.nanoTime();
        int result = Tasks.getGCD(32,48);
        double endTime  = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Result: "+result);
        System.out.println("Duration: "+duration+" milliseconds");


    }
}