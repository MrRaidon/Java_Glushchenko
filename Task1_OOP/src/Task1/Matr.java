package Task1;

import java.util.Random;

public class Matr {
    int n;
    int m;
    double[][] thisMatr;

    public Matr(int n, int m) {
        this.thisMatr = new double[n][m];
        this.n = n;
        this.m = m;
        this.initial();

    }

    public Matr(double[][] thisMatr) {
        this.thisMatr = thisMatr;
        this.n = thisMatr.length;
        this.m = thisMatr[0].length;
    }

    private void initial() {

        Random random = new Random();
        for (int i = 0; i < thisMatr.length; i++) {
            for (int j = 0; j < thisMatr[i].length; j++) {
                thisMatr[i][j] = random.nextInt(100);
            }
        }
    }


    public void getvalue() {
        for (int i = 0; i < thisMatr.length; i++) {
            for (int j = 0; j < thisMatr[i].length; j++) {
                System.out.printf("%.2f  ", thisMatr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public Matr Multiplication(double inputNumber){
        double[][] resultMatr = new double[this.n][this.m];

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                double result = this.thisMatr[i][j] * inputNumber;
                resultMatr[i][j] = result;
            }
        }
        return new Matr(resultMatr);
    }

    public Matr transpose() {

        double[][] resultMatr = new double[this.m][this.n];
        for (int i = 0; i < this.n; i++)
            for (int j = 0; j < this.m; j++)
                resultMatr[j][i] = thisMatr[i][j];
        return new Matr(resultMatr);
    }

    public Matr expon(int N) {

        if (this.n != this.m) {
            System.out.println("Введите квадратную матрицу для возведения");
            return null;
        }

        Matr newMatr = this;
        Matr currentMatr = this;

        int currentN = 1;
        while (currentN < N) {
            MatrCalc obj = new MatrCalc(newMatr, currentMatr);
            newMatr = obj.composition();
            currentN++;
        }
        return newMatr;
    }
}
