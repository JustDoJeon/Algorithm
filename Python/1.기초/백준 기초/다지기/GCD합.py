import sys
import math
input = sys.stdin.readline


n = int(input())
# arr = [ list(map(int,input().split())) for i in range(int(input()))]

for i in range(n):
    arr = list(map(int, input().split()))
    total = 0
    for j in range(1,len(arr)):
        for k in range(j+1,len(arr)):
            total += math.gcd(arr[j],arr[k])

    print(total)

