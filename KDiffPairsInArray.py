# // Time Complexity : approach 1 o(nlogn) approach 2
# // Space Complexity : approach 1 o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : faced issued with edge case where l==r in approach 1


# // Your code here along with comments explaining your approach
# for approach 1 - sort the array and apply two pointer technique to figure out the count (if nums[r]-num[l]> k <k or == k ) move left pointer whern diff >k otherwise move right 
# For approach 2 - maintain hashmap for number and their count iterate over the hashmap and search for number +k and increment the count (handle case when k ==0)


from typing import List
# class Solution:
#     def findPairs(self, nums: List[int], k: int) -> int:
#         nums = sorted(nums)
#         l,r,n,count = 0,1,len(nums),0
#         while l<n and r<n:
#             if l == r or nums[r] - nums[l] < k:
#                 r+=1
#             elif nums[r]-nums[l] > k:
#                 l+=1
#             else:
#                 count+=1
#                 l+=1
#                 while l<n and nums[l] == nums[l-1]:
#                     l+=1
#         return count

#  Approach 2
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        hashMap = {}
        for n in nums:
            hashMap[n] = hashMap.get(n,0)+1
        count=0
        for n in hashMap:
            if k == 0 and n+k in hashMap and hashMap[n]>1:
                count+=1
            elif n+k in hashMap and k!=0:
                count+=1
        return count

# class Solution:
#     def findPairs(self, nums: List[int], k: int) -> int:
#         hashMap = defaultdict(int)
#         for n in nums:
#             hashMap[n]+=1 
#         count=0
#         for n in hashMap:
#             if k == 0 and n+k in hashMap and hashMap[n]>1:
#                 count+=1
#             elif n+k in hashMap and k!=0:
#                 count+=1
#         return count
        
# class Solution:
#     def findPairs(self, nums: List[int], k: int) -> int:
#         hashMap = Counter(nums)
#         count=0
#         for n in hashMap:
#             if k == 0 and n+k in hashMap and hashMap[n]>1:
#                 count+=1
#             elif n+k in hashMap and k!=0:
#                 count+=1
#         return count

# class Solution:
#     def findPairs(self, nums: List[int], k: int) -> int:
#         hashSet = set(nums)
#         hashMap = {}
#         count = 0
#         for n in nums:
#             hashMap[n]=hashMap.get(n,0)+1
#         for n in hashSet:
#             if k == 0 and hashMap.get(n) >1 and n+k == n:
#                 count+=1
#             if n+k in hashSet and k!=0:
#                 count+=1
#         return count
            
            
        
        
        