class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        int m = t.length();
        int l = 0, r = 0;
        int cnt = 0;
        int minlen = Integer.MAX_VALUE;
        int sInd = -1;
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }
        while (r < s.length()) {
            if (hash[s.charAt(r)] > 0) {
                cnt++;
            }
            hash[s.charAt(r)]--;
            while (cnt == m) {
                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    sInd = l;
                }
                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }
        if (sInd == -1) {
            return "";
        }
        return s.substring(sInd, sInd + minlen);
    }
}