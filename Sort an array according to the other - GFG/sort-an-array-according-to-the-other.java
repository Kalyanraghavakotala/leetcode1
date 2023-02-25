//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++){
            if(hm.containsKey(A1[i])){
                hm.put(A1[i],hm.get(A1[i])+1);
            }
            else{
                hm.put(A1[i],1);
            }
        }
        int res[]=new int[N];
        int ind=0;
        // System.out.println(hm);
        for(int i=0;i<M;i++){
            if(hm.containsKey(A2[i])){
                for(int k=0;k<hm.get(A2[i]);k++){
                    res[ind++]=A2[i];
                }
                hm.remove(A2[i]);
            }
        }
        // System.out.println(hm);
        // System.out.println(hm.size());
        
        ArrayList<Integer> ar=new ArrayList<>();
        int o=0;
        for(Integer i:hm.keySet()){
            for(int k=0;k<hm.get(i);k++){
                ar.add(i);
            }
        }
        Collections.sort(ar);
        for(int i=0;i<ar.size();i++){
            res[ind++]=ar.get(i);
        }
        return res;
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends