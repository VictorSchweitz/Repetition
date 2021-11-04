public class VehiclesForExerciseTwo
{
    // Setting
    private String vehicleType;
    private double velocity;

    // Velocity in kilometres per hour
    private int maxVelocity = 80;

    private double mileage;

    // Setting up the constructor
    public VehiclesForExerciseTwo(String vehicleType, double velocity, int maxVelocity, double mileage)
    {
        // Setting the variables equal to whatever value their objects have
        this.vehicleType = vehicleType;
        this.velocity = velocity;
        this.maxVelocity = maxVelocity;
        this.mileage = mileage;
    }

    // Overriding
    @Override
    public String toString()
    {
        return "Vehicles{" +
                "vehicleType='" + vehicleType + '\'' +
                ", velocity=" + velocity +
                ", maxVelocity=" + maxVelocity +
                ", mileage=" + mileage +
                '}';
    }
}
