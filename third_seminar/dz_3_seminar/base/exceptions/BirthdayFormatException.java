package dz_3_seminar.base.exceptions;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Incorrect birthday's format!!!");
    }
}
