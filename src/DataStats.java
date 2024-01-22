public class DataStats {
    public static void main(String[] args) {

        // Variables
        int [] dataPoints = new int[100];
        int totalSum = 0;
        double totalAvg = 0;
        int max = 0;
        int min = 100;

        // Sets the random values in the array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)((Math.random() * 100) + 1);
        }

        // Prints out the random values with a spacer between them
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        // Finds the sum of all the random values
        for (int i = 0; i < dataPoints.length; i++) {
            totalSum += dataPoints[i];
        }

        // Finds which value is the greatest
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        // Finds which value is the smallest
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
        }

        // Calculates the average value
        totalAvg = totalSum/dataPoints.length;

        // Prints out data
        System.out.printf("\n%-4s %4d", "Sum:" , totalSum);
        System.out.printf("\n%-8s %4f", "Average:", totalAvg);
        System.out.printf("\n%-4s %3d", "Max:", max);
        System.out.printf("\n%-4s %3d", "Min:", min);
    }
}