public class Calculator {
    //sum
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(String a, String b) {
        return sum(Double.valueOf(a), Double.valueOf(b));
    }

    public double sum(int a, String b) {
        return sum(a, Double.valueOf(b));
    }

    public double sum(String a, int b) {
        return sum(Double.valueOf(a), b);
    }

    public double sum(double a, double b) {
        return a + b;
    }

    //sub
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(String a, String b) {
        return sub(Double.valueOf(a), Double.valueOf(b));
    }

    public double sub(int a, String b) {
        return sub(a, Double.valueOf(b));
    }

    public double sub(String a, int b) {
        return sub(Double.valueOf(a), b);
    }

    public double sub(double a, double b) {
        return a - b;
    }
}
