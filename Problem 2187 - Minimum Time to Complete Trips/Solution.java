import java.util.Arrays;

class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long left = 0;
        long right = (long) time[time.length - 1] * totalTrips;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long trips = 0;

            for (int t : time) {
                trips += mid / t;
            }

            if (trips < totalTrips) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
