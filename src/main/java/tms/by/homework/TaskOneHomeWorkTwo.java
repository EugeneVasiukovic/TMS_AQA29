package tms.by.homework;

import java.util.Scanner;
/*
Пользователь в консоли вводит число.
Необходимо вывести факториал числа Введенного пользоателям в консоль
 */
public class TaskOneHomeWorkTwo {
    public static void main(String[] args) {
        int result = 1;
        Scanner FactorialSC = new Scanner(System.in);
        System.out.println("Pls enter ValueSc: ");
        int ValueSc = FactorialSC.nextInt();
        for (int i = 1; i <= ValueSc; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + ValueSc + " is " + result);

    }
}
