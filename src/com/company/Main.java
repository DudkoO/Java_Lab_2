package com.company;
import  java.util.Random ; // подключение генератора рандомных чисел
import  java.util.Scanner ; // подключение ввода
import  java.util.Arrays ; // работа с массивами

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte section = 0;

        while (true) {
        System.out.println("Лабораторная работа №2.\n" +
                "Выберите Задание:");
        System.out.println("1.Возведение двойки в степень");
        System.out.println("2.Расчитать факториал для n (n<10)");
        System.out.println("3.Разность,сумма и произвидение вещественных чисел");
        System.out.println("4.Вычисление времени свободного падения тела");
        System.out.println("5.Решение задачи с помощью теоремы Пифагора");
        System.out.println("Лабораторная работа №3.\n" +
                    "Выберите Задание:");
        System.out.println("6.Проверка теоремы Ферма");
        System.out.println("7.Вычисление выражения 1-1/2+1/3-1/4+...+1/9999-1/10000");


            section = scan.nextByte();
            switch (section) {

                case 1:
                    theDegreeOfTwo();
                    break;
                case 2:
                    Factorial();
                    break;
                case 3:
                    RealNumbers();
                    break;
                case 4:
                    FreeFall();
                    break;
                case 5:
                    PethagoreanTheorem();
                    break;
                case 6:
                    Ferma();
                    break;
                case 7:
                    Row();
                    break;
                default:
                    System.out.println("Неверно указанное действие.");
            }
        }
    }


    public static void Factorial() {
        Scanner scan = new Scanner(System.in);
        double n = 0;
        double factorial = 1;
        System.out.println("Вычисление факториала.\n" +
                "Введите произвольное число n\n" +
                "(n должно быть меньше десяти)");
        n = scan.nextDouble();
        for (int i = 1; i < n + 1; i++) {
            factorial *= i;
        }
        System.out.println("Значение факториала : " + factorial);
    }

    public static void RealNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вычисление суммы, разности и произведения двух вещественных чисел.");
        double number1 = 0;
        double number2 = 0;
        double summ = 0;
        double difference = 0;
        double op = 0;
        System.out.println("Введите два числа: \nx1=");
        number1 = scan.nextDouble();
        System.out.println("x2= ");
        number2 = scan.nextDouble();

        summ = number1 + number2;
        difference = number1 - number2;
        op = number1 * number2;
        System.out.println("Резултат: " +
                "Сумма= " + summ +
                "Разность= " + difference +
                "Произведение=" + op);
    }

    public static void FreeFall() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вычисление время свободноо падения тела с произвольной высоты.");
        double g = 9.81523;
        double FallTime = 0;
        double h = 0;

        System.out.println("Задайте высоту:");
        h = scan.nextDouble();

        FallTime = Math.sqrt(2 * h / g);
        System.out.println("Время свободного падения="
                + FallTime);

    }

    public static void PethagoreanTheorem() {
        Scanner scan = new Scanner(System.in);
        byte MethodOfSolution = 0;
        System.out.println("Решение задачи при помощи теоремы Пифагора.");

        System.out.println("1-Вычисление длины  гипотенузы треуголька по заданным катетам.");
        System.out.println("2-Вычисление длины  одного из катетов по гипотенузе и известному катету.");
        do {
            System.out.println("Выберите метод решения:");
            MethodOfSolution = scan.nextByte();
            if (MethodOfSolution == 1
                    || MethodOfSolution == 2)
                break;

            System.out.println("Неверно указанный метод решения.");
        } while (true);
        double a = 0;
        double b = 0;
        double c = 0;

        if (MethodOfSolution == 1) {
            System.out.println("Вычисление длины  гипотенузы треуголька по заданным катетам.");
            System.out.println("Задайте катеты треугольника:");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = Math.sqrt(a * a + b * b);
            System.out.println("Гипотенуза равна " + c + " .");

        } else if (MethodOfSolution == 2) {
            System.out.println("Вычисление длины  одного из катетов по гипотенузе и известному катету.");
            do {
                System.out.println("Задайте гипотенузу  треугольника:");
                c = scan.nextDouble();
                System.out.println("Задайте известный катет   треугольника:");
                a = scan.nextDouble();
                if (c > a)
                    break;
                System.out.println("Некоректный ввод. Катет не может быть равен или длиннее  гипотенузы!");
            } while (true);

            b = Math.sqrt(c * c - a * a);
            System.out.println("Искомый катет равен " + b + " .");
        }


    }

    public static void theDegreeOfTwo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Возведение двойки в степень.");
        int n=0;
        double result=0;
        System.out.println("Введите степень :");
        n=scan.nextInt();

        result=Math.pow(2,n);

        System.out.println("2 в степени "+n+" = "+ result);
    }

    public  static  void Ferma(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Проверка теоремы Ферма.\n" +
                "Введите степень n>2, чтобы проверить существуют ли три числа в диапазоне от 1 до 100,\n" +
                " соответствующие условию а^+b^n=c^n");
        int a=0;
        int b=0;
        int c=0;
        int n=0;
        int limit=101;
        double result=0;
        boolean flag=false;
        System.out.println("Задайте степень n :");
        while (true) {
            n = scan.nextInt();
            if(n>2)
                break;
            System.out.println("Значение степени должно быть более двух!");
        }

        for (a = 1; a <limit ; a++) {
            for (b = 1; b < limit; b++) {
                for (c = 1; c < limit; c++) {
                   result= Math.pow((double)a,(double)n) +
                           Math.pow((double)b,(double)n);
                  if(result==Math.pow((double)c,(double)n)) {
                      flag =true;
                      System.out.println("Решение найдено!\na="+a+
                      " b="+b+" c="+c);
                  }

                }
            }
        }
        if(flag==false)
            System.out.println("Для заданных чисел и степени решения не найдено.");

        int section=0;
        System.out.println("Проверить решения для n=2?\n" +
                "(нажмите 1 )");
        section=scan.nextInt();
        switch (section){
            case 1:
                n=2;
                for (a = 1; a <limit ; a++) {
                    for (b = 1; b < limit; b++) {
                        for (c = 1; c < limit; c++) {
                            result= Math.pow((double)a,(double)n) +
                                    Math.pow((double)b,(double)n);
                            if(result==Math.pow((double)c,(double)n)) {
                                flag =true;
                                System.out.println("Решение найдено!\na="+a+
                                        " b="+b+" c="+c);
                            }

                        }
                    }
                }


                break;
            default:
                break;
        }
        
    }

    public static void Row(){
        double result=0;

        System.out.println("Вычисление значения выражения 1-1/2+1/3-1/4+...+1/9999-1/10000");
        for (int i = 1; i < 10000; i++) {
            if(i%2==0)
                result-=1/i;
            else
                result+= 1/i;
            i++;
        }
        /*
        for (int i = 1; i <10000 ; i++) {
            System.out.println("1/" + i);
            if (i % 2 == 0)
                System.out.print(" - ");
            else
                System.out.print("+");
        }
        */
        System.out.println("1-1/2+1/3-1/4+...+1/9999-1/10000="+result);
    }
}
