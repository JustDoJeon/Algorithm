#백준 2745번
import sys
input =sys.stdin.readline
N, B =  input().split(" ")

table = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

N = N[::-1]
B=int(B)
sum=0
answer = 0
for i in range(len(N)-1,-1,-1):
    sum = table.index(N[i]) * (B**i)
    answer += sum

print(answer)

