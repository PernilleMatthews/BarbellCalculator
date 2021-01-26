import java.util.Scanner;

public class BarbellClient {
    private static int barbellWeight;
    private static double totalWeight;
    private static double newWeight;
    private static Scanner input;
    private static WeightPlate[] plates;
    private static double weight;


    public static void main(String[] args) {
        input = new Scanner(System.in);
        init(); // Prompt user for weight.   
        calculateNewWeight(); // Calculate weight for each side.    
        WeightPlate.calculateWeightPlateCount(newWeight);  // Calculate plates.
        printCountOfPlates(); // Print count of plates
    }

    /*
     * Initialisation prompting user for input.
     */
    private static void init() {
        System.out.print("How much does your barbell weigh? (15 or 20kg): ");
        barbellWeight = input.nextInt();
        System.out.print("What is the total weight? (including the barbell): ");
        totalWeight = input.nextDouble();        
    }
    
    /*
    * Calculate how much weight must be distributed between the two
    * sides of the barbell (excluding the barbell weight)
    */
    private static void calculateNewWeight() {
        newWeight = (totalWeight - barbellWeight) / 2;
        System.out.println("You need: " + newWeight + "kg on each side. You can achieve this by adding:");
    }

    /**
     * Prints which weight plates should be added to one side
     * based on the count from each weight object.
     */
    private static void printCountOfPlates() {
        double sum = 0;
        for (WeightPlate plate : Weights.plates) {
            if (plate.hasCount()) {
                System.out.println((int)plate.count() + " x " +  plate.weight() + "kg");
                sum = (sum + (plate.weight() * plate.count()));
            }
        }

        // In case of inaccurate result
        if(sum != newWeight) {
            System.out.println();
            System.out.println("ATTENTION!! This is a courtesy message." );
            System.out.println("GAINS may be lost because you do not have the exact weight plates to achieve exactly: " + totalWeight + "kg.");
            System.out.println("The weights above is the closest you can get with the given weight plates.");  
            System.out.println("You will be missing: " + (newWeight - sum) + "kg on each side.");
        }
    }
}
