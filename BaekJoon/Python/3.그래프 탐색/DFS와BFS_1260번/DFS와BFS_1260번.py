#백준 1260번
# DFS와 BFS 문제 - 실2

n, m, v = map(int, input().split())

matrix = [[0] * (n + 1) for i in range(n + 1)]

for _ in range(m):
    x, y = map(int, input().split())
    matrix[x][y] = 1
    matrix[y][x] = 1

visit_list = [0] * (n + 1)


def dfs(v):
    visit_list[v] = 1
    print(v, end=' ')
    for i in range(1, n + 1):
        if (visit_list[i] == 0 and matrix[v][i] == 1):
            dfs(i)


def bfs(v):
    queue = [v]
    visit_list[v] = 0
    while queue:
        v = queue.pop(0)
        print(v, end=' ')
        for i in range(1, n + 1):
            if(visit_list[i] == 1 and matrix[v][i]) == 1:
                queue.append(i)
                visit_list[i] = 0


dfs(v)
print()
bfs(v)