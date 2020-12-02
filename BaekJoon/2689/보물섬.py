# 보물섬 2689 골드4 백준

from collections import deque


arr = []

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def bfs(x, y):
    queue = deque()
    queue.append([x,y])
    visit[x][y] = 1
    num = 0
    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0<=nx<n and 0<=ny<m:
                if arr[nx][ny] =='L'and visit[nx][ny] == 0:
                    visit[nx][ny] = visit[x][y] +1
                    num = max(num, visit[nx][ny])
                    queue.append([nx,ny])
    return num





n, m = map(int, input().split())
visit = [[0] * m for i in range(n)]
for i in range(n):
    arr.append(list(input().strip()))
cnt = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] == 'L':
            cnt = max(cnt, bfs(i,j))



print(cnt)
