import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class ExtractFileTest
{
    private ExtractFile extractFile = new ExtractFile();

    @Test
    public void shoulReturn55Nforfileindex1() throws FileNotFoundException
    {
        Assert.assertEquals(List.of("55N"), extractFile.readFile(new File("fileForTest\\index1.txt")));
    }

    //testInput is the input of the project explication 5 5, 1 2 N, LMLMLMLMM, 3 3 E, MMRMMRMRRM
    @Test
    public void shoulReturnTestInputforfileindex2() throws FileNotFoundException
    {
        Assert.assertEquals(List.of("5 5", "1 2 N", "LMLMLMLMM", "3 3 E", "MMRMMRMRRM"), extractFile.readFile(new File("fileForTest\\index2.txt")));
    }

}
