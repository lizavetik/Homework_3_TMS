//Создайте массив строк. Заполните его произвольными именами
//людей.
//Отсортируйте массив.
//Результат выведите на консоль.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_6 {
    public static void main(String[] args){
    List<String> mas = Arrays.asList("Lena", "Masha", "Liza", "Anya","Danila", "Egor", "Alex");
    System.out.println("Mas before sort: "+mas);
    Collections.sort(mas);
    System.out.println("Mas after sort: "+mas);
}}