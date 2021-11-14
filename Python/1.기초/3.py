# 1. 순열, 조합
# 1-1 순수한 방법 , for문 2개를 사용해서 nC2를 구하는 방법 백준 9613번
'''N = int(input())

for i in range(0,N-1):
    for j in range(i+1,N):
        print(i,j)
'''

# 1-2 itertools을 사용한 조합
'''
combinations의 첫번째 인자에 배열을 넣고,
두 번째 인자에는 nCm 이라면 m에 해당하는 값을 넣습니다.
'''
from itertools import combinations #15650번 풀어야함
print(list(combinations([1,2,3,4] , 3)))

#15650
'''
- 1부터 N까지 자연수 중에서 중복없이 M개를 고른 수열
- 고른 수열은 오름차순이어야한다.
from intertools import combinations
N,M = map(int,input().split())
arr = [str(i+1) for i in range(N)] # 문제의 조건이 1부터 N까지 자연수 이기 때문

for e in list(combinations(arr,M)):
    print(" ".join(e))
'''

#1-3. 순열
'''
백준 15649번 문제
- 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
'''
from itertools import permutations

N,M = map(int, input().split())
arr = [str(i+1) for i in range(N)]

for e in list(permutations(arr,M)):
    print(" ".join(e))


#1-4 덤
# 중복 순열은 다음과 같이 사용합니다.
from itertools import product
# 중복 조합은 다음과 같이 사용합니다.
from itertools import combinations_with_replacement

#=========================================================================#

#2. 빈도 계산 - 중요함 백준2592번 풀어야함
from collections import Counter

arr = [int(input()) for _ in range(10)]
#튜플의 0번째 인덱스에는 arr의 숫자, 1번째 인덱스에는 arr에 등장 빈도수가 있습니다.
val = Counter(arr).most_common()
print(sum(arr) // 10)
print(val[0][0])

#3. 힙
#3-1 최소힙, 최대힙 백준 11279번

import heapq

heap = []
heapq.heappush(heap, 3)
heapq.heappush(heap, 1)
heapq.heappush(heap, 10)
heapq.heappush(heap, 5)
heapq.heappush(heap, 8)

print(heap)
'''
# 백준 1927, 백준 11286 절대값 힙
     1 <--- Root 
   /   \ 
  3     5 
 / \   / 
4   8 7

힙의 루트 제거 -> heappop() 

'''

#4. 덱
'''
덱은 데크 라고도 하며 double-ended queue의 약자입니다.
선입선출의 개념인 FIFO와 더불어 나중에 온 값을 먼저 처리하는 LIFO 연산도 가능합니다.
 즉 양방향에서 데이터를 처리할 수 있습니다. 
'''

from collections import deque
deq = deque #덱 초기화

# deq = [1,2,3,4] 가 저장됩니다.
deq = deque([i for i in range(1,5)])
#덱에 왼쪽에 값을 추가하려면 appenleft(value)를 하면됩니다.
deq.appendleft(10) #[10,1,2,3,4]
#덱의 오른쪽에 값을 추가하려면  append(value)를 하면됩니다.
deq.append(5)
#덱의 길이를 구하는 방법
len(deq)
#덱의 있는 값을 출력
print(deq)
#덱을 회전하는 방법이 있습니다.  백준 2164번 카드2 문제 백준 10866, 백준 10828 백준 1158번 추천
deq.rotate(-1) # 인자로 들어간 만큼 회전하며, 음수이면 좌측으로 회전합니다.

#5. 우선순위 큐는 기업 코테에 자주 나오지는 않습니다.
from queue import PriorityQueue
que = PriorityQueue()
que.put(4)
que.put(10)
que.put(2)

for i in range(len(que.queue)):
    print(que.queue[i], end=" ")

que.get()  # 우선순위 큐에 저장된 값은 get() 을 이용해서 제거합니다.





