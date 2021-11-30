# 문제 주소
https://www.acmicpc.net/problem/7576

## 문제 접근 방법


### 코드
```python
#정점 N, 간선 M

N , M = map(int, input().split())

visited = [False] * (N+1)
adj =[ []  for _ in range(N+1)]
count = 0




def dfs(v):
    visited[v] = True
    for e in adj[v]:
        if not visited[e]:
            dfs(e)
for _ in range(M):
    u,v = map(int, input().split())
    adj[u].append(v)
    adj[v].append(u)
    print(adj)

for j in range(1,N+1):
    if not visited[j]:
        dfs(j)
        count+=1


print(count)

```

### 내가 시도 해본코드 

```python
N,M = map(int, input())
adj =[ []  for _ in range(N+1)]
count = 0

...
```

### 배운것
adj = [ [] ]의 형태에서

adj[v].append[u]

adj[u].append[v] 로 리스트를 채워나가는 로직이 새로웠고 dfs를 사용할때 <br>

```null
import sys
sys.setrecursionlimit(10000) #파이썬 재귀에 시간제한이 있기 때문!
```

