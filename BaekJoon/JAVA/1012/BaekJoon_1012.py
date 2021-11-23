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