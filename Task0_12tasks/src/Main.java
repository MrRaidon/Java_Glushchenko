import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void Task9() {
        System.out.println("Задание 9");
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num21 = 21;
        if (num1>num21){
            System.out.println(num1-num21);
        } else{
            System.out.println(num21-num1);}

    }

    public static void Task10(){
        System.out.println("Задание 10");
        System.out.println("Введите два числа");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Среднее арифметическое - " + (num1+num2)/2);
    }

    public static void Task11(){
        System.out.println("Задание 11");
        System.out.println("Введите два числа");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Среднее геометрическое - " + Math.sqrt(num1*num2));
    }

    public static void Task12(){
        System.out.println("Задание 12");
        System.out.println("Введите четыре числа с плавающей точкой");
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();



        System.out.println(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println("Hello world!");

        System.out.println("Задание 2");
        int x = 88;
        System.out.println(x);
        System.out.println("Задание 3");
        int al = 22;
        al = al + 1;
        al += 1;
        System.out.println(al);
        System.out.println("Задание 4");
        int a = 2;
        int b = 3;
        int bufer;
        bufer = a;
        a = b;
        b = bufer;
        System.out.println(a);
        System.out.println(b);
        int number1 = 1;
        int number2 = 2;

        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println("Задание 5");
        int kat1 = 12;
        int kat2 = 5;
        int gip;
        gip = kat1*kat1 + kat2*kat2;
        System.out.println(Math.sqrt(gip));
        System.out.println("Задание 6");
        int chislo = 123123345;
        System.out.println(chislo%10);
        System.out.println("Задание 7");
        System.out.println(chislo%100/10);
        System.out.println("Задание 8");
        int e = 39;
        System.out.println(e/10);
        Task9();
        Task10();
        Task11();
        Task12();
    }




}
