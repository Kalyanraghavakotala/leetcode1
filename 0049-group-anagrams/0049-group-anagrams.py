class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = collections.defaultdict(list)
        for i in strs:
            k=''.join(sorted(i))
            d[k].append(i)
        # print(d)
        return list(d.values())