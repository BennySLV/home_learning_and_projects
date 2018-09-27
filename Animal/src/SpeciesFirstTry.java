import java.util.Scanner;

/**
 * This class holds records of endangered species
 * (first attempt)
 * 
 * Note that this program violates several 
 * important Object-Oriented design principles
 * 
 * @author Benjamin Silveston
 */
public class SpeciesFirstTry {
    public int id;
    public String name;    
    public int population;
    public double growthRate;
    
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the species' name?");
        this.name = keyboard.nextLine();
        
        System.out.println("What is the id for the species?");
        this.id = keyboard.nextInt();

        System.out.println("What is the population of the species?");
        this.population = keyboard.nextInt();
        
        System.out.println("Enter growth rate (% increase pet year):");
        this.growthRate = keyboard.nextDouble();
    }
    
    public void writeOutput() {
        System.out.println("Id = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Population = " + this.population);
        System.out.println("Growth rate = " + this.growthRate + "%");        
    }
    
    public int getPopulationIn10() {
        int result = 0;
        double populationAmount = this.population;
        int count = 10;
        while((count > 0) && (populationAmount > 0)) {
            populationAmount += (this.growthRate / 100) * populationAmount;
            count--;
        }
        if(populationAmount > 0) {
            result = (int)populationAmount;           
        }
        return result;
    }
}
