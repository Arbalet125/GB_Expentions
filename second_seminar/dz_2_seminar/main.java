package GB_Expentions.second_seminar.dz_2_seminar;



import java.io.BufferedReader;
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
}
