# 문제 주소
https://www.acmicpc.net/problem/1012

## 문제 접근 방법
1) 입력값을 충실히 받아보자 <br>
2) bfs 를 구현하고 카운팅의 위치를 잘 고려하자
3) 출력 로직을 잘 구현하자

### 코드
```python
from collections import deque

dx = [0,0,1,-1]
dy = [1,-1,0,0]

t = int(input())

def bfs(graph, a, b):
    queue = deque()
    queue.append((a,b))
    graph[a][b] = 0

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if nx < 0 or nx >=n or ny < 0 or ny >= m:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append((nx, ny))
    return

for i in range(t):
    cnt = 0
    n, m, k = map(int,input().split())
    graph = [[0]*m for _ in range(n)]

    for j in range(k):
        x, y = map(int, input().split())
        graph[x][y] = 1

    for a in range(n):
        for b in range(m):
            if graph[a][b] == 1:
                bfs(graph, a, b)
                cnt += 1
    print(cnt)
```

### 내가 시도 해본코드 

```python
#백준 1260번
# DFS와 BFS 문제 - 실2

n, m, v = map(int, input().split())

matrix = [[0] * (n + 1) for i in range(n + 1)]

for _ in range(m):
    x, y = map(int, input().split())
    matrix[x][y] = 1
    matrix[y][x] = 1

visit_list = [0] * (n + 1)


def dfs(v):
    visit_list[v] = 1
    print(v, end=' ')
    for i in range(1, n + 1):
        if (visit_list[i] == 0 and matrix[v][i] == 1):
            dfs(i)


def bfs(v):
    queue = [v]
    visit_list[v] = 0
    while queue:
        v = queue.pop(0)
        print(v, end=' ')
        for i in range(1, n + 1):
            if(visit_list[i] == 1 and matrix[v][i]) == 1:
                queue.append(i)
                visit_list[i] = 0


dfs(v)
print()
bfs(v)
```

### 배운것
bfs 구현이 어느정도 되었지만 입력값 받기와 출력 그리고 카운팅하는 로직에서의 부족함이 나타났다.