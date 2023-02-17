//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            Solution g = new Solution();
            ArrayList<Integer> result = new ArrayList<Integer>();
            result = g.removeDuplicate(arr,n);
            
            for(int i=0;i<result.size();i++)
                System.out.print(result.get(i) + " ");
            System.out.println();
        t--;
        }
    }
}



// } Driver Code Ends


class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        ArrayList<Integer> ar=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],1);
        }
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==1){
                ar.add(arr[i]);
                hm.put(arr[i],-1);
            }
        }
        return ar;
        
    }
}
