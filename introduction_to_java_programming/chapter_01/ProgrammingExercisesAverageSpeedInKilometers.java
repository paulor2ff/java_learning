public class ProgrammingExercisesAverageSpeedInKilometers {
    public static void main(String[] args) {
        System.out.println("1.12 (Average speed in kilometers) " +
                "Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. " +
                "Write a program that displays the average speed in kilometers per hour. " +
                "(Note 1 mile is equal to 1.6 kilometers.)");
        System.out.println();
        System.out.print("Converting miles to kilometers: ");
        System.out.println(24 * 1.6);
        System.out.println();
        System.out.print("Converting time to hours: ");
        System.out.println(1 + 40.0 / 60 + 35.0 / 3600);
        System.out.print("Calculating average speed: ");
        System.out.println((24 * 1.6) / (1 + 40.0 / 60 + 35.0 / 3600));
    }
}
