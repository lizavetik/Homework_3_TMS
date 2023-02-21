import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args){

        System.out.println("Введіте любое целое число от 1 до 99");
        int[] mas = {11,22,33,44,55,66,77,88,99,16,25,34,48,57,69,72,84,93};
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();    //считывает число с консоли

        boolean flag = false;

        for (int i=0; i< mas.length; i++){
            if (number == mas[i]){
                flag = true;
            }
        }
        if (flag == true){
            System.out.println("Это число есть в массиве");
        }else{
            System.out.println("Этого числа нет в массиве");
        }
            }
        }




