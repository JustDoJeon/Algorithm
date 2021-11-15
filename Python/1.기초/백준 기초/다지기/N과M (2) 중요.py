'''
백준 15650번
'''

import itertools
#15649 순열 문제
'''
from itertools import permutations
n,m = map(int,input().split())

lists= [str(i+1) for i in range(n)]

for e in list(permutations(lists,m)):
    print(" ".join(e))
'''

# 15650

import sys
input = sys.stdin.readline
N,M = map(int, input().split())
lists = [i for i in range(1,N+1)]
check_list = [False] *N
arr = []

def dfs(cnt):
    if cnt ==M:
        print(*arr)
        return

    for i in range(N):
        if check_list[i]:
            continue
        check_list[i] =True
        arr.append(lists[i])
        dfs(cnt+1)
        arr.pop()

        for j in range(i+1,N):
            check_list[j] =False

dfs(0)