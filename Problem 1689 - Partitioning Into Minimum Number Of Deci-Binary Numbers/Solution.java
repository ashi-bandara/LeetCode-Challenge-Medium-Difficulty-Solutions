public class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (char digit : n.toCharArray()) {
            int num = Character.getNumericValue(digit);
            maxDigit = Math.max(maxDigit, num);
        }
        return maxDigit;
    }
}
