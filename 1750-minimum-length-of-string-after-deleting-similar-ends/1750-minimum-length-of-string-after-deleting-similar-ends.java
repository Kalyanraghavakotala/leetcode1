class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int i=0,j=n-1;
        while(i<j && s.charAt(i) == s.charAt(j)){
            while(i<j && s.charAt(i) == s.charAt(i+1)) i++;
            while(j>i && s.charAt(j) == s.charAt(j-1)) j--;
            i++;
            j--;
            if(i>j) return 0;
            // System.out.println(i+" "+j);
        }
        if(i>j) return 0;
        return j-i+1;
    }
}