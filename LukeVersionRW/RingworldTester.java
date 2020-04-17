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
        double [] myPlanets = myPlanet.getPlanets().clone();
        
        String [] planetNames = {"Mercury", "Venus", "Earth",
             "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        
        Ringworld myRW = new Ringworld(myPlanets);
        
        for(int i = 0; i < myPlanets.length; i++)
        {
            int count = i + 1;
            System.out.println("Planet #" + count +" is: " + planetNames[i]);
            myRW.addVolume(myRW.getPlanetVolume(i));
            System.out.println("Current radius after " + count + " planets is: " + myRW.getRadius() + " AU");
            System.out.println("Current area after " + count + " planets is: " + myRW.getArea() + " Earth Units\n");
        }
    }
}
