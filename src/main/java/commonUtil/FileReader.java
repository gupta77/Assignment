package commonUtil;

import java.io.*;
import java.nio.file.Path;
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

    public static Properties readPropsFromFile(String filePath)
    {
        Properties props = new Properties();

        try(InputStream fsi = ClassLoader.getSystemResourceAsStream(filePath)) {
            props.load(fsi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
}