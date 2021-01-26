public class WeightPlate {
    private double weight;
    private int count;

    /**
     * Precondition: Weight must be a positive double.
     * Constructor creates a weight plate with a given weight.
     */
    public WeightPlate(double weight) {
        this.weight = weight;
        this.count = 0;  
    }

    /**
     * Precondition: Count must be a positive integer.
     * Updates the count of a weight plate
     */
    private void setCount(int count) {
        this.count = count;
    }

    /**
     * Returns the count of each weight plate.
     */
    public int count() {
        return count;
    }

    /**
     * Returns the weight of the plate
     */
    public double weight() {
        return weight;
    }


    /**
     * Returns if a weight plate has a count or not.
     */
    public boolean hasCount() {
        return (this.count > 0) ? true : false;
    }

    /**
     * Precondition: Weight must be a positive integer.
     * Blueprint method for calculating how many of each weight
     * plate exist.
     */
    public static void calculateWeightPlateCount(double weight) {
        for(WeightPlate plate : Weights.plates) {           
            if(weight != 0) {
                int c = (int) (weight / plate.weight);
                plate.setCount(c);                          
                weight = (weight % plate.weight);
            }
        }
    }
}

