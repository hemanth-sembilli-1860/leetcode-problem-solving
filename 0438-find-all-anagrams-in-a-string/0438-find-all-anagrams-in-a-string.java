class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < m; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            windowFreq[s.charAt(i) - 'a']++;

            if (i >= m) {
                windowFreq[s.charAt(i - m) - 'a']--;
            }

            if (Arrays.equals(pFreq, windowFreq)) {
                list.add(i - m + 1);
            }
        }

        return list;
    }
}