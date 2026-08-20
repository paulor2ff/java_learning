public class ProgrammingExercisesAverageSpeedInMiles {
    public static void main(String[] args) {
        System.out.println("(Average speed in miles) " +
                "Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds. " +
                "Write a program that displays the average speed in miles per hour. " +
                "(Note that 1 mile is 1.6 kilometers.)");
        System.out.println();
        System.out.print("Convert kilometers to miles: ");
        System.out.println(15.0 / 1.6);
        System.out.println();
        System.out.print("Convert time to hours: ");
        System.out.println(50.5 / 60);
        System.out.println();
        System.out.print("Calculate average speed in miles per hour: ");
        System.out.print((15.0 / 1.6) / (50.5 / 60));
        System.out.println(" miles per hour");
    }
}
