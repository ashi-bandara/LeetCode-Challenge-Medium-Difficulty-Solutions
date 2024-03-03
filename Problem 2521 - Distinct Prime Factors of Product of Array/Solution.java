import java.util.*;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primeFactors = new HashSet<>();

        for (int num : nums) {
            for (int i = 2; i * i <= num; i++) {
                while (num % i == 0) {
                    primeFactors.add(i);
                    num = num / i;
                }
            }
            if (num > 1) {
                primeFactors.add(num);
            }
        }

        return primeFactors.size();
    }
}
