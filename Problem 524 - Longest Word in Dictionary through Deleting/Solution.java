import java.util.ArrayList;
import java.util.List;

class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        List<String> result = new ArrayList<>();

        for (String word : dictionary) {
            if (isSubsequence(word, s)) {
                result.add(word);
            }
        }

        String longestWord = "";
        for (String word : result) {
            if (word.length() > longestWord.length() ||
                    (word.length() == longestWord.length() && word.compareTo(longestWord) < 0)) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    private boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;
        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == word.length();
    }
}
