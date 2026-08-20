public class ProgrammingExercisesPopulationProjection {
    public static void main(String[] args) {
            System.out.println("1.11 (Population Projection) " +
                    "The U.S. Census Bureau projects population based on the following assumptions: " +
                    "- One birth every 7 seconds;" +
                    "- One death every 13 seconds;" +
                    "- One new immigrant every 45 seconds." +
                    "Write a program to display the population for each of the next five years. " +
                    "Assume that the current population is 312,032,486," +
                    "and one year has 365 days." +
                    "Hint: In Java, if two integers perform division, the result is an integer. " +
                    "The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) " +
                    "and 10 / 4 is 2 (not 2.5). " +
                    "To get an accurate result with the fractional part," +
                    "one of the values involved in the division must be a number " +
                    "with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.");
            System.out.println();
            System.out.println("Current population: 312032486");
            System.out.println();
            System.out.println("Convert year to seconds: ");
            System.out.print("365 * 24 * 3600 = ");
            System.out.println(365 * 24 * 3600);
            System.out.println();
            System.out.println("Events per year: ");
            System.out.print("Births: ");
            System.out.println(157680000 / 7.0);
            System.out.println();
            System.out.print("Deaths: ");
            System.out.println(157680000 / 13.0);
            System.out.println();
            System.out.print("Immigrants: ");
            System.out.println(157680000 / 45.0);
            System.out.println();
            System.out.print("Positive population balance: ");
            System.out.println((157680000 / 7.0) + (157680000 / 45.0));
            System.out.println();
            System.out.print("Negative population balance: ");
            System.out.println(157680000 / 13.0);
            System.out.println();
            System.out.print("Population balance: ");
            System.out.println((157680000 / 7.0) + (157680000 / 45.0) - (157680000 / 13.0));
            System.out.println();
            System.out.print("Population in one year: ");
            System.out.println(((157680000 / 7.0) + (157680000 / 45.0) - (157680000 / 13.0)) + 312032486);
            System.out.println();
            System.out.print("Population in two years: ");
            System.out.println(((157680000 / 7.0) + (157680000 / 45.0) - (157680000 / 13.0)) * 2 + 312032486);
            System.out.println();
            System.out.print("Population in three years: ");
            System.out.println(((157680000 / 7.0) + (157680000 / 45.0) - (157680000 / 13.0)) * 3 + 312032486);
            System.out.println();
            System.out.print("Population in four years: ");
            System.out.println(((157680000 / 7.0) + (157680000 / 45.0) - (157680000 / 13.0)) * 4 + 312032486);
            System.out.println();
            System.out.print("Population in five years: ");
            System.out.println(((157680000 / 7.0) + (157680000 / 45.0) - (157680000 / 13.0)) * 5 + 312032486);
    }
}
