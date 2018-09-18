package lab7;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader
{
    String filename;
    File fileExample;

    //constructor
    public FileReader(String filename)
    {
        this.filename =filename;

    }

    //open teh file
    public void openfile()
    {
        fileExample = new File(filename);
    }


    //read file
    public String readline()
    {
        String line = "no line in file";

        try
        {
            Scanner myscan = new Scanner(filename);

            if (myscan.hasNextLine())
            {
                line = myscan.nextLine();
                System.out.println("I read this line "+line);
            }

            myscan.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
