package dz_3_seminar.base.exceptions;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        super("File not found: " + message);
    }
}
