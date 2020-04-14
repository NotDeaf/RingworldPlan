public class Converter
{
    private double currentValue;
    private double final FEETSQRD_TO_MILESQRD = 3.58701 * Math.pow(10, -8);
    private double final FEETCUBED_TO_MILECUBED = 6.79357 * Math.pow(10, -8);
    
    public Converter(double current)
    {
        this.currentValue = current;
    }
    
    public double ft2ToMi2(double feetSquared)
    {
        return feetSquared * FEETSQRD_TO_MILESQRD;
    }
    
    public double ft2ToMi2(double feetCubed)
    {
        return feetCubed * FEETCUBED_TO_MILECUBED;
    }
}
