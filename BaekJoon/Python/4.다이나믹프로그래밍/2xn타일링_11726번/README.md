# 문제 주소
https://www.acmicpc.net/problem/11726

## 문제 접근 방법
다이나믹프로그래밍으로 작은부분에서 큰부분을 구하기위해 n=1부터 차근차근 예를 들어 생각했다.

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
def dfs(i,j,box):
    check[i][j] = 1
    box[i][j] = 1
    cnt = 0

    for i in range(4):
        nx = i + dx[i]
        ny = i + dy[i]
        if nx < 0  or nx >= n or ny <0 or ny >= m:
            if box[nx][ny] == -1:
                continue
        if box[nx][ny] == -1:
            cnt+=1
            dfs(nx,ny)
    print(cnt)

box = []

check = [[0] * n for i in range(m)]
print('check :', check)
for i in range(m):
    box.append(list(map(int, input().split())))

for i in range(n):
    for j in range(m):
        if box[i][j] == 1:
            dfs(i,j,box)
```

### 배운것
bfs 와 dfs의 구분을 못하는걸로봐서 아직 이해가 안되나보다 토마토 하나 찾아서 깊게 파고드는건줄 알았는데 "주변을 물듬" 과 "최단거리" 의 개념으로 bfs를 선택했다고들 한다.