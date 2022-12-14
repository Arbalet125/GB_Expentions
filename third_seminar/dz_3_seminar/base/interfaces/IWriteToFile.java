package dz_3_seminar.base.interfaces;

import dz_3_seminar.base.exceptions.MyFileCreateException;
import dz_3_seminar.base.exceptions.TheSameFileWritingException;

public interface IWriteToFile {
    public boolean writeToFile(String[] infoToWrite) throws TheSameFileWritingException, MyFileCreateException;
}
