#Time complexity: O(n)
#Space complexity: O(n)
def func(nums,target):
    res=[]
    dict1={}
    i=0
    while i < len(nums):
        while i<len(nums) and nums[i] in dict1:
            i+=1
        if i==len(nums):
            break
        if nums[i]+target in dict1:
            res.append((nums[i],nums[i]+target))
        if nums[i]-target in dict1:
            res.append((nums[i],nums[i]-target))
        dict1[nums[i]]=1
        i+=1
    return res
nums=[5,1,1,1,3,3,2,4,7,5,5,9,9,7,7,7,7]
print(func(nums,2))