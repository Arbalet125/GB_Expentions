package GB_Expentions.second_seminar.dz_2_seminar;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.///
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у /////////
// пользователя ввод данных./////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void floatReader(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите число (число должно быть дробным!): ");
            try{
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно: ", fNumber);
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Вы ввели не ДРОБНОЕ число.");
            }

        }
    }
} */

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Если необходимо, исправьте данный код:
/* Задание 2
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
} */

// Решение:

/* public static void  task2(){
    try {
        int[] intArray = {"Тут", "должен", "быть", "какой-то", "массив"}; 
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    } */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

