package ads.java.leetcode;

public class LC0191NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
        	ret += n & 0x01;
        	n = n >>> 1;
        }
        return ret;
    }
}
