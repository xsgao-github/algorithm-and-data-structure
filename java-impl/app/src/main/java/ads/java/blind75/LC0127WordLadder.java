package ads.java.blind75;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC0127WordLadder {
    /**
     * get number of length of ladder
     * 
     * @param beginWord
     * @param endWord
     * @param wordSet
     * @return
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> wordSet = new HashSet<>(wordList);

        // populate map - all word that differ to each other by only one letter is grouped together
        Map<String, List<String>> adj = new HashMap<>();
        wordSet.add(beginWord);
        for (String str : wordSet) {
            for (int i = 0; i < str.length(); i++) {
                String p = str.substring(0, i) + '*' + str.substring(i + 1);
                List<String> l = adj.get(p);
                if (l == null) {
                    l = new ArrayList<>();
                    adj.put(p, l);
                }
                l.add(str);
            }
        }

        // sub nodes to be processed
        Deque<String> queue = new LinkedList<>();
        queue.add(beginWord);
        wordSet.remove(beginWord);
        int count = 1;

        while (!queue.isEmpty()) {
            // number of current level nodes
            int size = queue.size();
            for (int q = 0; q < size; q++) {
                String word = queue.pollFirst();

                // create sub nodes
                for (int i = 0; i < word.length(); i++) {
                    String p = word.substring(0, i) + '*' + word.substring(i + 1);
                    for (String str : adj.get(p)) {
                        if (wordSet.contains(str)) {
                            if (str.equals(endWord)) {
                                return ++count;
                            } else {
                                queue.add(str);
                                // to avoid revisiting
                                wordSet.remove(str);
                            }
                        }
                    }
                }
            }
            ++count;
        }

        return 0;
    }
}
