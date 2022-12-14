package dz_3_seminar;

import dz_3_seminar.base.classes.Presenter;
import dz_3_seminar.base.classes.checkInputData.*;
import dz_3_seminar.base.classes.parseData.CDataParseProcessor;
import dz_3_seminar.base.classes.ui.CGetData;
import dz_3_seminar.base.classes.workWithFile.CFileCreator;
import dz_3_seminar.base.classes.workWithFile.CFileWriter;
import dz_3_seminar.base.classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class main {
    public static void programm(String[] args) throws IOException {
        String infoPathFolder = "GB_Expentions\third_seminar\dz_3_seminar";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}

