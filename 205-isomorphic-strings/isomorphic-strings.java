class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] hash = new int[256];
        int[] hash2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            int b = t.charAt(i);
            if (hash[a] != hash2[b]) return false;
            hash[a] = i + 1;
            hash2[b] = i + 1;
        }
        return true;
    }
}