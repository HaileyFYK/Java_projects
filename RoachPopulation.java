/**
 * Author: Hailey Kuo
 * Date: 10/07/2026
 * Description: 
 */
 
import java.util.Scanner;

public class RoachPopulation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("This is a roach breed and spray simulator");
        System.out.println("");
        
        System.out.print("Enter initial roach number: ");
        int population = in.nextInt();
        
        System.out.println("");

        
        RoachSimulation simulator = new RoachSimulation(population);

        System.out.println("Roach initial population: " + simulator.getRoaches());
        
        simulator.breed();
        simulator.spray();
        System.out.println("Roach population after first breed and spray: " + simulator.getRoaches());

        simulator.breed();
        simulator.spray();
        System.out.println("Roach population after second breed and spray: " + simulator.getRoaches());

        simulator.breed();
        simulator.spray();
        System.out.println("Roach population after third breed and spray: " + simulator.getRoaches());

        simulator.breed();
        simulator.spray();
        System.out.println("Roach population after fourth breed and spray: " + simulator.getRoaches());
        
        in.close();
    }
}