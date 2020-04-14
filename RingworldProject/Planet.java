/**
 * Planet is an auxiliary class to Ringworld that allows for
 * Planets to be stored in objects.
 *
 * @author Luke Pastore
 * @author Ansh Motiani
 * @author Gar Rudnyai
 * @version April 14, 2020
 */
public class Planet
{
    // Instance Variables
    private double radiusFt;
    private double volumeFt3;
    private double surfaceAreaFt2;
    
    // Our Universe's Planet's Volume in Cubic Feet
    private final double JUPITER_VOLUME_FT3 = 1.43128 * Math.pow(10,15);
    private final double SATURN_VOLUME_FT3 = 8.2713 * Math.pow(10,14);
    private final double URANUS_VOLUME_FT3 = 6.833 * Math.pow(10,13);
    private final double NEPTUNE_VOLUME_FT3 = 6.254 * Math.pow(10 ,13);
    private final double EARTH_VOLUME_FT3 = 1.08321 * Math.pow(10,12);
    private final double VENUS_VOLUME_FT3 = 9.2843 * Math.pow(10,11);
    private final double MARS_VOLUME_FT3 = 1.6318 * Math.pow(10,11);
    private final double MERCURY_VOLUME_FT3 = 6.083 * Math.pow(10,10);
    
    /**
     * No Parameter Planet constructor
     */
    public Planet()
    {
        this.radiusFt = 0;
        this.volumeFt3 = 0;
        this.surfaceAreaFt2 = 0;
    }
    
    /**
     * Planet constructor given the radius of the planet
     * @param radius the radius of the planet, in feet
     */
    public Planet(double radiusFt)
    {
        this.radiusFt = radiusFt;
        this.volumeFt3 = 2 * radiusFt * Math.PI;
        this.surfaceAreaFt2 = 4 * Math.pow(radiusFt, 2) * Math.PI;
    }
    
    /**
     * Adds a given amount of volume, assuming that the planet is
     *     always perfectly spherical
     * @param double quantity in feet cubed
     */
    public void addVolume(double quantity)
    {
        volumeFt3 += quantity;
    }
    
    /**
     * returns volumes in miles cubed
     * @return volume in miles cubed
     */
    public double getVolume()
    {
        return Converter.ft3ToMi3(volumeFt3);
    }
    
    
    /**
     * returns surface area in square miles
     * @return surfaceArea in miles squared
     */
    public double getSurfaceArea()
    {
        return Converter.ft2ToMi2(surfaceAreaFt2);
    }
    
    /**
    * returns array of all planet's volumes
    * @return returns array of all planet's volumes in cubic feet
    */
    public double [] getPlanets()
    {
        double [] planets = {
            JUPITER_VOLUME_FT3, SATURN_VOLUME_FT3,
            URANUS_VOLUME_FT3, NEPTUNE_VOLUME_FT3,
            EARTH_VOLUME_FT3, VENUS_VOLUME_FT3,
            MARS_VOLUME_FT3, MERCURY_VOLUME_FT3,
        }
        return planets;
}
