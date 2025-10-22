import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class Gideon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("👋 Hello, I’m Gideon — your personal assistant.");
        System.out.println("Type 'help' to see what I can do.\n");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "help":
                    System.out.println("Gideon: I can tell you the time, date, or exit this chat.");
                    break;

                case "time":
                    LocalTime time = LocalTime.now();
                    System.out.println("Gideon: The current time is " + time.getHour() + ":" + String.format("%02d", time.getMinute()) + ".");
                    break;

                case "date":
                    LocalDate date = LocalDate.now();
                    System.out.println("Gideon: Today’s date is " + date + ".");
                    break;

                case "exit":
                    System.out.println("Gideon: Goodbye! Have a great day 👋");
                    scanner.close();
                    return;

                default:
                    System.out.println("Gideon: Sorry, I didn’t understand that. Type 'help' to see my commands.");
                    break;
            }
        }
    }
}
