package ads.java.lintcode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LintCode0659EncodeDecodeString {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        return String.join("\n\r", strs);
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        StringTokenizer tok = new StringTokenizer(str, "\n\r");
        while (tok.hasMoreTokens()) {
            strs.add(tok.nextToken());
        }
        return strs;
    }

}
