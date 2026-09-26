class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character>hs=new HashSet<>();
       int left=0,right=0,max=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
           
            max=Math.max(max,right-left+1);
             right++;
        }
        return max;
       

    }
    
}
