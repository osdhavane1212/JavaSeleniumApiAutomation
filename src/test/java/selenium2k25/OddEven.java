package selenium2k25;


public class OddEven {

    // Custom week days
    static final String[] WEEK_DAYS = {
        "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Day8", "Day9"
    };

    // Custom month names (optional)
    static final String[] MONTH_NAMES = {
        "Month1", "Month2", "Month3", "Month4", "Month5", "Month6",
        "Month7", "Month8", "Month9", "Month10", "Month11"
    };

    public static void main(String[] args) {
        // Example: Start from year 2025, month 3, print 5 months
        PrintNMonths(2025, 3, 5);
    }

    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {
        if (startYear < 0 || startYear > 6999 || startMonth < 1 || startMonth > 11 || numberOfMonths < 1) {
            System.out.println("Invalid input.");
            return;
        }

        int currentYear = startYear;
        int currentMonth = startMonth;
        int dayCounter = getStartDayOfYear(currentYear, currentMonth); // Starting day of week (0 to 8)

        for (int i = 0; i < numberOfMonths; i++) {
            String monthName = MONTH_NAMES[(currentMonth - 1) % 11];
            System.out.println("\nCalendar for " + monthName + " " + currentYear);
            printMonth(dayCounter);
            System.out.println("\n----------------------------");

            // Move to next month
            dayCounter = (dayCounter + 33) % 9; // Next month starts after 33 days
            currentMonth++;
            if (currentMonth > 11) {
                currentMonth = 1;
                currentYear++;
            }
        }
    }

    // Print a single custom month (always 33 days, 9-day weeks)
    public static void printMonth(int startDay) {
        // Print weekday headers
        for (String day : WEEK_DAYS) {
            System.out.print(day + " ");
        }
        System.out.println();

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        int day = 1;
        for (int i = startDay; i < 9 && day <= 33; i++) {
            System.out.printf("%-4d", day++);
        }
        System.out.println();

        // Continue printing rest of the days
        while (day <= 33) {
            for (int i = 0; i < 9 && day <= 33; i++) {
                System.out.printf("%-4d", day++);
            }
            System.out.println();
        }
    }

    // Calculate the start day of the first month (mod 9)
    // For simplicity, assume Jan 1, year 0 starts on Monday (day 0)
    public static int getStartDayOfYear(int year, int month) {
        int totalMonths = year * 11 + (month - 1);
        int totalDays = totalMonths * 33;
        return totalDays % 9; // day index from 0 to 8
    }
}

