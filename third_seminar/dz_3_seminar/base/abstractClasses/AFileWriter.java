package dz_3_seminar.base.abstractClasses;

import dz_3_seminar.base.classes.workWithFile.CFileCreator;
import dz_3_seminar.base.classes.workWithFile.CFindTheSameFileName;
import dz_3_seminar.base.interfaces.IWriteToFile;

import java.io.FileWriter;

public abstract class AFileWriter implements IWriteToFile {
    protected FileWriter fileWriter;
    protected CFileCreator fileCreator;
    protected CFindTheSameFileName findTheSameFileName;
}
