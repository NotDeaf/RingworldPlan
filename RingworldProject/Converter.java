/**
 * Converter is an auxiliary class to Planet and Ringworld which is
 *     converts between units to control the units of the calculations
 *     within the Planet and Ringworld classes
 *
 * @author Luke Pastore
 * @author Ansh Motiani
 * @author Gar Rudnyai
 * @version April 14, 2020
 */
public class Converter
{
    private double currentValue;
    private final static double 
        FEETSQRD_TO_MILESQRD = 3.58701 * Math.pow(10, -8);
    private final static double 
        FEETCUBED_TO_MILECUBED = 6.79357 * Math.pow(10, -8);
    
    /**
     * Constructor for Converter objects
     * @param current current value
     */
    public Converter(double current)
    {
        this.currentValue = current;
    }
    
    /**
     * Converts a measurement in feet squared to sqaure miles
     * @param feetSquared measurement in feet squared
     */
    public static double ft2ToMi2(double feetSquared)
    {
        return feetSquared * FEETSQRD_TO_MILESQRD;
    }
    
    /**
     * Converts a measurement in feet cubed to miles cubed
     * @param feetCubed measurement in feet cubed
     */
    public static double ft3ToMi3(double feetCubed)
    {
        return feetCubed * FEETCUBED_TO_MILECUBED;
    }
}
