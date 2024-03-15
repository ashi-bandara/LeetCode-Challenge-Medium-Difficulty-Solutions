class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex = 0;
        int negativeIndex = 1;

        int[] newArray = new int[nums.length];

        for (int num : nums) {
            if (num > 0) {
                newArray[positiveIndex] = num;
                positiveIndex += 2;
            } else {
                newArray[negativeIndex] = num;
                negativeIndex += 2;
            }
        }

        return newArray;
    }
}