package ads.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordLadder_127 {
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

        // prepopulate map
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

    public static void main(String... arg) {
        WordLadder_127 wl = new WordLadder_127();
        System.out.println(
                wl.ladderLength("hit", "cog",
                        Arrays.asList("hot", "dot", "dog", "lot", "log",
                                "cog")));
        System.out.println(
                wl.ladderLength("hit", "cog",
                        Arrays.asList("hot", "dot", "dog", "lot", "log")));

        System.out.println(
                wl.ladderLength("qa", "sq",
                        Arrays.asList("si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm",
                                "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow",
                                "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr",
                                "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh",
                                "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm",
                                "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt",
                                "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye")));
    }

}
