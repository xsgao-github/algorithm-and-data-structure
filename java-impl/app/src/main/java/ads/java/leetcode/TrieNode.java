package ads.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	public char value;
	public Map<Character, TrieNode> children = new HashMap<>();
	public boolean end;

	public TrieNode() {
	}

	public TrieNode(char value, boolean end) {
		this.value = value;
		this.end = end;
	}
}
