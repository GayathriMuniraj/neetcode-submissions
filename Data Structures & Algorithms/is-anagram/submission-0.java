class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss=s.toLowerCase().toCharArray();
        char[] tt=t.toLowerCase().toCharArray();
        
        if(ss.length!=tt.length){
            return false;
        }
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);

    }
}
