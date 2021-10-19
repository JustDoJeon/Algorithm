'''
실전문제
'''

n,m = map(int, input().split())

#2차원 리스트
graph = []
for i in range(n):
    graph.append(list(map(int, input().split())))


#print(graph)
visit =[ ]

def dfs(x,y):
    if x>=n or x<=-1 or y >=m or y <=1:
        return False
    if graph[x][y] == 0:
        graph[x][y] = 1
        dfs(x-1,y)
        dfs(x+1,y)
        dfs(x,y-1)
        dfs(x,y+1)
        return True
    return False


#모든 노드에 대하여 음료수 채우기
result =0
for i in range(n):
    for j in range(m):
        if dfs(i,j) == True:
            result += 1

print(result)