// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаком вопроса - всегда одинаковая ЦИФРА.
// Введите уравнение: ?? + ?? = 44
// Решение: 22 + 22 = 44

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // 1ое задание
        int a = 1;
        int count = 0;
        int count1 = 1;
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int name = sc.nextInt();
        System.out.println("1 - Треугольное число, 2 - факториал:");
        int sum = sc.nextInt();
        while (a <= name) {
            if (sum == 1) {
                count += a;
                a += 1;
            }
            else {
                count1 *= a;
                a += 1;
                count = count1;
            }            
        }
        System.out.println(count);
        sc.close();
    }
    
}
