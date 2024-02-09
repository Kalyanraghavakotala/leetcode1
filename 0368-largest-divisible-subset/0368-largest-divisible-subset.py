class Solution:
    def largestDivisibleSubset(self, n: List[int]) -> List[int]:
        n.sort()
        if(len(n)<2):
            return n
        
        a=[[i] for i in n]
        for i in range(len(n)):
            for j in range(i):
                if(n[i]%n[j]==0 and len(a[i])<=len(a[j])):
                    a[i]=a[j]+[n[i]]
        
                 
        return (max(a, key=lambda x: len(x)))
        