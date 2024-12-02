#count all distinct pairs with difference =k
# time complexity - O(N^2)
#space complexity -O(1)

#Brute force solution

def targetarray(nums,k):
    count=0
    for i in range(len(nums)):
        for j in range(len(nums)):
            if (nums[i]-nums[j] or (nums[j]-nums[i]))==k:
                count=count+1
                print(nums[i],nums[j])
    return count




# two-pointer approach
#time complexity -o(NlogN)
#space complexity-O(N)

def targetarray1(nums,k):
    nums=sorted(nums)
    count=0
    left=0
    right=1
    
    while right<len(nums):
        diff=nums[right]-nums[left]
        if diff==k:
            count=count+1
            right=right+1
        elif diff>k:
            left=left+1
        else:
            right=right+1
    return count


        
            