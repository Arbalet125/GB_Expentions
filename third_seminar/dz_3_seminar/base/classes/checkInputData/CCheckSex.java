package dz_3_seminar.base.classes.checkInputData;

import dz_3_seminar.base.abstractClasses.ACheckData;
import dz_3_seminar.base.exceptions.CheckSexException;
import dz_3_seminar.base.exceptions.IncorrectSexValuesException;

public class CCheckSex extends ACheckData {
    @Override
    public boolean checkElement(String data) {
        if(data.equals(""))
            throw new CheckSexException();
        if(!(data.contains("f") || data.contains("m")))
            throw new IncorrectSexValuesException();
        return true;
    }
}
