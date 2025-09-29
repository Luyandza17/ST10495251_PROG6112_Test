import java.util.Scanner;

// Class to store runs scored by a batsman at a stadium
class CricketRunsScored {
    private String batsman;
    private String stadium;
    private int runs;

    // Constructor
    public CricketRunsScored(String batsman, String stadium, int runs) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runs = runs;
    }

    // Method to print report
    public void printReport() {
        System.out.println("\n--- Cricket Runs Report ---");
        System.out.println("Batsman: " + batsman);
        System.out.println("Stadium: " + stadium);
        System.out.println("Total Runs: " + runs);
    }
}

// Main application class
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the batsman name: ");
        String batsmanName = sc.nextLine();

        System.out.print("Enter the stadium name: ");
        String stadiumName = sc.nextLine();

        System.out.print("Enter the total runs scored: ");
        int totalRuns = sc.nextInt();

        // Create object of CricketRunsScored
        CricketRunsScored report = new CricketRunsScored(batsmanName, stadiumName, totalRuns);

        // Print the report
        report.printReport();

        sc.close();
    }
}
