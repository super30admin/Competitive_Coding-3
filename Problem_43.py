def printPascal(n):
 
    for line in range(1, n + 1):
        C = 1; # used to represent C(line, i)
        for i in range(1, line + 1):             
           
            print(C, end = " ");
            C = int(C * (line - i) / i);
        print("");
 
n = 5;
printPascal(n);

%TC : O(n^2)
%SC : O(1)