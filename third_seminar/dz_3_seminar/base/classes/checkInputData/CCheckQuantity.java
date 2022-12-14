package dz_3_seminar.base.classes.checkInputData;

import dz_3_seminar.base.abstractClasses.ACheckQuantity;
import dz_3_seminar.base.exceptions.CheckQuantityException;

public class CCheckQuantity extends ACheckQuantity {
    @Override
    public boolean checkQuantity(String data[]) {
        if(data.length!=6)
            throw new CheckQuantityException();
        return true;
    }
}
