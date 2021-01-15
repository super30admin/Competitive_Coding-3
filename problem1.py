def pascal_triangle(n):
    space = [0 for x in range(n)]
    buffer = [0 for x in range(n)]
    space[0] = 1
    print(space[:1])
    for i in range(1,n):
        buffer[0] = 1
        buffer[i] = 1
        for j in range(1, i):
            buffer[j] = space[j]+space[j-1]
        space = buffer
        buffer = [0 for x in range(n)]
        print(space[:i+1])
    print("\n")
    return space

if __name__ == "__main__":
    pascal_triangle(5)