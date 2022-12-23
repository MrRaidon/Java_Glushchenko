import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1. Числа от 1 до n");
        Scanner in = new Scanner(System.in);
        RecursionOperation.Numbers(in.nextInt());
        Integer[] array;

        System.out.println("Задача 2. Заполнение массива m рандомными числами до 30. Поиск входящих");

        array = new Integer[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 30));
        }
        System.out.println(Arrays.deepToString(array));
        RecursionOperation t = new RecursionOperation();
        t.mas = array;
        System.out.println("Задача 2 (Продолжение). Введите число для поиска");
        System.out.println(t.FindEl(in.nextInt()));
        System.out.println("Задача 3. Решение уравнения");
        System.out.println(RecursionOperation.Equation(0.0, 10, RecursionOperation.f(0.0), RecursionOperation.f(10.0), 0.00000001));

    }

}
