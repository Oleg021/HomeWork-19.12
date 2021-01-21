package lesson10;

import java.io.File;

public class IOHomeWork {

    public String showPath(String path)
    {
        StringBuffer stringBuffer = new StringBuffer();
        File file = new File(path);
        if(file.exists())
        {
            stringBuffer.append(file.getAbsolutePath());
            return stringBuffer.toString();
        }
        else
        {
            String s = "File is not exist";
            return s;
        }
    }

    public void showAllFiles(String dirPath)
    {
        File[] allF = new File(dirPath).listFiles();

        if (allF != null)
        {
            for (File f : allF)
            {
                if(f.isDirectory())
                {
                    System.out.println("Directory: " + f.getName());
                }
                else
                {
                    System.out.println("File: " + f.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        IOHomeWork ioh = new IOHomeWork();
        String p1 = "src/";
        String p2 = "src/lesson10/test.txt";
        File file = new File(p2);
        System.out.println(ioh.showPath(p1));
        ioh.showAllFiles(p1);
    }

}
