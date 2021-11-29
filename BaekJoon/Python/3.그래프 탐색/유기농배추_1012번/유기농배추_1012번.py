from collections import deque
#전체 몇번 돌건지
# n = int(input())
#
# # x,y 몇곳에?
#
# x,y,k = map(int, input().split())
#
# graph = [ [0] * y for i in range(x)]
#
# dx , dy = [0,1,0,-1] , [1,0,-1,0]
#
# for i in range(k):
#     a,b = map(int,input().split())
#     graph[a][b] = 1
#
#
#
#
# def check(a,b):
#     if 0<=a<x and 0<=b<y:
#         return True
#     else:
#         return False
#
#
# def bfs(graph,a,b):
#     queue = deque()
#     queue.append((a,b))
#     graph[a][b] = 0
#     count = 0
#
#     while queue:
#         x,y = queue.popleft()
#         for i in range(4):
#             nx = x + dx[i]
#             ny = y + dy[i]
#             if check(nx,ny) & graph[nx][ny] == 1:
#                 queue.append((nx,ny))
#                 count+=1
#     return count

from collections import deque

dx = [0,0,1,-1]
dy = [1,-1,0,0]

t = int(input())

def bfs(graph, a, b):
    queue = deque()
    queue.append((a,b))
    graph[a][b] = 0

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if nx < 0 or nx >=n or ny < 0 or ny >= m:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append((nx, ny))
    return

for i in range(t):
    cnt = 0
    n, m, k = map(int,input().split())
    graph = [[0]*m for _ in range(n)]

    for j in range(k):
        x, y = map(int, input().split())
        graph[x][y] = 1

    for a in range(n):
        for b in range(m):
            if graph[a][b] == 1:
                bfs(graph, a, b)
                cnt += 1
    print(cnt)