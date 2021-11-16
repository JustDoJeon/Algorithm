'''
2164 카드2
덱 문제

'''

from collections import deque

deq = deque
n = int(input())
deq = deque(i for i in range(1, n+1))


while(len(deq) > 1):
    deq.popleft()
    deq.append(deq.popleft())


print(deq.pop())

