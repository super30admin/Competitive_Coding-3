def k_pairs(arr, k):
    s = set()
    result = 0
    for i in arr:
        if i in s:
            result += 1
            s.remove(i)
        
        s.add(i-k)
        s.add(i+k)
    return result

if __name__ == "__main__":
    print(k_pairs([1,3,1,5,4], 0))