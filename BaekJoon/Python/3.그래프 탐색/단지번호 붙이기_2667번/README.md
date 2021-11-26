# 문제 주소
https://www.acmicpc.net/problem/2667

## 문제 접근 방법
dfs를 통해 모든 경우를 탐색하며 count를 하려했는데 count 변수의 활용 위치에 대한 판단이 잘 서지 않았다.

### 코드
```python
from collections import deque

n,m = map(int, input().split())

maze =[]

for i in range(n):
    maze.append(input())

visited = [[0] * m for i in range(n)]

dx = [-1,0,1,0]
dy = [0,1,0,-1]


queue = []
queue = deque()


queue.append((0,0))
visited[0][0] = 1

while queue:
    x,y = queue.popleft()
    if x == n-1 and y== m-1:
        print(visited[x][y])
        break

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx >= 0 and nx < n and ny >=0 and ny <m:
            if visited[nx][ny] == 0 and maze[nx][ny] == '1':
                visited[nx][ny] = visited[x][y] + 1
                queue.append((nx,ny))

```

### 내가 시도 해본코드 

```python
n,m = map(int, input().split())

maze =[]

for i in range(n):
    maze.append(map(int,input()))

visited = [[0] * (m+1)  for i in range(n+1)]

print(visited)

# count = 0

'''
1은 이동가능 0은 이동할수없음 1,1에서 출발
'''
dx = [-1,0,1,0]
dy = [0,1,0,-1]

def dfs(n,m,count):
    visited[n][m] = 1
    for i in range(4):
        nx = n + dx
        ny = m + dy
        if nx < 0 or nx > n or ny <0 or ny >m:
            continue
        elif visited[nx][ny] ==0 and maze[nx][ny] ==1:
            count+=1
            print(count)
            dfs(nx,ny,count)
    return count


dfs(n,m,0)
```

### 배운것
dfs와 bfs를 사용하는 판단과 visited[nx][ny] = visited[x][y] + 1 의 활용이 새로웠다
<br>