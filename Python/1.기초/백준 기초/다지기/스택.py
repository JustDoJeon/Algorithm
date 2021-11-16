from collections import deque
stack = deque()

n = int(input())

def empty(stack):
    if len(stack) == 0:
        print(-1)
    else:
        return 1


for i in range(n):
    arr = list(input().split())
    if arr[0] == 'push':
        stack.append(arr[1])
    elif arr[0] == 'pop':
        if len(stack) != 0:
            print(stack.pop())
        else:
            print(-1)
    elif arr[0] =='top':
        if len(stack) != 0:
            print(stack.popleft())
        else:
            print(-1)
    elif arr[0] =='size':
        print(len(stack))
    elif arr[0] =='empty':
        if len(stack) == 0:
            print(1)
        else:
            print(0)




