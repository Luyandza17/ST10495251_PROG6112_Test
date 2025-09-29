public class Question1 {

    public static void main(String[] args) {
        // Batsmen
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};

        // Stadiums
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        // Runs scored [stadium][batsman]
        int[][] runs = {
            {5000, 3800, 4200},  // Kingsmead
            {3500, 3700, 3900},  // St Georges
            {6200, 5000, 5200}   // Wanderers
        };

        // ---- Display Table Header ----
        System.out.printf("%-12s%-18s%-15s%-18s%-15s\n", 
                "Stadium", batsmen[0], batsmen[1], batsmen[2], "Total Runs");

        // ---- Calculate totals ----
        int[] batsmanTotals = new int[batsmen.length];
        int[] stadiumTotals = new int[stadiums.length];

        for (int i = 0; i < stadiums.length; i++) {
            int rowTotal = 0;
            System.out.printf("%-12s", stadiums[i]);

            for (int j = 0; j < batsmen.length; j++) {
                System.out.printf("%-18d", runs[i][j]);
                rowTotal += runs[i][j];
                batsmanTotals[j] += runs[i][j];
            }

            stadiumTotals[i] = rowTotal;
            System.out.printf("%-15d\n", rowTotal);
        }

        // ---- Display total runs by each batsman ----
        System.out.println("\nTotal runs by each batsman:");
        for (int j = 0; j < batsmen.length; j++) {
            System.out.println(batsmen[j] + ": " + batsmanTotals[j]);
        }

        // ---- Display total runs by each stadium ----
        System.out.println("\nTotal runs at each stadium:");
        for (int i = 0; i < stadiums.length; i++) {
            System.out.println(stadiums[i] + ": " + stadiumTotals[i]);
        }

        // ---- Highest runs per stadium ----
        System.out.println("\nHighest runs scored per stadium:");
        for (int i = 0; i < stadiums.length; i++) {
            int maxRuns = runs[i][0];
            String topBatsman = batsmen[0];

            for (int j = 1; j < batsmen.length; j++) {
                if (runs[i][j] > maxRuns) {
                    maxRuns = runs[i][j];
                    topBatsman = batsmen[j];
                }
            }
            System.out.println(stadiums[i] + ": " + topBatsman + " (" + maxRuns + ")");
        }

        // ---- Stadium with most total runs ----
        int maxStadiumRuns = stadiumTotals[0];
        String topStadium = stadiums[0];

        for (int i = 1; i < stadiums.length; i++) {
            if (stadiumTotals[i] > maxStadiumRuns) {
                maxStadiumRuns = stadiumTotals[i];
                topStadium = stadiums[i];
            }
        }
        System.out.println("\nStadium with the most total runs: " + topStadium +
                           " (" + maxStadiumRuns + ")");
    }
}
