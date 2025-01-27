# tc O(n), sc O(n).
counts = Counter(nums)

count = 0

for num, frequency in counts.items():
    if k > 0 and num + k in counts:
        count += 1
    if k == 0 and frequency > 1:
        count += 1
    
return count