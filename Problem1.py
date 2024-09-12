# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# start from i=0 and j=1 to maintain a certian difference
def diff(arr,target):
    arr = sorted(arr)
    i,j = 0,1
    out = []
    cou = 0
    while i < len(arr) and j < len(arr):
        if arr[j] - arr[i] == target:
            if i!=j:
                out.append([i,j])
                cou += 1
            i += 1
            j += 1
            while i < len(arr) and arr[i] == arr[i-1]:
                i += 1
        elif arr[j] - arr[j] < target:
            j += 1
        else:
            i += 1
    print(cou)

diff([-1,-2,-3],1)