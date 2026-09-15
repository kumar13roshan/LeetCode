class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();

        if(len1 !=len2) return false;

        int[] arr=new int[26];
        for(int i=0;i<len1;i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<len1;i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int j:arr){
            if(j<0) return false;
        }
        return true;
    }
}