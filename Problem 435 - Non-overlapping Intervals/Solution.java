import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int previous = 0;

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= intervals[previous][1]){
                previous = i;
                count++;
            }
        }

        return intervals.length - count;
    }
}