# 문제 주소
https://www.acmicpc.net/problem/2606

## 문제 접근 방법
dfs / bfs쓰면서 조건에 맞게 cnt값 올려주면 되겠다고 간단하게 생각했다가 망함.
블로그를 통해 접근 방법을 배웠다.
1) n*m 사이즈 배열 arr 만들고 0으로 채운다
2) 입력으로 주어진 좌표 => 1 (x,y좌표랑 행렬좌표상 잘 구분해서 판단하고 넣는다 )
3) n*m 사이즈의 맵을 DFS를 통해 모든곳을 방문할때까지 완전탐색한다.
4) DFS로 다음 좌표를 이동할때 배추(1)만 이동한다.
5) T로 테스트케이스의 개수를 입력받으므로 초기화 필요하다.

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
부끄러워도 남겨놓겠습니다.
```python
# 유기농 배추
T = int(input())

n, m, k = map(int, input().split())

matrix = [[0] * (n + 1) for i in range(n + 1)]

visited = [[0] * (n + 1) for i in range(n + 1)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

print(matrix)

print(visited)

bug = 0

for i in range(k):
    x, y = map(int, input().split())
    matrix[x][y] = 1

def dfs(x, y):
    visited[x][y] = 1
    global  bug
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        if visited[nx][ny] == 0 and matrix[nx][ny] != 1:
            print("여기찍힘?")
            dfs(nx,ny)
            bug +=1
     return bug
 print(dfs(0,0))
```

### 배운것
파이썬으로 바꾼지 얼마되지않아서인지 2차원 행렬의 입력을 받는것이 어색했다.
행과 열의 움직임을 생각해서 입력은 x,y로 받았지만 실제 문제의 그림이 움직이듯이 arr[y][x]로 해야한다
(0,0)칸에서 -> (0,1)로의 움직임
|
(1,0)칸
이기 때문에 이부분을 생각해야한다.
dfs와 bfs의 동작과 틀은 어느정도 감 잡았지만 구현단계에서 여러 조건에 대처가 미흡한것같다. 
특히 배추 == 1 and visited == 0 부분만 
dfs를 돌리고 만약 다시 dfs가 실행된다면 0이다가 1부분을 만난거니깐 cnt를 늘려준다는 것을 잘 이해해야겠다
