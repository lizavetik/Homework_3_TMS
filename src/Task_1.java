//1. Создайте массив целых чисел. Удалите все вхождения заданного
//числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет -
//выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.
import java.util.Scanner;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        int mas[] = {11, 22, 33, 44, 55, 66, 77, 88, 99, 12, 23, 34, 45, 56, 67, 78, 89, 90, 88, 88, 88};

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, которое хотите удалить из массива");
        int number = scan.nextInt();    //считывает число с консоли

        System.out.println("массив без заданного числа: /n");

        int i = 0;
        for(int j=0;j< mas.length; j++){
            if(mas[j]!=number){
                mas[i] = mas[j];
                System.out.print(mas[i] + " ");
                i++;
            }
        }

    }
}
