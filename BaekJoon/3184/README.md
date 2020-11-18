# 문제 주소

https://www.acmicpc.net/problem/16956

## 문제 접근 방법

결론적으로 여러번 시도해서 틀리고 풀었다.

bfs 탐색으로 제약조건을 #(울타리 기준으로) 안으로 설정하였고

 늑대의 수와 양의 수를 따로 카운트하여 늑대가 많으면 양의수를 초기화하고 반대의경우 같은 방법으로 카운팅하였다. bfs를 실행하고 bfs를 탈출 할때 마다 총 늑대와 양의 수를 누적하고 마지막에 출력하였다. 

### 코드

```python
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


```

### 시간복잡도


### 공간복잡도

