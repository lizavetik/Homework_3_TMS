//3. Создайте 2 массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//сообщите, для какого из массивов это значение оказалось больше (либо
//сообщите, что их средние арифметические равны).

public class Task_3 {
    public static void main(String[] args){

        int mas1[] = new int[5];
        int mas2[] = new int[5];

        int sr1 = 0;
        int sr2 = 0;

        for(int i=0; i<5; i++){
         mas1[i] = (int)(Math.random()*100);
         System.out.print(mas1[i] + "   ");
         sr1 = sr1 + mas1[i];
        }
        System.out.println();

        for(int i=0; i<5; i++){
            mas2[i] = (int)(1+Math.random()*100);
            System.out.print(mas2[i] + "   ");
            sr2 = sr2 + mas2[i];
        }
        System.out.println();
        System.out.println("Cреднее арифметическое первого массива: " + (double)sr1/5 );
        System.out.println("Cреднее арифметическое второго массива: " + (double)sr2/5 );

        if(sr1>sr2){
            System.out.println("Cреднее арифметическое первого массива больше");
        }else if(sr1/5<sr2/5){
            System.out.println("Cреднее арифметическое первого массива меньше");
        }else {System.out.println("Cредние арифметические 2х массивов равны");
        }
    }
}