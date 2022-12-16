package dz_3_seminar.base.classes.ui;

import dz_3_seminar.base.abstractClasses.AGetData;
import dz_3_seminar.base.exceptions.GetDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CGetData extends AGetData {
    BufferedReader reader;

    public CGetData() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getData() throws IOException {
        String text = "Введите данные в произвольном порядке, разделенные пробелом:";
        System.out.println(text);
        System.out.print("Введите данные: ");
        String data = "";
        try {
            data = this.reader.readLine();
        }catch (IOException e){
            throw new GetDataException(new IOException());
        }
        return data;
    }
}
