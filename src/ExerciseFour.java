public class ExerciseFour
{
    public static void main(String[] args)
    {
      /*
        The U.S. Census Bureau projects population
        based on the following assumption:

        - One birth happens every 7 seconds
        - One death happens every 13 seconds
        - The population of the USA is currently: 331,002,651
      */

        // Numbers represent seconds
        int newBorn = 7;
        int newDeath = 13;


        // 157,784,630
        int secondsInFiveYears = 157784630;


        // Millions (331,002,651)
        int currentPopulation = 331002651;


        // Birth //
        int bornPeople = birth(newBorn, secondsInFiveYears);
        // Printing result
        System.out.println("Number of born people in five years: " + bornPeople);



        // Death //
        int deathPeople = death(newDeath, secondsInFiveYears);
        // Printing result
        System.out.println("Number of death people in five years: " + deathPeople);



        // Population in five years //
        int newPopulationNumber = populationInFiveYears(currentPopulation, newBorn, deathPeople);
        // Printing result
        System.out.println("Population in five years: " + newPopulationNumber);



        // Population growth in percentage //
        double fiveYearsGrowth = fiveYearsGrowthInPercentage(currentPopulation, newPopulationNumber);

        // Rounding down to two decimal places
        fiveYearsGrowth = Math.round(fiveYearsGrowth * 100.0) / 100.0;

        // Printing result
        System.out.println("The percentile growth is " + fiveYearsGrowth);
    }


    // Calculating number of people born in five years
    static public int birth(int newBorn, int secondsInFiveYears)
    {
        // Returning result
        return secondsInFiveYears / newBorn;
    }

    // Calculating number of death people in five years
    static public int death(int newDeath, int secondsInFiveYears)
    {
        // Returning result
        return (secondsInFiveYears / newDeath);
    }

    // Calculating the total population in five years
    static public int populationInFiveYears(int currentPopulation, int newBorn, int deathPeople)
    {
        // Returning result
        return (currentPopulation + newBorn) - deathPeople;
    }

    // Calculating the percentile growth
    static public double fiveYearsGrowthInPercentage(int currentPopulation, int newPopulation)
    {
        // Returning result with both values as doubles (since it somehow won't return anything but 100.0 ...)
        return ((double) currentPopulation / (double) newPopulation) * 100;
    }
}
