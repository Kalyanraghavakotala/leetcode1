//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int find(int N){
        // code here
        // if(N==0){
        //     return 1;
        // }
        String s=Integer.toBinaryString(N);
        // System.out.println(s);
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') res+="0";
            else res+="1";
        }
        int ele=Integer.parseInt(res,2);
        return Math.abs(ele-N);
        
        
    }
}


//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.find(N));
        }
    }
}
// } Driver Code Ends