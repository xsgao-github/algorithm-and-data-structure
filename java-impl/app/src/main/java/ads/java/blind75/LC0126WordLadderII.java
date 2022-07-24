package ads.java.blind75;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC0126WordLadderII {
    /**
     * Represents a node whtih a pointer to parent node.
     */
    private class Node {
        private String word;
        private Node parentNode;

        private Node(Node parentNode, String word) {
            this.parentNode = parentNode;
            this.word = word;
        }

        private List<String> getChain() {
            List<String> l = new ArrayList<>();
            Node node = this;
            do {
                l.add(0, node.word);
                node = node.parentNode;
            } while (node != null);
            return l;
        }
    }

    /**
     * get number of length of ladder
     * 
     * @param beginWord
     * @param endWord
     * @param wordList
     * @return
     */
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
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

        // solution leaf nodes
        List<Node> solutionNodes = new ArrayList<>();

        // sub nodes to be processed
        Deque<Node> queue = new LinkedList<>();
        queue.add(new Node(null, beginWord));
        wordSet.remove(beginWord);

        while (!queue.isEmpty()) {
            // number of current level nodes
            int size = queue.size();
            // all visited words at the level
            Set<String> visited = new HashSet<>();
            for (int q = 0; q < size; q++) {
                Node pNode = queue.pollFirst();
                String pWord = pNode.word;

                // create sub nodes
                for (int i = 0; i < pWord.length(); i++) {
                    String p = pWord.substring(0, i) + '*' + pWord.substring(i + 1);
                    for (String str : adj.get(p)) {
                        if (wordSet.contains(str)) {
                            // chain current word to parent
                            Node n = new Node(pNode, str);
                            if (str.equals(endWord)) {
                                // find a solution
                                solutionNodes.add(n);
                            } else {
                                queue.add(n);
                            }
                            visited.add(str);
                        }
                    }
                }
            }

            // found solutions at this level
            if (solutionNodes.size() > 0) {
                List<List<String>> solutions = new ArrayList<>();
                for (Node node : solutionNodes) {
                    solutions.add(node.getChain());
                }
                return solutions;
            } else {
                // remove visited words
                wordSet.removeAll(visited);
            }
        }

        return new ArrayList<>();
    }
}
