#TC: O(n) + O(n) = 2*O(n) = O(n) as 2 is a constant and does not matter: To create a HM and to search the HM
#SC: O(n): To create a HM


class Solution(object):
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        count = 0

        mydict = dict()
        
        for i in range(len(nums)):
            if nums[i] not in mydict:
                mydict[nums[i]] = 1
            else:
                mydict[nums[i]] +=1

        for key in mydict.keys():
            if (key-k) in mydict and k>0:
                count +=1
            elif k==0 and mydict[key] > 1:
                    count+=1

        return count
        

obj = Solution()
input = [1,3,1,5,4]
k = 0
output = obj.findPairs(input,k)
print(output)