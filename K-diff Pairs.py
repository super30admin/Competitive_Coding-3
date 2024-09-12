#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dic = {}
        st = set()
        count = 0
        for i in range(len(nums)):
            if nums[i] -k in dic and (nums[i],nums[i]-k) not in st and (nums[i]-k,nums[i]) not in st:
                count += 1
                st.add((nums[i],nums[i]-k))
                
            if nums[i] + k in dic and (nums[i],nums[i]+k) not in st and (nums[i]+k,nums[i]) not in st:
                count += 1
                st.add((nums[i],nums[i]+k))
                
            dic[nums[i]] = 1
                
        return count