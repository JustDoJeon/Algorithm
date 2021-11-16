from collections import deque
n = int(input())

queue = deque()


for i in range(n):
    arr = list(input().split())
    if(arr[0] == 'push_back'):
        queue.appendleft(arr[1])
    elif arr[0] =='front':
        if len(queue) == 0:
            print(-1)
        else:
            print(queue.popleft())

#이런식으로 해결하믄댐 이해완료 자바로 적용완료
