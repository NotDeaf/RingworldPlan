public Planet
{
    // Instance Variables
    private double radius;
    private double volume;
    private double surfaceArea;
    
    // Our Universe's Planet's Volume in Cubic Feet
    private final double JUPITER_VOLUME = Math.pow(1.43128,15);
    private final double SATURN_VOLUME = Math.pow(8.2713,14);
    private final double URANUS_VOLUME = Math.pow(6.833,13);
    private final double NEPTUNE_VOLUME = Math.pow(6.254,13);
    private final double EARTH_VOLUME = Math.pow(1.08321,12);
    private final double VENUS_VOLUME = Math.pow(9.2843,11);
    private final double MARS_VOLUME = Math.pow(1.6318,11);
    private final double MERCURY_VOLUME = Math.pow(6.083,10);
    
    // Constructors
    public Planet()
    {
        this.radius = 0;
        this.volume = 0;
        this.surfaceArea = 0;
    }
    
    public Planet(double radius)
    {
        this.radius = radius;
        this.volume = 2 * radius * Math.PI;
        this.surfaceArea = 4 * Math.pow(radius, 2) * Math.PI;
    }
    
    // Methods
    public addVolume(double quantity)
    {
        volume += quantity;
    }
    
    public double getVolume()
    {
        return ft3ToMi3(volume);
    }
    
    public double getSurfaceArea()
    {
        return ft2ToMiles2(surfaceArea);
    }
}
