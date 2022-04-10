import java.io.File;
import java.io.FileNotFoundException;

public class RoverMain
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try {
            File newFile = new File(args[0]);
            Plateau.printRover(new File(newFile.getAbsolutePath()));
        } catch (FileNotFoundException fe) {
            throw fe;
        }

    }
}
