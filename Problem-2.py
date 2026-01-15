#K-diff Pairs in an Array
# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#maintain a frequency map, iterate through hashmap and if incase the diff is zero increase count by 1 at each element 
#check if key+k is present in map dna increase +1 as pair is found
# time - O(n)
# space - O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashMap = Counter(nums) # frequency map
        count=0
        for key, value in hashMap.items():
            if k==0:
                if value>1:
                    count =count+1
                continue
            if key+k in hashMap:
                count=count+1
        return count


        