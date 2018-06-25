package commonUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReader {

    public static FileInputStream readFile(String FilePath, Properties prop)
    {
        System.out.println(FilePath);
        File file = new File(FilePath);
        FileInputStream fileInput = null;
        try
        {
            fileInput = new FileInputStream(file);
            System.out.println(" fileinput is" + fileInput);
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