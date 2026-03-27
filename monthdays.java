import java.util.Scanner;

public class monthdays {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int month = -1;

        while (true) {
            System.out.print("Enter month (Eg: January, Jan., Jan, 1 ): ");
            String monthInput = scanner.nextLine().trim();
            month = getMonth(monthInput);

            System.out.print("Enter year (non-negative number, all digits): ");
            String yearInput = scanner.nextLine().trim();
            
            try {
                year = Integer.parseInt(yearInput);
                if (year < 0 || yearInput.length() < 1) {
                    System.out.println("Invalid year. Please enter again.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter again.");
                continue;
            }

            if (month == -1) {
                System.out.println("Invalid month. Please enter again.");
                continue;
            }

            break;
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days: " + days);
        scanner.close();
    }

    private static int getMonth(String input) {
        String[][] monthNames = {
            {"January", "Jan.", "Jan", "1"},
            {"February", "Feb.", "Feb", "2"},
            {"March", "Mar.", "Mar", "3"},
            {"April", "Apr.", "Apr", "4"},
            {"May", "May", "May", "5"},
            {"June", "Jun.", "Jun", "6"},
            {"July", "Jul.", "Jul", "7"},
            {"August", "Aug.", "Aug", "8"},
            {"September", "Sept.", "Sep", "9"},
            {"October", "Oct.", "Oct", "10"},
            {"November", "Nov.", "Nov", "11"},
            {"December", "Dec.", "Dec", "12"}
        };

        for (int i = 0; i < 12; i++) {
            for (String name : monthNames[i]) {
                if (input.equalsIgnoreCase(name)) return i + 1;
            }
        }
        return -1;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29; 
                } else {
                    return 28; 
                }
            default:
                return 31;
        }
    }

}
