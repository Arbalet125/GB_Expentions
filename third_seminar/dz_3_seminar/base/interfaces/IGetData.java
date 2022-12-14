package dz_3_seminar.base.interfaces;

import dz_3_seminar.base.exceptions.GetDataException;

import java.io.IOException;

public interface IGetData {
    public String getData() throws IOException;
}
