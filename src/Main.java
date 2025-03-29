import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        double startTime  = System.nanoTime();
        Tasks.printReverse(n);
        double endTime  = System.nanoTime();
        double duration = (endTime - startTime)/1000000;
        System.out.println("Duration: "+duration+" milliseconds");


    }
}