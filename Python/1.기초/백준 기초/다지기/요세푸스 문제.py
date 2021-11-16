from collections import deque

queue = deque()
n , m = map(int,input().split())

answer =[]
for i in range(n+1):
    queue.append(i)


while (len(queue) > 1):
    queue.rotate(-(m-1))
    answer.append(queue[0])
    del queue[0]

print("<",end='')
for i in answer[:-1]:
    print(i,end=',')
print(answer[-1],end='')
print('>')



