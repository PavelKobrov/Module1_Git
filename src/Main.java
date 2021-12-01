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
                6. Sqrt""");
        String operation = scn.next();
        switch (operation) {
            case "squared" -> System.out.println(calculator.squared(a));
            case "sqrt" -> System.out.println(calculator.sqrt(a));
            default -> {
                System.out.println("Enter number two");
                int b = scn.nextInt();
                switch (operation) {
                    case "sum" -> System.out.println(calculator.sum(a, b));
                    case "sub" -> System.out.println(calculator.sub(a, b));
                    case "multiple" -> System.out.println(calculator.multiple(a, b));
                    case "div" -> System.out.println(calculator.div(a, b));
                    default -> System.out.println("Invalid operation");
                }
            }
        }
    }

}