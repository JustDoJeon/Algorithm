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