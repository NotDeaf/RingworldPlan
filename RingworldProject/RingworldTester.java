/**
 * RingworldTester is a tester class for Ringworld.
 * 
 * Group Members:
 *     Luke Pastore
 *     Ansh Motiani
 *     Gar Rudnyai
 *
 * @author (your name)
 * @version April 16, 2020
 */
public class RingworldTester
{
    public static void main(String[] args)
    {
        Planet myPlanet = new Planet();
        
        Ringworld myWorld = new Ringworld(myPlanet.getPlanets());
        
        System.out.println("First Planet: Mercury");
        System.out.println("Volume in cubic miles: " + 
            Converter.ft3ToMi3(myWorld.getPlanetVolume(0)));
        System.out.println("Volume of Ringworld after addition: " +
            myWorld.addVolume(Converter.ft3ToMi3(
            myWorld.getPlanetVolume(0))));
        System.out.println();
        
        System.out.println("First Planet: Venus");
        System.out.println("First Planet: Earth");
        System.out.println("First Planet: Mars");
        System.out.println("First Planet: Jupiter");
        System.out.println("First Planet: Saturn");
        System.out.println("First Planet: Uranus");
        System.out.println("First Planet: Neptune");
    }
}
