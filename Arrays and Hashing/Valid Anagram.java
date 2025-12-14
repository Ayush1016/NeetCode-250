Problem Link: https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        int sSize=s.length();
        int tSize=t.length();
        int count[]=new int[26];
        for(int i=0;i<sSize;i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<tSize;i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
             return true;
    }
}
