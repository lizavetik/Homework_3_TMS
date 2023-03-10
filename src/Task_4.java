//4. Создайте массив из n случайных целых чисел и выведите его на экран.
//Размер массива пусть задается с консоли и размер массива может быть
//больше 5 и меньше или равно 10.
//Если n не удовлетворяет условию - выведите сообщение об этом.
//Если пользователь ввёл не подходящее число, то программа должна
//просить пользователя повторить ввод.
//Создайте второй массив только из чётных элементов первого массива,
//если они там есть, и вывести его на экран.
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10");

        int masSize = scan.nextInt();

        if (masSize > 5 ^ masSize <= 10) {
            System.out.println("введите размер масссива согласно правилу, это заначение не удовлетворяет условию");
            masSize = scan.nextInt();
        }

        int mas[] = new int[masSize];
        for (int i = 0; i < masSize; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i] + "   ");
        }

        //заполнен массив, теперь заполнить второй чётными элементами
        //с этого момента присутствует ошибка
        int even = 0;

        System.out.println();
        System.out.println("Массив только чётных элементов");
        for (int i = 0; i < masSize; i++) {
            int j = 0;
            if (mas[i] % 2 == 0) {
                mas[j] = mas[i];
                System.out.print(mas[i] + "   ");
                j++;
            }
        }
    }
}
