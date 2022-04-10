import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Plateau
{
    private Plateau() {

    }

    /**
     *
     * @param file
     * @throws FileNotFoundException
     */
    public static void printRover(File file) throws FileNotFoundException
    {
        List<String> listExtractSub = new ArrayList<>();
        Rover rover = null;

        try
        {
            List<String> fileExtract = new ArrayList<>(ExtractFile.readFile(file));
            int maxX = Integer.parseInt(fileExtract.get(0).split(" ")[0]);
            int maxY = Integer.parseInt(fileExtract.get(0).split(" ")[1]);

            for (int i = 1; i < fileExtract.size(); i = i + 2)
            {
                // extrait les 2 lignes idiquant la position initiale du rover et ses mouvements
                listExtractSub.addAll(fileExtract.subList(i, i + 2));

                //position initiale du rover
                rover = new Rover(Integer.parseInt(listExtractSub.get(0).split(" ")[0]),
                    Integer.parseInt(listExtractSub.get(0).split(" ")[1]),
                    listExtractSub.get(0).split(" ")[2]);

                pos(rover, listExtractSub, maxX, maxY);

                //suppression des données du rover pour insérer celle du prochain
                listExtractSub.clear();
            }
        }
        catch (FileNotFoundException fe)
        {
            throw fe;
        }
    }

    /**
     * retourne la position du rover après mouvements
     * @param rover
     * @param listExtract
     * @param maxX
     * @param maxY
     * @return
     */
    private static Rover pos(Rover rover, List<String> listExtract, int maxX, int maxY)
    {
        String mov = listExtract.get(1);
        for (int i = 0; i < mov.length(); i++)
        {
            moveONplateau(rover, String.valueOf(mov.charAt(i)), maxX, maxY);
        }
        return rover;
    }

    /**
     * déplacement du rover sur le plateau
     * @param rover
     * @param letterMove
     * @param maxX
     * @param maxY
     */
    private static void moveONplateau(Rover rover, String letterMove, int maxX, int maxY)
    {
        if ("M".equals(letterMove))
        {
            if (CardinalPoints.est.getCode().equals(rover.getCurentFacing()) || CardinalPoints.ouest.getCode().equals(rover.getCurentFacing()))
            {
                moveOnX(rover, maxX);
            }

            if (CardinalPoints.nord.getCode().equals(rover.getCurentFacing()) || CardinalPoints.sud.getCode().equals(rover.getCurentFacing()))
            {
                moveOnY(rover, maxY);
            }
        }
        else
        {
            rover.setCurentFacing(Rover.roverFacing(CardinalPoints.valueOf(CardinalPoints.nameLetter(rover.getCurentFacing())), letterMove).getCode());
        }
    }

    /**
     * déplacement du rover sur l'axe des x
     * @param rover
     * @param maxX
     */
    private static void moveOnX(Rover rover, int maxX)
    {
        if (CardinalPoints.est.getCode().equals(rover.getCurentFacing()) && rover.getX() <= maxX)
        {
            rover.setX(rover.getX() + 1);
        }

        if (CardinalPoints.ouest.getCode().equals(rover.getCurentFacing()) && rover.getX() > 0)
        {
            rover.setX(rover.getX() - 1);
        }
    }

    /**
     * déplacement du rover sur l'axe des y
     * @param rover
     * @param maxY
     */
    private static void moveOnY(Rover rover, int maxY)
    {
        if (CardinalPoints.nord.getCode().equals(rover.getCurentFacing()) && rover.getY() <= maxY)
        {
            rover.setY(rover.getY() + 1);
        }

        if (CardinalPoints.sud.getCode().equals(rover.getCurentFacing()) && rover.getY() > 0)
        {
            rover.setY(rover.getY() - 1);
        }
    }
}
