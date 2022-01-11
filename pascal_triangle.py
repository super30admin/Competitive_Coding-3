# tc : O(n*n)  
# sc : O(n*n)
def generate_pascals_triange(n):
    res = []
    res.append([1])

    if n == 1:
        print( res)

    res.append([1,1])
    if n==2:
        print( res)

    for i in range(2,n):
        temp = [0]*(i + 1)
        for j in range(0, i+1):
            if j == 0: #
                temp[j] = res[i-1][j]
            elif j == i: #
                temp[j] = 1
            else:
                temp[j] = res[i-1][j] + res[i-1][j-1]
        res.append(temp)
    return res

if __name__=="__main__":
    n = 4
    print(generate_pascals_triange(n))
    