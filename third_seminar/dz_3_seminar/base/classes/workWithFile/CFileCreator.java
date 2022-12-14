package dz_3_seminar.base.classes.workWithFile;

import dz_3_seminar.base.abstractClasses.AFileCreator;
import dz_3_seminar.base.exceptions.FileCreateException;

import java.io.File;
import java.io.IOException;

public class CFileCreator extends AFileCreator {
    /**
     * Создает новый файл по указанному пути.
     * @param path - путь плюс имя файла и расширение.
     * @return - возвращает true в случае удачного создания.
     */
    @Override
    public boolean createFile(String path) throws FileCreateException {
        super.file = new File(path);
        try {
            return super.file.createNewFile();
        }catch (IOException e){
            throw new FileCreateException(e.getMessage());
        }
    }
}
