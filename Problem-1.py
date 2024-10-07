# Approach
# since every index isdepend on the previous row i, i-1
# recuurelation =  curr[i] =  prev[i]+prev[i-1]


#Complexities
# Time Complexity: O(N*N)
# Space Complexity: O(N)

def pascalTriangle(num):
    num  = num+1
    if num ==1:
        return[1]

    prev = [1]
    for i in range(2,num+1):
        curr = [1]
        for j in range(1,i-1):

            curr.append(prev[j-1]+prev[j])
        curr.append(1)
        prev = curr

    return prev


print(pascalTriangle(5))