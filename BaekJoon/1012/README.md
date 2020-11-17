# 문제 주소
https://www.acmicpc.net/problem/2606

## 문제 접근 방법
dfs / bfs쓰면서 조건에 맞게 cnt값 올려주면 되겠다고 간단하게 생각했다가 망함.
블로그를 통해 접근 방법을 배웠다.
1) n*m 사이즈 배열 arr 만들고 0으로 채운다
2) 입력으로 

### 코드
```python
# 유기농 배추
import sys

sys.setrecursionlimit(10000)

dx = [-1,0,0,1]
dy = [0,1,-1,0]

T = int(input())

def dfs(x,y):
    visited[x][y] = True

    for i in range(4):
        nx = x + dx[i]
        ny = y +dy[i]

        if nx<0 or ny<0 or nx>=n or ny>=m:
            continue
        if arr[nx][ny] ==1 and visited[nx][ny] == False:
            dfs(nx,ny)

def solve():
    cnt = 0
    for i in range(n):
        for j in range(m):
            if arr[i][j] ==1 and visited[i][j] != 1:
                dfs(i,j)
                cnt+=1
    print(cnt)

for _ in range(T):
    m,n, k = map(int, input().split())

    # arr = [[0] for _ in range(m) for _ in range(n)]
    arr = [[0] * m for _ in range(n)]
    visited = [ [False]*m for _ in range(n)]
    # print(arr)
    # print(arr2)
    for _ in range(k):
        x, y = map(int, input().split())
        arr[y][x] = 1
    solve()
```

### 내가 시도 해본코드


### 배운것
파이썬으로 바꾼지 얼마되지않아서인지 2차원 행렬의 입력을 받는것이 어색했다.
행과 열의 움직임을 생각해서 입력은 x,y로 받았지만 실제 문제의 그림이 움직이듯이 arr[y][x]로 해야한다
(0,0)칸에서 -> (0,1)로의 움직임
|
(1,0)칸
이기 때문에 이부분을 생각해야한다.
dfs
