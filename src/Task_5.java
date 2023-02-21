//Создайте массив и заполните массив.
//Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int masSize = scan.nextInt();
        int mas[] = new int[masSize];

        for(int i=0; i<masSize; i++){
            mas[i] = (int)(Math.random()*100);
            System.out.print(mas[i] + "   ");
        }

        System.out.println();
        for(int i=0;i<masSize; i++){
            if (i%2 != 0){
                mas[i] = 0;
            }
            System.out.print(mas[i] + "    ");
        }
    }
}