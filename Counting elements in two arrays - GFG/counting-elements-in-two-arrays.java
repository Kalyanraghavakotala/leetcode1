//{ Driver Code Starts
import java.util.*;

class Count
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


// Complete the function given below
class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        
       // add your code here
       ArrayList<Integer> ar=new ArrayList<>();
       Arrays.sort(arr2);
       int res[]=new int[arr2[n-1]+1];
       for(int i=0;i<n;i++){
           res[arr2[i]]++;
       }
       for(int i=1;i<res.length;i++){
           res[i]=res[i]+res[i-1];
       }
       
       for(int i=0;i<m;i++){
        //   int c=0;
        if(arr1[i]>=res.length) ar.add(res[res.length-1]);
        else ar.add(res[arr1[i]]);
       }
       return ar;
       
       
    }
}