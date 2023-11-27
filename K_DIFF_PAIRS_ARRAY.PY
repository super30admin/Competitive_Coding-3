# TC: O(N)
# SC: O(N)


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        dic1={}
        lis1=[]
        for i in range(0,len(nums)):
            dic1[nums[i]]=i
        
        for i in range(0,len(nums)):
            if nums[i]-k in dic1:
                if i!=dic1[nums[i]-k]:
                    temp=[nums[i],nums[i]-k]
                    temp.sort()
                    if temp not in lis1:
                        lis1.append(temp)

            if nums[i]+k in dic1:
                if i!=dic1[nums[i]+k]:
                    temp=[nums[i],nums[i]+k]
                    temp.sort()
                    if temp not in lis1:
                        lis1.append(temp)
                
        print(dic1)
        print(lis1)
        return len(lis1)
        return 0


        