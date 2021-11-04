// This class inherits from the VehiclesForExerciseTwo class
public class TruckForExerciseTwo extends VehiclesForExerciseTwo
{
    // Setting up a variable and assign it
    private int maxWeightInTonnes = 8;

    // Setting up the constructor
    public TruckForExerciseTwo(String vehicleType, double velocity, int maxVelocity, double mileage, int maxWeightInTonnes)
    {
        // Calling the super class
        super(vehicleType, velocity, maxVelocity, mileage);

        // Setting the maxWeightInTonnes to whatever its object's value is
        this.maxWeightInTonnes = maxWeightInTonnes;
    }

    // Overriding the method
    @Override
    public String toString()
    {
        return "Truck{" +
                "maxWeightInTonnes=" + maxWeightInTonnes +
                '}';
    }
}
