package dz_3_seminar.base.interfaces;

import dz_3_seminar.base.exceptions.FileCreateException;

import java.io.IOException;

public interface ICreateFile {
    public boolean createFile(String path) throws FileCreateException;
}
