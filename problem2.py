#k different pairs

# // Time Complexity : O(N)
# // Space Complexity : O(N) as we are creating a hashmap
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no


def findPairs( nums, k):
    hashmap={}
    count=0
    for i in nums:
        hashmap[i] = hashmap.get(i,0)+1             #store all the numbers in the hashmap with values as the number of times they appear
    for i in hashmap:
        if (k==0 and hashmap[i]>1):                    # if the difference is 0, then you know if a number appears multiple times, then it has a difference of 0
            count+=1
        elif (k>0 and (i-k) in hashmap):                # if the difference between the key and k exists in the hashmap, then you know the pair exists too
            count+=1
        else:
            continue
    return count


#testing
print(findPairs([3,1,4,1,5],2))