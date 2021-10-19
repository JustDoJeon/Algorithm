from collections import deque

n,m = map(int, input().split())

maze = []
for i in range(n):
    maze.append(list(map(int, input())))

#이동할 4방향
dx =[-1,0,1,0]
dy = [0,1,0,-1]

#BFS 소스 구현
def bfs(x,y):
    queue = deque()
    queue.append((x,y))

    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx >= n or ny >= m or nx < 0 or ny < 0:
                continue
            #벽인경우 무시
            if maze[nx][ny] ==0:
                continue
            if maze[nx][ny] == 1:
                maze[nx][ny] = maze[x][y] + 1
                queue.append((nx,ny))
    return maze[n-1][m-1]


print(bfs(0,0))



result =0

for i in range(n):
    for j in range(m):
        if bfs(i,j) == True:
            result += 1
