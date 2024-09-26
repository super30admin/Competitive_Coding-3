class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # Time Complexity is O(N)
        # Space Complexity is O(N)
        count = 0
        mem = {}
        for num in nums:
            if num in mem:
                mem[num]+=1
            else:
                mem[num]=1
        #print(mem)
        for num in mem:
            # If K is 0, look for duplicate elements in the array and increment counter
            if(k==0 and mem[num] > 1):
                count+=1
            # If K is not 0, avoid duplicates and check if difference(Sum) exists in the Memory
            elif(k !=0 and num+k in mem):
                count+=1
        return count