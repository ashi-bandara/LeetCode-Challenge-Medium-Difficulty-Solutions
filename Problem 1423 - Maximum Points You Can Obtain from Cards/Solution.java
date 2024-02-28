class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int sum_initial_window = 0;
        for (int i = 0; i < k; i++) {
            sum_initial_window += cardPoints[i];
        }

        int maxScore = sum_initial_window;

        int left = k - 1;
        int right = n - 1;
        for (int i = 0; i < k; i++) {
            sum_initial_window -= cardPoints[left--];
            sum_initial_window += cardPoints[right--];
            maxScore = Math.max(maxScore, sum_initial_window);
        }

        return maxScore;
    }
}
