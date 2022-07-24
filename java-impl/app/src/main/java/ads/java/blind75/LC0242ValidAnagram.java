package ads.java.blind75;

import java.util.Arrays;

public class LC0242ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	if (s == null || t == null) {
    		return false;
    	}
    	if (s.length() == 0 && t.length() == 0) {
    		return true;
    	}
    	if (s.length() != t.length()) {
    		return false;
    	}
    	int[] sa = new int[26];
    	int[] ta = new int[26];
    	for (char c : s.toCharArray()) {
    		sa[c - 'a']++;
    	}
    	for (char c : t.toCharArray()) {
    		ta[c - 'a']++;
    	}
    	return Arrays.equals(sa, ta);
    }
}
