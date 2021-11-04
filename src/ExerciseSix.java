import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseSix
{
    public static void main(String[] args)
    {
        // Instantiating array list
        ArrayList<Integer> oneToHundred = new ArrayList<>();

        // Adding numbers to the array list
        for (int i = 0; i < 101; i++)
        {
            oneToHundred.add(i);
        }

        // Printing out the array list with numbers
        System.out.println(oneToHundred);


        // Instantiating a scanner object to get the user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for number
        System.out.println("Please input a number, which multiples you wish to remove from the list (the number itself will remain)" + '\n');

        int userInputNumber = scanner.nextInt();

        // Removing multiples from array
        /*
          Running loop backwards since when an element is removed from an array list, all elements at the oncoming indexes will be moved one step down,
          meaning that the first element after the empty space will be moved on position back and end up in the empty slot and so on and so forth.
        */

        // Running the loop backwards ensure that no spaces in the array list are left empty, once a multiple is removed from the array list
        for (int i = 101; i >= 0; i--)
        {
            // If the remainder is zero, the number is a multiple
            if(i % userInputNumber == 0)
            {
                // Remove the multiple from the list
                oneToHundred.remove(i);
            }

        }

        // Print the new array list without the multiples
        System.out.println(oneToHundred);

    }
}
