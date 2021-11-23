from collections import deque

# cnt = 섬의개수처럼 구성된 단지 수
# danji 섬의땅갯수를 세서 저장해놓음 append로 다음꺼도 붙히고

dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]


def dfs(x, y):
    global cnt
    cnt += 1
    graph[x][y] = 0

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < n:
            if graph[nx][ny]:
                graph[nx][ny] = 0
                dfs(nx, ny)


graph = []
danji = []
n = int(input())

for _ in range(n):
    graph.append(list(map(int, input().strip())))
result= 0
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            cnt = 0
            dfs(i, j)
            result +=1
            danji.append(cnt)

print(len(danji))
for i in danji:
    print(i)