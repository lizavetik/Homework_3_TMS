//2. Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random().
//Пусть будет возможность создавать массив произвольного размера.
//Пусть размер массива вводится с консоли.

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int masSize = scan.nextInt();

        int mas[] = new int[masSize];

        for (int i = 0; i < masSize; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.println(mas[i]);
        }

        int sum = 0;
        for (int i = 0; i < masSize; i++) {
            sum += mas[i];
        }
        System.out.println("Среднее арифметическое по массиву равно " + sum / masSize);

        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < masSize; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Максимальное число в массиве " + max);
        System.out.println("Минимальное число в массиве " + min);
    }
}