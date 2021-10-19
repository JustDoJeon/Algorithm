import copy
from copy import deepcopy
from itertools import combinations
from collections import deque
import sys
'''
https://www.acmicpc.net/problem/14502
strip() : 

'''
input = sys.stdin.readline

dx = [0,0,-1,1]
dy = [1,-1,0,0]

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)] #이거 체크
answer = 0
q = deque()



def bfs():
    global answer
    w = copy.deepcopy(arr)
    for i in range(n):
        for j in range(m):
            if w[i][j] == 2:
                q.append([i, j])
    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx <0 or nx >= n or ny <0 or ny >= m:
                continue
            if w[nx][ny] ==0:
                w[nx][ny] = 2
                q.append([nx,ny])
    cnt = 0
    for i in w:
        cnt = cnt + i.count(0)
    answer = max(answer,cnt)




def wall(wcnt):
    if wcnt ==  3:
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if arr[i][j] ==0:
                arr[i][j] = 1
                wall(wcnt + 1)
                arr[i][j] = 0

wall(0)
print(answer)

