import sys
input = sys.stdin.readline

n , b=  map(int,input().split(" "))
answer = ''

table = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

while n !=0:
    answer += str(table[n % b])
    n = n//b

print(answer[::-1])