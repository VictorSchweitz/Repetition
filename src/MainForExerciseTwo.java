// Super class
public class MainForExerciseTwo
{
    // Setting up a main method
    public static void main(String[] args)
    {
        // NOTE //
        /*
          The little "off" variable names come from the refactoring, since IntelliJ wouldn't let me have another folder for some reason to separate
          this multi-file exercise from the other files (but I do still think they make sense, though. But just for your information)
        */

        // Instantiating a new object of vehicle and truck
        VehiclesForExerciseTwo vehicle = new VehiclesForExerciseTwo("Car", 60, 220, 50.000);
        TruckForExerciseTwo truck = new TruckForExerciseTwo("Truck", 60, 90, 35.000, 8);

        // Printing the objects
        System.out.println(vehicle);
        System.out.println(truck);
    }

}
