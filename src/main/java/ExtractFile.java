import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractFile
{

    /**
     * lecture du fichier
     * @param file
     * @return
     * @throws FileNotFoundException
     */
    public static List<String> readFile(File file) throws FileNotFoundException
    {
        List<String> extractLine = new ArrayList<>();
        try
        {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                extractLine.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException fe)
        {
            throw fe;
        }

        return extractLine;
    }
}
