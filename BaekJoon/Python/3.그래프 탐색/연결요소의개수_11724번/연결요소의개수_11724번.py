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
