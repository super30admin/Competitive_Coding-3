
------------------------------Using Dict -------------------------------------------
# Time Complexity : O(N)  N is the number of elements in array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I have used a dict to store all counts of the elements. Iterate through each element and check whether my num+k is in dict or not. 
#If yes I am incrementing the res. If my k is 0 its different case, then I need to check weather my value is greater than 1.

def findPairs(self, nums: List[int], k: int) -> int:
        if not nums or k<0:
            return 0
        res = 0
        d = Counter(nums)
        for key,v in d.items():
            if k != 0:
                if key+k in d:
                    res +=1
            else:
                if v>1:
                    res +=1
        return res
        
        
        
----------------------------- Two pointer approach--------------------------------------       
# Time Complexity : O(N log N) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I have used a set to store my resultant sets, I have used 2 pointers in thich I will check the diff between two indexes and compare with my k.
#If my k is equal to difference the i increment both i and j. If diff is less than k, I will increment j and greater than k, increment i.

def findPairs(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0
        if k<0:
            return 0
        
        i = 0
        j = 1
        res = set()
        nums.sort()
        while j<len(nums):
            temp = abs(nums[i]-nums[j])
            if temp == k:
                if i!=j:
                    res.add((nums[i], nums[j]))
                    i +=1
                j +=1
            elif temp<k:
                j +=1
            else:
                i +=1
        return len(res)