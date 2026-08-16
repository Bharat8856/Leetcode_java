import java.util.*;

class Solution {

    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        List<String> result = new ArrayList<>();

        for (String query : queries) {

            for (String word : dictionary) {

                int count = 0;

                for (int i = 0; i < query.length(); i++) {

                    if (query.charAt(i) != word.charAt(i)) {
                        count++;
                    }

                    // More than 2 edits → not possible
                    if (count > 2) {
                        break;
                    }
                }

                if (count <= 2) {
                    result.add(query);
                    break;
                }
            }
        }

        return result;
    }
}