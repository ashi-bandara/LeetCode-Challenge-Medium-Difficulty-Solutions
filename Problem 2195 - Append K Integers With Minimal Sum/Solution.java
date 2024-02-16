import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> integers = new HashSet<>();
        long sum = 0;

        for (int num: nums){
            if(!integers.contains(num) && num <= k){
                k++;
                sum += num;
            }
            integers.add(num);
        }

        long result = (long) (1+k)*k / 2 - sum;

        return result;
    }
}