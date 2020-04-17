/**
 * RingworldTester is a tester class for Ringworld.
 * 
 * Group Members:
 *     Luke Pastore
 *     Ansh Motiani
 *     Gar Rudnyai
 *
 * @author Luke Pastore
 * @version April 17, 2020
 */
public class RingworldTester
{
    public static void main(String[] args)
    {
        Planet myPlanet = new Planet();
        
        
        String [] planetNames = {"Mercury", "Venus", "Earth",
             "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        
        Ringworld myRW = new Ringworld(myPlanet.getPlanets());
        
        // When going through a loop we wanted to make sure the english was
        // correct. This required us to address the special case of 
        // "1 planet" instead of "1 planets."
        System.out.println("Planet #1 is: " + planetNames[0]);
        myRW.addVolume(myRW.getPlanetVolume(0));
        System.out.println("Current Ringworld radius after 1 planet is: " + 
            myRW.getRadius() + " AU");
        System.out.println("Current Ringworld area after 1 planet is: " + 
            myRW.getArea() + " Earth Units\n");
        
        for(int i = 1; i < myPlanet.getPlanets().length; i++)
        {
            int count = i + 1;
            System.out.println("Planet #" + count +" is: " + 
                planetNames[i]);
            myRW.addVolume(myRW.getPlanetVolume(i));
            System.out.println("Current Ringworld radius after " + count + 
                " planets is: " + myRW.getRadius() + " AU");
            System.out.println("Current Ringworld area after " + count + 
                " planets is: " + myRW.getArea() + " Earth Units\n");
        }
    }
}
