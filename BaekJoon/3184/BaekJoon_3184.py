# BOJ 3184 양 실2

from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def bfs(x, y):
    queue = [(x, y)]
    o = 0
    v = 0

    while queue:
        x, y = queue.pop()
        if arr[x][y] == 'v':
            v += 1
        if arr[x][y] == 'o':
            o += 1
        arr[x][y] = '#'

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if r > nx >= 0 and c > ny >= 0:
                if arr[nx][ny] != '#':
                    queue.append((nx, ny))
    if o <= v:
        o = 0
    else:
        v = 0

    return o, v


r, c = map(int, input().split())
arr = [[0] * c for _ in range(r)]
visit = [[False] * c for _ in range(r)]
queue = deque()

for i in range(r):
    arr[i] = list(input())

o = 0
v = 0

total_sheep = 0
total_wolf = 0

for i in range(r):
    for j in range(c):
        if arr[i][j] == 'v' or arr[i][j] == 'o':
            o, v = bfs(i, j)
            total_sheep += o
            total_wolf += v

print(total_sheep, total_wolf)
