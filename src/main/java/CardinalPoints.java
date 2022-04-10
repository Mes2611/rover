public enum CardinalPoints
{

    nord("N"),
    sud("S"),
    ouest("O"),
    est("E");

    String code;

    CardinalPoints(String code)
    {
        this.code = code;
    }

    public static String nameLetter(String name)
    {
        for (CardinalPoints c : CardinalPoints.values())
        {
            if (c.getCode().equals(name))
            {
                return c.name();
            }
        }
        return null;
    }

    public String getCode()
    {
        return code;
    }
}
