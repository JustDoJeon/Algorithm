# [문제 주소](https://www.acmicpc.net/problem/4963)

## 문제 접근 방법

그래프 탐색문제, bfs or dfs 섬의 갯수를 세는거니깐 섬이라는 판단하에 탐색을 이어가고

탐색이 끝난다면 ( 다음 육지를 찾을때까지 다시 대기중 ) 섬의개수 +=1 로 하나 세주고 다시 탐색한다.


### 코드

```python
# 섬의개수 백준 4963

from collections import deque

# w, h = map(int, input().split())

# arr = [[0] * (w + 1) for i in range(h)]
# visit = [[False] * (w + 1) for i in range(h + 1)]
# for i in range(h):
#     arr[i] = list(map(int, input().split()))

dx = [1, -1, 0, 0, 1, -1, 1, -1]
dy = [0, 0, -1, 1, -1, -1, 1, 1]


def dfs(x, y):
    visit[x][y] = True

    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<= nx <h and 0<= ny<w:
            if graph[nx][ny] == 1 and visit[nx][ny]==False:
                dfs(nx,ny)


while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break

    visit = [[0] * w for _ in range(h)]
    graph = []

    for _ in range(h):
        graph.append(list(map(int, input().split())))

    cnt = 0
    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1 and visit[i][j] == False:
                dfs(i, j)
                cnt += 1
    print(cnt)
```

### 내가 시도 해본코드 

```python
# 지워버렸지만 bfs 로 시도했다가 틀렸습니다. bfs 풀이를 한번 해봤습니다.

''' BFS 탐색으로 풀어보기 '''

import sys

sys.setrecursionlimit(10000)



dx = [-1,-1,-1,0,0,1,1,1]
dy = [-1,0,1,-1,1,-1,0,1]


def bfs(x,y):
    visit[x][y] = 1
    queue  = deque()
    queue.append([x,y])

    while queue:
        a,b = queue.popleft()
        for i in range(8):
            nx = a + dx[i]
            ny = b + dy[i]

            if 0<= nx<h and 0<= ny<w:
                if graph[nx][ny] == 1 and visit[nx][ny] ==False:
                    graph[nx][ny] = 0
                    queue.append([nx,ny])
while True:
    w, h = map(int, input().split())

    if w == 0 and h == 0:
        break

    visit = [[0] * w for _ in range(h)]
    graph = []

    for _ in range(h):
        graph.append(list(map(int, input().split())))
    cnt = 0

    for i in range(h):
        for j in range(w):
            if graph[i][j]==1:
                cnt += 1
                bfs(i,j)

    print(cnt)

```

### 배운것

● 여러개의 테스트 케이스가 주어졌을땐 while True: 안에서 동작하며 break 조건을 걸어준다.

● bfs 에서 cnt의 초기화위치를 생각못하고 while 루프 밖에 설정하여 누적되었다.

● 머리로 그려가며 풀어가야겠다.