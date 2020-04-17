/**
 * Converter is an auxiliary class to Planet and Ringworld which is
 *     converts between units to control the units of the calculations
 *     within the Planet and Ringworld classes
 *     
 * Group Members:
 *     Luke Pastore
 *     Ansh Motiani
 *     Gar Rudnyai
 *
 * @author Ansh Motiani
 * @version April 14, 2020
 */
public class Converter
{
    private final static double FEETSQRD_TO_MILESQRD = 
        3.58701 * Math.pow(10, -8);
    private final static double FEETCUBED_TO_MILECUBED = 
        6.79357 * Math.pow(10, -8);
    private final static double MILES_TO_ASTRONOMICAL_UNITS = 
        1.0758 * Math.pow(10,-8);
    private final static double METERS_TO_MILES = 
        6.21371 * Math.pow(10, -4);
    private final static double SQUARE_MILES_TO_EARTH_UNITS = 
        1 / 1.699 * Math.pow(10, 8);
    
    /**
     * Converts a measurement in meters to miles
     * @param - measurement in miles
     */
    public static double MetersToMi(double meterAmount)
    {
        return meterAmount * METERS_TO_MILES;
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
    
    /**
    * Converts a measurement in miles to astronomical units
    * @param miles measurement in miles
    */
    public static double MiToAU(double miles)
    {
        return miles * MILES_TO_ASTRONOMICAL_UNITS;
    }
    
    /**
    * Converts a measurement in sqaure miles to earth units
    * @param miles2 measurement in square miles
    */
    public static double Mi2ToEarthUnits(double miles2)
    {
        return miles2 * SQUARE_MILES_TO_EARTH_UNITS;
    }
}
