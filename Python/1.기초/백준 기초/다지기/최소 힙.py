# https://littlefoxdiary.tistory.com/3
import heapq
import sys

input =  sys.stdin.readline

heap =[]
n = int(input())

for i in range(n):
    x=int(input())
    if x != 0:
        heapq.heappush(heap,x)
    else:
        try:
            print(heapq.heappop(heap))
        except:
            print(0)
