from collections import deque

m,n = map(int, input().split())

matrix = [list(map(int, input().split())) for _ in range(n) ]

queue = deque([])
dx = [-1,0,1,0]
dy = [0,-1,0,1]

answer = 0

#queue에 토마토의 위치 좌표를 append 시킴
for i in range(n):
    for j in range(m):
        if matrix[i][j] ==1:
            queue.append([i,j])

#bfs 함수, 한번 들어가면 다 돌고 나오니깐 재귀할 필요없음
def bfs():
    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx , ny = x + dx[i] , y + dy[i]
            if 0<=nx<n and 0<=ny<m and matrix[nx][ny] ==0:
                #처음 시작을 1로 했다는거
                matrix[nx][ny] = matrix[x][y] +1
                queue.append([nx,ny])

bfs()
for i in matrix:
    for j in i:
        if j == 0:
            print(-1)
            exit(0)
    answer = max(answer,max(i))

print(answer-1)
