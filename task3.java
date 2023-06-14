// 3) Реализовать простой калькулятор (+-/*)

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите второе число: ");
        int m = sc.nextInt();
        System.out.println("Введите оператор: ");
        char operator = sc.next().charAt(0);
        if (operator == '+') {
            System.out.println(sum(n, m));
        }
        if (operator == '-') {
            System.out.println(sub(n, m));
        }
        if (operator == '*') {
            System.out.println(mult(n, m));
        }
        if (operator == '/') {
            System.out.println(div(n, m));
        }
        sc.close();
    }

    static int sum(int a, int b){
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
    static int mult(int a, int b){
        return a * b;
    }
    static int div(int a, int b){
        return a / b;
    }
}
