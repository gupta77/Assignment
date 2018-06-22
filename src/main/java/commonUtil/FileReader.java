package commonUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

    public FileInputStream readFile(String FilePath, Properties prop)
    {
        File file = new File(FilePath);
        FileInputStream fileInput = null;
        try
        {
            fileInput = new FileInputStream(file);
        }
        catch (FileNotFoundException e)
        {
        }
        try
        {
            prop.load(fileInput);
        }
        catch (IOException e)
        {
        }
        return fileInput;
    }

}