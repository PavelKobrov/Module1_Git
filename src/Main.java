import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter number one");
        int a = scn.nextInt();
        System.out.println("""
                Enter operation by name:
                1. sum
                2. sub
                3. div
                4. multiple
                5. squared
                6. sqrt""");
        String operation = scn.next();

        if (operation.equals("squared") || operation.equals("sqrt")) {
            System.out.println(calculator.result(a, 0, operation));
        } else {
            System.out.println("Enter number two");
            int b = scn.nextInt();
            System.out.println(calculator.result(a, b, operation));
        }

    }

}