# Siimple 2 pointers approach to solve the problem, if current sum is greater than k then move j else move i and st j to last element of array else move i.
# Time Complexity: O(n)
# Space complexity: O(n)
def func(arr,k):
    if arr is None or len(arr)<=1:
        return 0
    i = 0
    j = len(arr)-1
    #arr = sorted(nums)
    count = 0
    while (j>i and i<len(arr)):
        if (arr[j]-arr[i]>k):
            j = j -1
        elif (abs(arr[j]-arr[i])==k):
            count = count + 1
            i = i + 1
            j = len(arr)-1
        else:
            i = i + 1
    return count
arr = [3,1,4,1,5]
cnt = func(arr,0)
print(cnt)