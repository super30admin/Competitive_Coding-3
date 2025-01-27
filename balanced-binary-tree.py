# tc O(n), sc O(n).
def check_balance(node):
    if not node:
        return True, 0

    balanced = False
    isLeftBalanced, leftHeight = check_balance(node.left)
    isRightBalanced, rightHeight = check_balance(node.right)

    if isLeftBalanced and isRightBalanced:
        balanced = abs(leftHeight - rightHeight) <= 1

    return balanced, max(leftHeight, rightHeight) + 1

return check_balance(root)[0]
