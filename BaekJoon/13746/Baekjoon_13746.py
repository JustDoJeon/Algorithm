# BOJ 13746) ISLAND 문제 실5


# 땅=> l , 물은 W 구름은 C인데 C는 땅도가능하고 물도 가능하다

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

n, m = map(int, input().split())

is_map = [[0] * m for _ in range(n)]
visited = [[False] * m for _ in range(n)]

# print(is_map)
# print(visited)

island = 0


def dfs(x, y):
    visited[x][y] = True
    global  island
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or nx >= n or ny < 0 or ny >= m:
            continue
        if is_map[nx][ny] == 'L' and visited[nx][ny] == False:
            dfs(nx, ny)
        elif is_map[nx][ny] =='C':
            is_map[nx][ny] ='L'
            dfs(nx,ny)
        else:
            continue

for i in range(n):
    is_map[i] = list(input())

# print(is_map)

for i in range(n):
    for j in range(m):
        if is_map[i][j] == 'C':
            continue
        if is_map[i][j] == 'L' and visited[i][j] == False:
            dfs(i, j)
            island+=1


print(island)
