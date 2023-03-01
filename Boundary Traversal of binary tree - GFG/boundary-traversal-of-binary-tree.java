//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            
            ArrayList <Integer> res = T.boundary(root);
            for (Integer num : res) System.out.print (num + " ");
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


class Solution
{
    static ArrayList<Integer> ar=new ArrayList<>();
    
    public static void leftb(Node node)
    {
        if(node==null || (node.left==null && node.right==null)) return;
        ar.add(node.data);
        if(node.left!=null) 
        {
            leftb(node.left);
        }
        else if(node.right!=null)
        {
            leftb(node.right);
        }
    }
    public static void rightb(Node node)
    {
        if(node==null || (node.left==null && node.right==null)) return;
        if(node.right!=null) 
        {
            rightb(node.right);
        }
        else if(node.left!=null)
        {
            rightb(node.left);
        }
        ar.add(node.data);
    }
    
    public static void leaves(Node node)
    {
        if(node==null) return;
        leaves(node.left);
        if(node.left==null && node.right==null) ar.add(node.data);
        leaves(node.right);
    }
    
    
    
	ArrayList <Integer> boundary(Node node)
	{
	    
	    ar.clear();
	    if(node==null) return ar;
	    ar.add(node.data);
	    leftb(node.left);
	    leaves(node.left);
	    leaves(node.right);
	    rightb(node.right);
	    return ar;
	}
}
