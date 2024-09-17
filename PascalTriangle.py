"""
Rasika Sasturkar
Time Complexity: O(n^2)
Space Complexity: O(1)
"""


def generate(numRows: int):
    """
    Dynamic programming used as the element at the current index is
    the sum of 2 elements in previous row at j-1 and j positions.
    """
    result = []

    for i in range(numRows):
        temp = []
        for j in range(i + 1):
            if j == 0 or j == i:
                temp.append(1)
            else:
                temp.append(result[i - 1][j - 1] + result[i - 1][j])
        result.append(temp)
    return result


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    print(generate(numRows=5))  # returns [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    print(generate(numRows=1))  # returns [[1]]


if __name__ == "__main__":
    main()
