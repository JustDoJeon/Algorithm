# 문제 주소
https://www.acmicpc.net/problem/13746

## 문제 접근 방법
문제를 읽고 처음엔 DFS/BFS로 탐색하면서 C를 처리만 잘하면 되겠다 싶었다
그래서 L일경우 DFS를 돌리고 쭉 깊게 탐색시켜서 탐색중에 C가 나오면 L로 바꾸고 탐색시켰다
만약에 W가 나오면 DFS를 탈출하고 다시 L이 나올때 섬의 개수를 늘려 카운팅했다
즉, 다시 dfs가 실행되서 나오면 그범위의 island 만들어놓고 1개 카운팅하고 이런식의 문제 
### 코드
```python
# BOJ 13746) ISLAND 문제 실5


# 땅=> L , 물은 W 구름은 C인데 C는 땅도가능하고 물도 가능하다

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

```
### 시간복잡도


### 공간복잡도

