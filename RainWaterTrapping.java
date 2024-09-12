import java.util.*;

// Main class
public class RainWaterTrapping {
    // Method to calculate the total amount of trapped rainwater
    public static void rainwaterstored(int heights[]) {
        int n = heights.length;

        // Array to store the left max heights
        int leftmax[] = new int[n];
        leftmax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            if (heights[i] > leftmax[i - 1]) {
                leftmax[i] = heights[i];  // Update with the current height if it's greater
            } else {
                leftmax[i] = leftmax[i - 1];  // Carry forward the previous max
            }
        }

        // Array to store the right max heights
        int rightmax[] = new int[n];
        rightmax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (heights[i] > rightmax[i + 1]) {
                rightmax[i] = heights[i];  // Update with the current height if it's greater
            } else {
                rightmax[i] = rightmax[i + 1];  // Carry forward the previous max
            }
        }

        // Calculate the total amount of trapped rainwater
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int waterHeight = Math.min(leftmax[i], rightmax[i]);
            sum += waterHeight - heights[i];
        }

        // Print the total trapped rainwater
        System.out.println(sum);
    }

    // Main function
    public static void main(String args[]) {
        int heights[] = {4, 2, 0};
        rainwaterstored(heights);
    }
}
