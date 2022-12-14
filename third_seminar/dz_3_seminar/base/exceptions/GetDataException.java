package dz_3_seminar.base.exceptions;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException message) {
        super("Exception while reading from console: " + message.getMessage());
    }
}
