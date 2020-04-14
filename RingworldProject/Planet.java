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
    private double radius;
    private double volume;
    private double surfaceArea;
    
    // Our Universe's Planet's Volume in Cubic Feet
    private final double JUPITER_VOLUME = 1.43128 * Math.pow(10,15);
    private final double SATURN_VOLUME = 8.2713 * Math.pow(10,14);
    private final double URANUS_VOLUME = 6.833 * Math.pow(10,13);
    private final double NEPTUNE_VOLUME = 6.254 * Math.pow(10 ,13);
    private final double EARTH_VOLUME = 1.08321 * Math.pow(10,12);
    private final double VENUS_VOLUME = 9.2843 * Math.pow(10,11);
    private final double MARS_VOLUME = 1.6318 * Math.pow(10,11);
    private final double MERCURY_VOLUME = 6.083 * Math.pow(10,10);
    
    /**
     * No Parameter Planet constructor
     */
    public Planet()
    {
        this.radius = 0;
        this.volume = 0;
        this.surfaceArea = 0;
    }
    
    /**
     * Planet constructor given the radius of the planet
     * @param radius the radius of the planet, in 
     */
    public Planet(double radius)
    {
        this.radius = radius;
        this.volume = 2 * radius * Math.PI;
        this.surfaceArea = 4 * Math.pow(radius, 2) * Math.PI;
    }
    
    /**
     * Adds a given amount of volume, assuming that the planet is
     *     always perfectly spherical
     * @param double quantity
     */
    public void addVolume(double quantity)
    {
        volume += quantity;
    }
    
    /**
     * returns volumes in miles cubed
     * @return volume in miles cubed
     */
    public double getVolume()
    {
        return ft3ToMi3(volume);
    }
    
    
    /**
     * returns surface area in square miles
     * @return surfaceArea in miles squared
     */
    public double getSurfaceArea()
    {
        return ft2ToMiles2(surfaceArea);
    }
}
