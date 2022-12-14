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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Дан следующий код, исправьте его там, где требуется: 
// public static void main(String[] args) throws Exception {
/*     try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    }
 }
 public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
 }
  */

// Решение:

/* public static void main(String[] args) {
    task2();
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2};
        abc[3] = 9;
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    }

}
public static void printSum(Integer a, Integer b){
    System.out.println(a + b);
} */

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно /////////
// показаться сообщение, что пустые строки вводить нельзя.///////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void nullString(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст (пустую строку вводить нельзя)");
        try {
            String result = reader.readLine();
            if(result.equals("")) throw new RuntimeException("Вы ввели пустую строку...");

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
} */