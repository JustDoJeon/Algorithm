# 문제 주소
https://www.acmicpc.net/problem/1697

## 문제 접근 방법
틀림.

### 코드
```python


# 5, 17            x+1 or x-1 or 2*x 를 1초에 움직임

'''
시작점 5 도착점 17
0초에 갈수있는 수는 1
1초: 4 6 10 (  5-1, 5+1 5*2)
2초 : 3 5 7  8 9 11 12 20
3초: 16 18 ....
4초 : 17
'''

# not list -> list가 비어있는지 확인 이게 트루면 비어있는거임!

import sys

from collections import deque
input = sys.stdin.readline

def bfs():
    q = deque()
    q.append(n)
    while q:
        x = q.popleft()
        if x == k:
            print(dist[x])
            break

        for j in (x-1,x+1,x*2):
            if 0<=j<=MAX and not dist[j]:
                dist[j] = dist[x] +1
                q.append(j)


MAX = 100000 #문제에서의 제한사항이 0~100000이라서
n,k = map(int,input.split())
dist = [0] * (MAX+1)

bfs()
'''
x = 5, j = 4, 6, 10

4, 6, 10은 0과 MAX 사이의 값 dist [4, 6, 10] = dist [5] + 1 = 0 + 1 = 1

 

x = 10으로 바로 넘어가면 j = 9, 11, 20

9, 11, 20은 0과 MAX 사이의 값 dist [9, 11, 20] = dist [10] + 1 = 1 + 1 = 2

 

dist [10]= 1인 이유는 위 x=5일 때 1이 추가되었다.

 

x = 9, j = 8, 10, 18

8, 10, 18은 0과 MAX 사이의 값 dist [8, 10, 18] = dist [9] + 1 = 2 + 1 = 3

 

x = 18, j = 17, 19, 36

17, 19, 36은 0과 MAX 사이의 값 dist [17, 19, 36] = dist [18] + 1 = 3 + 1 = 4

 

위 def bfs 5번 문항인 만약 그 x의 값이 동생이 있는 위치 k일시 dist [x]를 출력하고 프로그램 종료를 만족

따라서 4 


출처 : https://tooo1.tistory.com/111
'''
```

### 내가 시도 해본코드 

```python

```

### 배운것
범위에 대한 정보를 기준으로 정하여 for문등 반복문에 사용할수 있구나 <br>

dist[j] = dist[x]+ 1 코드에 익숙해져야겠다. dist[5]는 0이었으니깐.... 