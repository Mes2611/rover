import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractFile {

    public List<String> readFile(File file) throws FileNotFoundException {
        List<String> extractLine = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                extractLine.add(scanner.nextLine());
            }
        }catch(FileNotFoundException fe) {
            throw fe;
        }

        return extractLine;
    }
}
