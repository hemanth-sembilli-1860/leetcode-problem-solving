class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()){
            return false;
        }
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int n = s2.length();
        int k = s1.length();
        for (int i = 0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        for (int i = 0;i<s2.length()-s1.length();i++){
            if (matches(freq1,freq2)) return true;
            freq2[s2.charAt(i+s1.length())-'a']++;
            freq2[s2.charAt(i)-'a']--;
        }
        return matches(freq1,freq2);
    }
    public static boolean matches(int arr1[],int arr2[]){
        for (int i = 0;i<arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}