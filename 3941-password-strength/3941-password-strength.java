class Solution {
    public int passwordStrength(String password) {
        int str = 0;
        int n = password.length();
        HashSet<Character> set = new HashSet<>();
        for (char c:password.toCharArray()){
            set.add(c);
        }
        for (Character c:set){
            if (c>='a' && c<='z'){
                str++;
            }
            else if (c>='A' && c<='Z'){
                str = str + 2;
            }
            else if (c>='0' && c<='9'){
                str = str + 3;
            }
            else if (c == '!' || c == '@' || c == '#' || c == '$'){
                str = str+5;
            }
        }
        return str;
    }
}