package ads.java.leetcode;

public class LC0208ImplementTrie {
	private TrieNode root = new TrieNode();
	
	public LC0208ImplementTrie() {
    }

	public void insert(String word) {
		if (word == null || word.length() == 0) {
			throw new IllegalArgumentException("Parameter word is null or empty.");
		}
		
		TrieNode n = this.root;
		for (char c : word.toCharArray()) {
			if (n.children.containsKey(c) == false) {
				n.children.put(c, new TrieNode(c, false));
			}
			n = n.children.get(c);
		}
		n.end = true;
	}

	public boolean search(String word) {
		if (word == null || word.length() == 0) {
			throw new IllegalArgumentException("Parameter word is null or empty.");
		}

		TrieNode n = this.root;
		for (char c : word.toCharArray()) {
			n = n.children.get(c);
			if (n == null) {
				return false;
			}
		}

		return n.end;
	}

	public boolean startsWith(String prefix) {
		if (prefix == null || prefix.length() == 0) {
			throw new IllegalArgumentException("Parameter prefix is null or empty.");
		}

		TrieNode n = this.root;
		for (char c : prefix.toCharArray()) {
			n = n.children.get(c);
			if (n == null) {
				return false;
			}
		}

		return true;
	}
}
