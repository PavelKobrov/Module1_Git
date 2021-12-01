import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter number one");
        int a = scn.nextInt();
        System.out.println("Enter operation");
        String operation = scn.next();
        System.out.println("Enter number two");
        int b = scn.nextInt();
        switch (operation) {
            case "sum":
                System.out.println(calculator.sum(a, b));
                break;
            case "sub":
                System.out.println(calculator.sub(a,b));
                break;
            case "multiple":
                System.out.println(calculator.multiple(a,b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
