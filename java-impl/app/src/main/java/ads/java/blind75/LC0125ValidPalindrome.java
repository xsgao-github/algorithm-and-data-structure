package ads.java.blind75;

public class LC0125ValidPalindrome {
	public boolean isPalindrome(String str) {
		// remove non-alphanumeric characters & convert all upper cases to lower cases
		StringBuilder sb = new StringBuilder();
		for (char chr : str.toCharArray()) {
			if (chr >= '0' && chr <= '9') {
				sb.append(chr);
			} else if (chr >= 'a' && chr <= 'z') {
				sb.append(chr);
			} else if (chr >= 'A' && chr <= 'Z') {
				sb.append((char) (chr + ('a' - 'A')));
			} else {
				// remove
			}
		}

		// empty or only one char
		if (sb.length() <= 1) {
			return true;
		}

		// from left to the middle 
		int len = sb.length();
		for (int i = 0; i < len / 2; i++) {
			if (sb.charAt(i) != sb.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
