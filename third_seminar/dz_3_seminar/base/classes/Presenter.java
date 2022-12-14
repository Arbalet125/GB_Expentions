package dz_3_seminar.base.classes;

import dz_3_seminar.base.abstractClasses.ACheckDataProcessor;
import dz_3_seminar.base.abstractClasses.AFileWriter;
import dz_3_seminar.base.abstractClasses.APresenter;
import dz_3_seminar.base.classes.parseData.CDataParseProcessor;
import dz_3_seminar.base.classes.ui.CGetData;
import dz_3_seminar.base.classes.workWithFile.CFindTheSameFileName;

import java.io.IOException;

public class Presenter extends APresenter {
    private final CGetData getData;
    private final CDataParseProcessor dataParseProcessor;

    private final ACheckDataProcessor dataProcessor;
    private final AFileWriter fileWriter;

    public Presenter(CGetData getData,
                     CDataParseProcessor dataParseProcessor,
                     ACheckDataProcessor dataProcessor,
                     AFileWriter fileWriter
                     ) {
        this.getData = getData;
        this.dataParseProcessor = dataParseProcessor;
        this.dataProcessor = dataProcessor;
        this.fileWriter = fileWriter;
    }

    @Override
    public void run() throws IOException {
        dataParseProcessor.parseData(getData.getData());
        //Check quantity
        dataProcessor.checkQuantity(dataParseProcessor.getDataArray());
        //Check full name
        dataProcessor.checkFullName(dataParseProcessor.getFullName());
        //Check birthday
        dataProcessor.checkBirthday(dataParseProcessor.getBirthday());
        //Check sex
        dataProcessor.checkSex(dataParseProcessor.getSex());
        System.out.println("\nAll checks are OK!!!");
        // Write data to file
        fileWriter.writeToFile(dataParseProcessor.getInfoToWrite());
    }
}
