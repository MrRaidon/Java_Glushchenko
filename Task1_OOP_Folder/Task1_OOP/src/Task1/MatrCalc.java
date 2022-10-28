package Task1;

import Task1.Matr;

public class MatrCalc {
    Matr Matr1;
    Matr Matr2;

    public MatrCalc(Matr obj1, Matr obj2) {
        this.Matr1 = obj1;
        this.Matr2 = obj2;
    }

    public Matr composition() {

        if (Matr1.m != Matr2.n) {
            System.out.println("Количество столбцов и количество строк не совпадает");
            return null;
        }
        double[][] resultMatr = new double[Matr1.n][Matr2.m];

        for (int i = 0; i < Matr1.n; i++) {
            for (int j = 0; j < Matr2.m; j++) {
                for (int k = 0; k < Matr1.m; k++) {
                    resultMatr[i][j] += Matr1.thisMatr[i][k] * Matr2.thisMatr[k][j];
                }
            }
        }
        return new Matr(resultMatr);
    }

    public Matr summ() {
        if ((Matr1.n != Matr2.n) || (Matr1.m != Matr2.m)) {
            System.out.println("Введите правльную размерность матриц");
            return null;
        } else {

            double[][] resultMatr = new double[Matr1.n][Matr1.m];

            for (int i = 0; i < Matr1.n; i++) {
                for (int j = 0; j < Matr1.m; j++) {
                    double result = Matr1.thisMatr[i][j] + Matr2.thisMatr[i][j];
                    resultMatr[i][j] = result;
                }
            }
            return new Matr(resultMatr);
        }
    }

    public Matr VectorRazn() {
        if ((Matr1.n != Matr2.n) || (Matr1.m != Matr2.m)) {
            System.out.println("Введите правльную размерность матриц");
            return null;
        } else {

            double[][] resultMatr = new double[Matr1.n][Matr1.m];

            for (int i = 0; i < Matr1.n; i++) {
                for (int j = 0; j < Matr1.m; j++) {
                    double result = Matr1.thisMatr[i][j] - Matr2.thisMatr[i][j];
                    resultMatr[i][j] = result;
                }
            }

            return new Matr(resultMatr);
        }
    }
    
}
