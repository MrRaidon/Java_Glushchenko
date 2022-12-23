public class RecursionOperation {
    Integer[] mas;

    public static void Numbers(int n) {
        NumbersOut(n, 1);
    }

    private static void NumbersOut(int n, int j) {
        if (j > n) {
            return;
        }
        System.out.println(j);
        NumbersOut(n, j + 1);
    }

    public boolean FindEl(int value) {
        return FindElementRecursion(value, 0);
    }

    private boolean FindElementRecursion(int value, int i) {
        if (this.mas[i] == value) {
            return true;
        }
        if (i + 1 == this.mas.length) {
            return false;
        }
        return this.FindElementRecursion(value, i + 1);
    }

    public static double f(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static double Equation(double a, double b, double fa, double fb, double e) {
        double c = (a + b)/2;
        if (Math.abs(a - b) < e) return c;
        double fc = f(c);
        if (Math.abs(fc) < e) return c;
        if (fc * fa < 0)
            return Equation(a, c, fa, fc, e);
        else
            return Equation(c, b, fc, fb, e);
    }
}