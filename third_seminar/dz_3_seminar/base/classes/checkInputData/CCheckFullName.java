package dz_3_seminar.base.classes.checkInputData;

import dz_3_seminar.base.abstractClasses.ACheckFullName;
import dz_3_seminar.base.exceptions.FullNameContainsDigitException;
import dz_3_seminar.base.exceptions.FullNameEmptyValueException;

public class CCheckFullName extends ACheckFullName {

    @Override
    public boolean checkFullName(String[] fullName) {

        for (int i = 0; i < fullName.length; i++) {
            if(fullName[i].length()==0)
                throw new FullNameEmptyValueException();
            for (int j = 0; j < fullName[i].length(); j++) {
                if(Character.isDigit(fullName[i].charAt(j)))
                    throw new FullNameContainsDigitException();
            }
        }
        return true;
    }
}
