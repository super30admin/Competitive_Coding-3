from typing import List

# Time Complexity : O(n*n), Where n is number of rows in pascal triangle
# Space Complexity : O(n*n), Where n is number of rows in pascal triangle

def pascaltriangle(n):
    #Since in pascal triangle depends on the previous calculated values
    ans=[[None for i in range(n)] for j in range(n)]
    print(ans)
    for i in range(n):
        for j in range(i+1):
            
            if(j==0 or j==i):
                #For First element and last element in the row must be 1
                ans[i][j]=1
            else:
                #For other elements it is just simple addition of elements of previous row
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j]
    print(ans)
if __name__ == "__main__":
    pascaltriangle(10)