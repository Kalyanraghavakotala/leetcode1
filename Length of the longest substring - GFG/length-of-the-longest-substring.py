#User function Template for python3

class Solution:
    def longestUniqueSubsttr(self, s):
        # code here
        if len(s) == 1: return 1
        count=0
        s_result=''
        for i in s:
            if i not in s_result:
                s_result += i
            else:
                s_result = s_result[s_result.index(i)+1:] + i
            if len(s_result) >= count:
                count = len(s_result)
        return count


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        s = input().strip()
        
        
        ob=Solution()
        print(ob.longestUniqueSubsttr(s))
# } Driver Code Ends