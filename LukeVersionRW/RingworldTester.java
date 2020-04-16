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
        double [] test = myPlanet.getPlanets().clone();
        
        String [] planetNames = {"Mercury", "Venus", "Earth",
             "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        
        Ringworld myRW = new Ringworld(test);
        
        for(int i = 0; i < test.length; i++)
        {
            int count = i + 1;
            System.out.println("Planet #" + count +" is: " + planetNames[i]);
            myRW.addVolume(myRW.getPlanetVolume(i));
            System.out.println("Current radius after " + count + " planets is: " + myRW.getRadius() + "AU");
            System.out.println("Current area after " + count + " planets is: " + myRW.getArea() + "Earth Units\n");
        }
        
        
        
        //Gar's Solution
        
        // System.out.println("First Planet: Mercury");
        // System.out.println("Volume in cubic miles: " + Converter.ft3ToMi3(myWorld.getPlanetVolume(0)));
        // myWorld.addVolume(Converter.ft3ToMi3(myWorld.getPlanetVolume(0)));
        // System.out.println("Volume of Ringworld after addition: " + myWorld.getVolume);
        // System.out.println();
        
        // System.out.println("First Planet: Venus");
        // System.out.println("First Planet: Earth");
        // System.out.println("First Planet: Mars");
        // System.out.println("First Planet: Jupiter");
        // System.out.println("First Planet: Saturn");
        // System.out.println("First Planet: Uranus");
        // System.out.println("First Planet: Neptune");
    }
}
