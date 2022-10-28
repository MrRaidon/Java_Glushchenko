import Task1.Matr;
import Task1.MatrCalc;
import Task2.Vector;
import java.util.*;
public class Main {

    public static void Task1() {
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
        result = executerObj.VectorRazn();
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

    public static void Task2() {
        Vector[] vectors = Vector.generator(10);
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].value();
        }

        Vector vector1 = new Vector(1, 3, 3);
        Vector vector2 = new Vector(25, 10, 1);
        System.out.println("\nВектор 1");
        vector1.value();
        System.out.println("\nВектор 2");
        vector2.value();

        System.out.println("\nДлина вектора 1: " + vector1.length());
        System.out.println("Длина вектора 2: " + vector2.length());
        System.out.println("Скалярное произведение вектора 1 и 2: " + vector1.ScalarMult(vector2));
        System.out.println("Векторное произведение вектора 1 и 2:");
        vector1.VectMult(vector2).value();

        System.out.println("Угол между векторами 1 и 2: " + vector1.VectorCorner(vector2));
        System.out.println("Сумма векторов 1 и 2");
        vector1.summ(vector2).value();
        System.out.println("Разность векторов 1 и 2");
        vector1.VectorRazn(vector2).value();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Выберите задание:");
            System.out.println("1) Матрица");
            System.out.println("2) Вектор");
            System.out.println("3) Иерархия классов");
            System.out.println("4) Иерархия с абстрактными классами");
            System.out.println("5) Массивы");
            System.out.println("8) Выход");
            String input = in.nextLine();
            switch (input) {
                case "1" -> {
                    Task1();
                }
                case "2" -> {
                    Task2();
                }
                case "3" -> {
                    Task1();
                }
                case "4" -> {
                    Task1();
                }
                case "5" -> {
                    Task1();
                }
                case "8" -> {
                    return;
                }
            }
        }
    }
}