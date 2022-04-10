public class Rover
{
    private int    x;
    private int    y;
    private String curentFacing;

    public Rover(int x, int y, String facing)
    {
        this.x = x;
        this.y = y;
        this.curentFacing = facing;
    }

    /**
     * rotation du rover
     * @param facing
     * @param letter
     * @return
     */
    public static CardinalPoints roverFacing(CardinalPoints facing, String letter)
    {
        if (CardinalPoints.nord.equals(facing))
        {
            return roverFacingNord(letter);
        }

        if (CardinalPoints.sud.equals(facing))
        {
            return roverFacingSud(letter);
        }

        if (CardinalPoints.est.equals(facing))
        {
            return roverFacingEst(letter);
        }

        if (CardinalPoints.ouest.equals(facing))
        {
            return roverFacingOuest(letter);
        }

        return null;
    }

    /**
     * renvoie la direction du rover par rapport à une rotation sur le nord
     * @param letter
     * @return
     */
    private static CardinalPoints roverFacingNord(String letter)
    {
        if ("L".equals(letter))
        {
            return CardinalPoints.ouest;
        }
        if ("R".equals(letter))
        {
            return CardinalPoints.est;
        }

        return null;
    }

    /**
     *  renvoie la direction du rover par rapport à une rotation sur le sud
     * @param letter
     * @return
     */
    private static CardinalPoints roverFacingSud(String letter)
    {
        if ("L".equals(letter))
        {
            return CardinalPoints.est;
        }
        if ("R".equals(letter))
        {
            return CardinalPoints.ouest;
        }

        return null;
    }

    /**
     * renvoie la direction du rover par rapport à une rotation sur l'est
     * @param letter
     * @return
     */
    private static CardinalPoints roverFacingEst(String letter)
    {
        if ("L".equals(letter))
        {
            return CardinalPoints.nord;
        }
        if ("R".equals(letter))
        {
            return CardinalPoints.sud;
        }

        return null;
    }

    /**
     * renvoie la direction du rover par rapport à une rotation sur l'ouest
     * @param letter
     * @return
     */
    private static CardinalPoints roverFacingOuest(String letter)
    {
        if ("L".equals(letter))
        {
            return CardinalPoints.sud;
        }
        if ("R".equals(letter))
        {
            return CardinalPoints.nord;
        }

        return null;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public String getCurentFacing()
    {
        return curentFacing;
    }

    public void setCurentFacing(String curentFacing)
    {
        this.curentFacing = curentFacing;
    }

    @Override public String toString()
    {
        return x +
            " " + y +
            " " + curentFacing;
    }
}
