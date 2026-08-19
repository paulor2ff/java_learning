public class ProgrammingExercisesApproximatePi {
    public static void main(String[] args) {
        System.out.println("1.7 (Approximate Pi) Pi can be computed using the following formula: " +
                "Write a program that displays the result of _ " +
                "and _. " +
                "Use 1.0 instead of 1 in your program.");
        System.out.println();
        System.out.print("4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11) = ");
        System.out.println(4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
        System.out.print("4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13) = ");
        System.out.println(4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
    }
}
