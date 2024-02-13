class Solution {
    
    public boolean ispal(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            // System.out.println(s.charAt(i++)+" "+s.charAt(j--));
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(ispal(s)) return s;
        }
        return "";
    }
}