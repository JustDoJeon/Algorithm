# 백준 11399
# 내가 푼 답
num = int(input())

atm = list(map(int, input().split()))

atm.sort()

sum=0

tmp=0
total = 0
for i in atm:
    sum += i
    tmp =sum
    total += tmp

print(total)

#남의 코드
'''
n = int(input())
s = list(map(int, input().split()))
num = 0
s.sort()
for i in range(n):
    for j in range(i + 1):
        num += s[j]
print(num)
'''