public class Calculator {
    //sum
    public int sum(int a, int b) {
        return a + b;
    }
    public double sum(String a, String b) {
        return sum(Double.parseDouble(a), Double.parseDouble(b));
    }
    public double sum(int a, String b) {
        return sum(a, Double.parseDouble(b));
    }
    public double sum(String a, int b) {
        return sum(Double.parseDouble(a), b);
    }
    public double sum(double a, double b) {
        return a + b;
    }

    //sub
    public int sub(int a, int b) {
        return a - b;
    }
    public double sub(String a, String b) {
        return sub(Double.parseDouble(a), Double.parseDouble(b));
    }
    public double sub(int a, String b) {
        return sub(a, Double.parseDouble(b));
    }
    public double sub(String a, int b) {
        return sub(Double.parseDouble(a), b);
    }
    public double sub(double a, double b) {
        return a - b;
    }

    //multiple
    public int multiple(int a, int b) { return a * b;    }
    public double multiple(String a, String b) {
        return multiple(Double.parseDouble(a), Double.parseDouble(b));
    }
    public double multiple(int a, String b) { return multiple(a, Double.parseDouble(b)); }
    public double multiple(String a, int b) { return multiple(Double.parseDouble(a), b); }
    public double multiple(double a, double b) { return a * b; }

    //div

    public double div(String a, String b) {
        return multiple(Double.parseDouble(a), Double.parseDouble(b));
    }
    public double div(int a, String b) { return multiple(a, Double.parseDouble(b)); }
    public double div(String a, int b) { return multiple(Double.parseDouble(a), b); }
    public double div(double a, double b) { return a / b; }
}
