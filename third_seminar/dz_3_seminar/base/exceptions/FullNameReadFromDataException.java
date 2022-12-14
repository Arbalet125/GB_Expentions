package dz_3_seminar.base.exceptions;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    public FullNameReadFromDataException(String s) {
        super("Parse full name exception: " + s);
    }
}
