import java.util.Arrays;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = (arr.length * (arr.length - 1))/2;
        float[] fractions = new float[n];
        int[][] pairs = new int[n][2]; // 2D array to store pairs of numbers that form the fractions

        int index = 0;
        for (int i = 0; i < arr.length; i++) { // Nested loops to generate all possible fractions
            for (int j = i+1; j < arr.length; j++) {
                fractions[index] = (float) arr[i] /arr[j]; // Calculate the fraction and store it in the fractions array
                pairs[index][0] = arr[i]; // Store the pair of numbers forming the fraction in the pairs array
                pairs[index][1] = arr[j];
                index++;
            }
        }
        Arrays.sort(fractions); // Sort the fractions array in ascending order

        float kthSmallest = fractions[k-1];
        int[] result = new int[2];
        for (int i = 0; i < pairs.length; i++) { // Iterate through the pairs array to find the pair corresponding to the kth smallest fraction
            if((float)pairs[i][0]/pairs[i][1] == kthSmallest){ // If the fraction matches the kth smallest fraction, store the pair as the result
                result[0] = pairs[i][0];
                result[1] = pairs[i][1];
                break;
            }
        }
        return result;
    }
}