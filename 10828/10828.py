
import sys
input2 = int(sys.stdin.readline().split()[0])

stack = list()

for i in range(input2):
    sizeNum = 0

    inputOrder = sys.stdin.readline().split()

    if inputOrder[0] == 'push':
        stack.append(inputOrder[1])

    elif inputOrder[0] == 'pop':
        if len(stack) != 0:
            print(stack[-1])
            del stack[-1]
        else:
            print(-1)

    elif inputOrder[0] == 'size':
        print(len(stack))

    elif inputOrder[0] == 'empty':
        if not stack:
            print(1)
        else:
            print(0)

    elif inputOrder[0] == 'top':
        if len(stack) != 0:
            print(stack[-1])
        else:
            print(-1)
    else:
        print("Wrong Order")


