//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }

    public static Node inputList(BufferedReader br) throws IOException
    {
        int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node(Integer.parseInt(s[0])), tail = head;
        for(int i = 1; i < s.length; i++)
            tail = tail.next = new Node(Integer.parseInt(s[i]));

        return head;
    }

    public static void printList(Node node)
    {
        while (node != null)
        {
    		System.out.print(node.data + " ");
    		node = node.next;
    	}
    	System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node head = Node.inputList(br);
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            Node res = obj.reverse(head, k);
            
            Node.printList(res);
            
        }
    }
}

// } Driver Code Ends


/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node rev(Node head){
        // if(head==null) return null;
        Node prev=null;
        Node t=head;
        while(t!=null)
        {
            t=t.next;
            head.next=prev;
            prev=head;
            head=t;
        }
        return prev;
    }
    public static Node reverse(Node head, int k) {
        // code here
        Node slow=new Node(0);
        Node fast=slow;
        Node t=head;
        while(k>0){
            fast.next=new Node(head.data);
            fast=fast.next;
            head=head.next;
            k--;
        }
        fast.next=null;
        Node res1=rev(slow.next);
        Node res2=rev(head);
        
        Node res=new Node(0);
        t=res;
        while(res1!=null){
            // System.out.print(res1.data);
            t.next=new Node(res1.data);
            t=t.next;
            res1=res1.next;
            // System.out.print(t.data+" ");
        }
        while(res2!=null){
            // System.out.print(res2.data);
            t.next=new Node(res2.data);
            t=t.next;
            res2=res2.next;
            // System.out.print(t.data+" ");
        }
        // System.out.println();
        return res.next;
        
    }
}
        
