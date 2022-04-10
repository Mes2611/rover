import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void shoudReturnOuestForCardinalPointNordAndLetterL() {
        Assert.assertEquals(CardinalPoints.ouest, Rover.roverFacing(CardinalPoints.nord, "L"));
    }

    @Test
    public void shoudReturnEstForCardinalPointNordAndLetterR() {
        Assert.assertEquals(CardinalPoints.est, Rover.roverFacing(CardinalPoints.nord, "R"));
    }

    @Test
    public void shoudReturnEstForCardinalPointSudAndLetterL() {
        Assert.assertEquals(CardinalPoints.est, Rover.roverFacing(CardinalPoints.sud, "L"));
    }

    @Test
    public void shoudReturnOuestForCardinalPointSudAndLetterR() {
        Assert.assertEquals(CardinalPoints.ouest, Rover.roverFacing(CardinalPoints.sud, "R"));
    }

    @Test
    public void shoudReturnNordForCardinalPointEstAndLetterL() {
        Assert.assertEquals(CardinalPoints.nord, Rover.roverFacing(CardinalPoints.est, "L"));
    }

    @Test
    public void shoudReturnSudForCardinalPointEstAndLetterR() {
        Assert.assertEquals(CardinalPoints.sud, Rover.roverFacing(CardinalPoints.est, "R"));
    }

    @Test
    public void shoudReturnNullForCardinalPointEstAndLetterDontExist() {
        Assert.assertNull(Rover.roverFacing(CardinalPoints.est, "X "));
    }
}
