class Solution {
    public boolean isAnagram(String s, String t) {
                if (s.length() != t.length()){
            return false;
        }

        int [] charCount = new int[26];

        for(int x=0; x < s.length(); x++){
            charCount[s.charAt(x)-'a']++;
            charCount[t.charAt(x)-'a']--;

        }
        for(int count : charCount){
            if (count != 0){
                return  false;
            }
        }
        return true;
       
}
}