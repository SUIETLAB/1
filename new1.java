import java.util.Scanner;

public class new1 {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public Day nextWorkingDay() {
            switch (this) {
                case FRIDAY:
                case SATURDAY:
                case SUNDAY:
                    return MONDAY;
                default:
                    return Day.values()[this.ordinal() + 1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week (e.g., MONDAY): ");
        String input = scanner.nextLine().trim().toUpperCase();

        Day today;
        try {
            today = Day.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day of the week.");
            return;
        }

        System.out.println("Today is: " + today);
        System.out.println("Is today a weekend? " + today.isWeekend());
        System.out.println("Next working day is: " + today.nextWorkingDay());
    }
}
