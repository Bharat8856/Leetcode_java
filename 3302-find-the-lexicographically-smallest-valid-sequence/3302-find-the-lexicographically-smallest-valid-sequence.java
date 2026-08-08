import java.util.*;

class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        // suf[i] = position in word1 where word2[i] can be matched
        // while matching word2[i...m-1] from right to left
        int[] suf = new int[m];
        Arrays.fill(suf, -1);

        int j = n - 1;

        for (int i = m - 1; i >= 0; i--) {

            while (j >= 0 && word1.charAt(j) != word2.charAt(i)) {
                j--;
            }

            if (j < 0) {
                break;
            }

            suf[i] = j;
            j--;
        }

        List<Integer> ans = new ArrayList<>();

        int p = 0;
        boolean used = false;

        for (int i = 0; i < m; i++) {

            while (p < n) {

                // Normal matching
                if (word1.charAt(p) == word2.charAt(i)) {

                    ans.add(p);
                    p++;
                    break;
                }

                // Use the one allowed modification
                if (!used &&
                    (i == m - 1 ||
                     (suf[i + 1] != -1 && suf[i + 1] > p))) {

                    used = true;
                    ans.add(p);
                    p++;
                    break;
                }

                p++;
            }

            // Could not find a valid position
            if (ans.size() != i + 1) {
                return new int[0];
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}