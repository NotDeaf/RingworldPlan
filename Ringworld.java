/**
 * Ringworld is a class that constructs data that simulates
 *     a Ringworld, which is a ring that orbits around a star
 *     that is comprised of all of the planets in the universe.
 *     Ringworld uses two auxiliary classes, Planet and Converter,
 *     to make conversion tasks and planet data easy to access.
 *
 * Group Members:
 *     Luke Pastore
 *     Ansh Motiani
 *     Gar Rudnyai
 *     
 * @author Luke Pastore
 * @author Ansh Motiani
 * @author Gar Rudnyai
 * @version April 14, 2020
 */
public class Ringworld
{
    private double [] planets;
    private double totalVolumeMi3;
    private final double EARTH_SURFACE_AREA_MI2 = 196.94 * Math.pow(10, 6);
    private final double RW_INNER_SURFACE_WIDTH_MI = 9.0 * Math.pow(10, 5);
    private final double RW_INNER_SURFACE_HEIGHT_M = 1.0 * Math.pow(10, 2);
    private final double RW_OUTER_SURFACE_WIDTH_M = 1.0 * Math.pow(10, 2);
    private final double RW_OUTER_SURFACE_HEIGHT_MI = 1.0 * Math.pow(10, 3);
    private double RWOuterSurfaceLengthMi;
    private double RWInnerSurfaceLengthMi;
    
    /**
     * 
     */
    public Ringworld(double[] planets)
    {
        this.planets = new double[8];
        for(int i = 0; i < this.planets.length; i++)
        {
            this.planets[i] = planets[i]; 
        }
        totalVolumeMi3 = 0;
    }
    /**
     *
     */
    public void addVolume(double amountMi3)
    {
        this.totalVolumeMi3 += amountMi3;
    }
    /**
     * 
     */
    public double getRadius()
    {
        
        return 0;
    }
    /**
     * 
     */
    public double getArea()
    {
        return 0;
    }
}