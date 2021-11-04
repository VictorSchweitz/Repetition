import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExerciseThree
{
    public static void main(String[] args)
    {
        // Setting up the try block
        try
        {
            // Creating a line counter
            int lineCounter = 0;

            // Instantiating a new File object to read the files
            File wordsFile = new File("src/ExerciseThree.txt");

            // Instantiating a scanner to read each lines in the file instantiated above
            Scanner readLine = new Scanner(wordsFile);

            // Setting up a while loop running as long as the file has lines
            while (readLine.hasNextLine())
            {
                // Increment line counter by one for each line read
                lineCounter++;

                // Making sure each word is on its own line
                String words = readLine.nextLine();
            }

            // Print out the amount of lines
            System.out.println("There are " + lineCounter + " words in this file.");

            // Close the file reader
            readLine.close();
        }

        // Setting up the catch block for error handling in case something goes wrong in runtime
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
