#단지번호 붙이기 2667 번
'''
n = int(input())
apart = []

for i in range(n):
    apart.append(input())

check_apart = [ [0] * n for _ in range(n)]

print(check_apart)

dx = [-1,0,1,0]
dy = [0,-1,0,1]

# count = 0
def dfs(x,y):
    count = 0
    check_apart[x][y] = 1
    for i in range(4):
        nx = x+dx[i]
        ny = y+dy[i]
        if nx >=0 and nx <n and ny >=0 and ny <n:
            if check_apart[nx][ny] == 0 and apart[nx][ny] =='1':
                count+=1
                dfs(nx,ny)
                print(count)



dfs(0,0)
dfs 는 최단경로를 보장해주지않는다...!
'''


# 남풀이 -bfs

from collections import deque

n = int(input())
graph = []

for i in range(n):
    graph.append((list(map(int, input()))))

dx, dy = [-1,1,0,0], [0,0,-1,1]

def check(x,y):
    if  0<=x<n and 0<=y<n:
        return True
    else:
        return False

def bfs(graph,a,b):
    n = len(graph)
    queue = deque()
    queue.append((a,b))
    #들린곳을 0으로 바꿔서 안오게끔
    graph[a][b] = 0
    count = 1

    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if check(nx,ny) and graph[nx][ny] ==1:
                # 들린곳을 0으로 바꿔서 안오게끔
                graph[nx][ny] = 0
                queue.append((nx,ny))
                count+=1
    return count

answer = []
for i in range(n):
    for j in range(n):
        if graph[i][j] ==1:
            answer.append(bfs(graph,i,j))

answer.sort()

#총 단지수
print(len(answer))

for i in range(len(answer)):
    print(answer[i])




















