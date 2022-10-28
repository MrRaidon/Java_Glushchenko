package Task1;

public class Main {
    public static void main(String[] args) {
        Matr obj1 = new Matr(2, 2);
        Matr obj2 = new Matr(2, 2);
        System.out.println("Матрица А:");
        obj1.getvalue();
        System.out.println("\nМатрица B:");
        obj2.getvalue();

        System.out.println("\nТранспонированная матрца A:");
        Matr transposed_obj1 = obj1.transpose();
        transposed_obj1.getvalue();
        System.out.println("\nТранспонированная матрца B:");
        Matr transposed_obj2 = obj2.transpose();
        transposed_obj2.getvalue();

        double multiNumber = 2;
        System.out.println("\nУмножение матрицы А на число " + multiNumber);
        Matr result = obj1.Multiplication(multiNumber);
        if (result != null)
            result.getvalue();

        MatrCalc executerObj = new MatrCalc(obj1, obj2);
        System.out.println("\nСумма:");
        result = executerObj.summ();
        if (result != null)
            result.getvalue();

        System.out.println("\nРазность:");
        result = executerObj.difference();
        if (result != null)
            result.getvalue();

        Matr obj3 = new Matr(2, 3);
        Matr obj4 = new Matr(3, 2);
        System.out.println("\nМатрица C:");
        obj3.getvalue();
        System.out.println("\nМатрица D:");
        obj4.getvalue();
        executerObj = new MatrCalc(obj3, obj4);
        System.out.println("\nПроизведение C*D:");
        result = executerObj.composition();
        if (result != null)
            result.getvalue();

        int N = 2;
        Matr obj5 = new Matr(2, 2);
        System.out.println("\nМатрица E:");
        obj5.getvalue();
        System.out.println("\nМатрица E в степени " + N);
        result = obj5.expon(N);
        if (result != null)
            result.getvalue();
    }
}