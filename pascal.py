def pascal(k):
    #result_array
    result=[]
    #indicates row
    for i in range(1,k+1):
        c=1
        #indicates column
        for j in range(1,i+1):
            #array for kth line
            if i==k:
                result.append(c)
            #getting element at i,j with i,j-1
            c=c*(i-j)//j
    return result

#Time-Complexity: O(n^2)
#Space-Complexity: O(k)