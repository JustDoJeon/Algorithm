# [문제 주소](https://www.acmicpc.net/problem/2667)

## 문제 접근 방법

DFS 로 접근 CNT와 DANJI의 수를 구하는 법을 쉽게 못 떠올려서 참고했다.


### 코드

```python
from collections import deque


dx = [-1,0,1,0]
dy = [0,-1,0,1]

# dfs
def dfs(x,y):
    global cnt

    graph[x][y] = 0
    cnt +=1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx<0 or nx>=N or ny<0 or ny>=N:
            continue
        if graph[nx][ny] == 1:
            dfs(nx,ny)



N = int(input())

graph = []
for i in range(N):
    graph.append(list(map(int, input().strip())))

result  = 0
cnt = 0
danji =[]
for i in range(N):
    for j in range(N):
        if graph[i][j] == 1:
            cnt = 0
            dfs(i,j)
            danji.append(cnt)

print(len(danji))
danji.sort()
for i in danji:
    print(i)
```

### 내가 시도 해본코드 

```python
ㅈㅈ

```

### 배운것

●  danji라는 리스트에 cnt 값( 섬의 개수처럼 graph가 1인 것들로 구성된 것을 탐색한 갯수) 을 dfs가 나오면 cnt

● 값을 갖고 나와서 넣어주고 다시 dfs 돌리기전에 cnt 값을 초기화해준다. 

●  danji에는 한번 cnt 를 가져올때마다 그 값을 리스트 형태로[x,t,z,y,w] 이런식으로 저장되므로 이 길이를 구하면 

몇개의 단지가 있는지 구할 수 있었다.