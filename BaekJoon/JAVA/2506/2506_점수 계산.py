# 점수계산

n = int(input())

arr = list(map(int, input().split()))

sum = 0
count = 0

for i in range(n):
    if arr[i] == 1:
        count += 1
        sum += count
    else:
        count = 0

print(sum)
