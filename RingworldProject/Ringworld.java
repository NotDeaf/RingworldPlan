/**
 * Ringworld is a class that constructs data that simulates
 *     a Ringworld, which is a ring that orbits around a star
 *     that is comprised of all of the planets in the universe.
 *     Ringworld uses two auxiliary classes, Planet and Converter,
 *     to make conversion tasks and planet data easy to access.
 *
 * @author Luke Pastore
 * @author Ansh Motiani
 * @author Gar Rudnyai
 * @version April 14, 2020
 */
public class Ringworld
{
    private Planet[] planets;
    
    private Planet[] planets;
    
    public Ringworld(Planet[] planets)
    {
        this.planets = new Planet[8];
        for(int i = 0; i < this.planets.length; i++)
        {
            this.planets[i] = planets[i]; 
        }
    }
}
