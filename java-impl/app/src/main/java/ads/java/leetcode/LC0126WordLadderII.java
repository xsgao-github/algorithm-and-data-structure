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

    public static void main(String... arg) {
        LC0126WordLadderII wl = new LC0126WordLadderII();
        // System.out.println(
        // wl.findLadders("hit", "cog",
        // Arrays.asList("hot", "dot", "dog", "lot", "log",
        // "cog")));
        // System.out.println(
        // wl.findLadders("hit", "cog",
        // Arrays.asList("hot", "dot", "dog", "lot", "log")));

        System.out.println(
                wl.findLadders("red", "tax",
                        Arrays.asList("ted", "tex", "red", "tax", "tad", "den", "rex", "pee")));
        System.out.println(
                wl.findLadders("cet", "ism",
                        Arrays.asList("kid", "tag", "pup", "ail", "tun", "woo", "erg", "luz", "brr", "gay", "sip",
                                "kay", "per", "val", "mes", "ohs", "now", "boa", "cet", "pal", "bar", "die", "war",
                                "hay", "eco", "pub", "lob", "rue", "fry", "lit", "rex", "jan", "cot", "bid", "ali",
                                "pay", "col", "gum", "ger", "row", "won", "dan", "rum", "fad", "tut", "sag", "yip",
                                "sui", "ark", "has", "zip", "fez", "own", "ump", "dis", "ads", "max", "jaw", "out",
                                "btu", "ana", "gap", "cry", "led", "abe", "box", "ore", "pig", "fie", "toy", "fat",
                                "cal", "lie", "noh", "sew", "ono", "tam", "flu", "mgm", "ply", "awe", "pry", "tit",
                                "tie", "yet", "too", "tax", "jim", "san", "pan", "map", "ski", "ova", "wed", "non",
                                "wac", "nut", "why", "bye", "lye", "oct", "old", "fin", "feb", "chi", "sap", "owl",
                                "log", "tod", "dot", "bow", "fob", "for", "joe", "ivy", "fan", "age", "fax", "hip",
                                "jib", "mel", "hus", "sob", "ifs", "tab", "ara", "dab", "jag", "jar", "arm", "lot",
                                "tom", "sax", "tex", "yum", "pei", "wen", "wry", "ire", "irk", "far", "mew", "wit",
                                "doe", "gas", "rte", "ian", "pot", "ask", "wag", "hag", "amy", "nag", "ron", "soy",
                                "gin", "don", "tug", "fay", "vic", "boo", "nam", "ave", "buy", "sop", "but", "orb",
                                "fen", "paw", "his", "sub", "bob", "yea", "oft", "inn", "rod", "yam", "pew", "web",
                                "hod", "hun", "gyp", "wei", "wis", "rob", "gad", "pie", "mon", "dog", "bib", "rub",
                                "ere", "dig", "era", "cat", "fox", "bee", "mod", "day", "apr", "vie", "nev", "jam",
                                "pam", "new", "aye", "ani", "and", "ibm", "yap", "can", "pyx", "tar", "kin", "fog",
                                "hum", "pip", "cup", "dye", "lyx", "jog", "nun", "par", "wan", "fey", "bus", "oak",
                                "bad", "ats", "set", "qom", "vat", "eat", "pus", "rev", "axe", "ion", "six", "ila",
                                "lao", "mom", "mas", "pro", "few", "opt", "poe", "art", "ash", "oar", "cap", "lop",
                                "may", "shy", "rid", "bat", "sum", "rim", "fee", "bmw", "sky", "maj", "hue", "thy",
                                "ava", "rap", "den", "fla", "auk", "cox", "ibo", "hey", "saw", "vim", "sec", "ltd",
                                "you", "its", "tat", "dew", "eva", "tog", "ram", "let", "see", "zit", "maw", "nix",
                                "ate", "gig", "rep", "owe", "ind", "hog", "eve", "sam", "zoo", "any", "dow", "cod",
                                "bed", "vet", "ham", "sis", "hex", "via", "fir", "nod", "mao", "aug", "mum", "hoe",
                                "bah", "hal", "keg", "hew", "zed", "tow", "gog", "ass", "dem", "who", "bet", "gos",
                                "son", "ear", "spy", "kit", "boy", "due", "sen", "oaf", "mix", "hep", "fur", "ada",
                                "bin", "nil", "mia", "ewe", "hit", "fix", "sad", "rib", "eye", "hop", "haw", "wax",
                                "mid", "tad", "ken", "wad", "rye", "pap", "bog", "gut", "ito", "woe", "our", "ado",
                                "sin", "mad", "ray", "hon", "roy", "dip", "hen", "iva", "lug", "asp", "hui", "yak",
                                "bay", "poi", "yep", "bun", "try", "lad", "elm", "nat", "wyo", "gym", "dug", "toe",
                                "dee", "wig", "sly", "rip", "geo", "cog", "pas", "zen", "odd", "nan", "lay", "pod",
                                "fit", "hem", "joy", "bum", "rio", "yon", "dec", "leg", "put", "sue", "dim", "pet",
                                "yaw", "nub", "bit", "bur", "sid", "sun", "oil", "red", "doc", "moe", "caw", "eel",
                                "dix", "cub", "end", "gem", "off", "yew", "hug", "pop", "tub", "sgt", "lid", "pun",
                                "ton", "sol", "din", "yup", "jab", "pea", "bug", "gag", "mil", "jig", "hub", "low",
                                "did", "tin", "get", "gte", "sox", "lei", "mig", "fig", "lon", "use", "ban", "flo",
                                "nov", "jut", "bag", "mir", "sty", "lap", "two", "ins", "con", "ant", "net", "tux",
                                "ode", "stu", "mug", "cad", "nap", "gun", "fop", "tot", "sow", "sal", "sic", "ted",
                                "wot", "del", "imp", "cob", "way", "ann", "tan", "mci", "job", "wet", "ism", "err",
                                "him", "all", "pad", "hah", "hie", "aim", "ike", "jed", "ego", "mac", "baa", "min",
                                "com", "ill", "was", "cab", "ago", "ina", "big", "ilk", "gal", "tap", "duh", "ola",
                                "ran", "lab", "top", "gob", "hot", "ora", "tia", "kip", "han", "met", "hut", "she",
                                "sac", "fed", "goo", "tee", "ell", "not", "act", "gil", "rut", "ala", "ape", "rig",
                                "cid", "god", "duo", "lin", "aid", "gel", "awl", "lag", "elf", "liz", "ref", "aha",
                                "fib", "oho", "tho", "her", "nor", "ace", "adz", "fun", "ned", "coo", "win", "tao",
                                "coy", "van", "man", "pit", "guy", "foe", "hid", "mai", "sup", "jay", "hob", "mow",
                                "jot", "are", "pol", "arc", "lax", "aft", "alb", "len", "air", "pug", "pox", "vow",
                                "got", "meg", "zoe", "amp", "ale", "bud", "gee", "pin", "dun", "pat", "ten", "mob")));
    }

}
