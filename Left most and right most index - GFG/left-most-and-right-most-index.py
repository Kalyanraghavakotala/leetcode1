#User function Template for python3

class Solution:
    def indexes(self, v, x):
        # Your code goes here
       
        if x in v:
            a=v.index(x)
            b=a+v.count(x)-1
            return [a,b]
        else:
            return [-1,-1]
    


#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        k = int(input())
        obj = Solution()
        ans = obj.indexes(a, k)
        if ans[0]==-1 and ans[1]==-1:
            print(-1)
        else:
            print(ans[0], end=' ')
            print(ans[1])

        T -= 1


if __name__ == "__main__":
    main()


# } Driver Code Ends