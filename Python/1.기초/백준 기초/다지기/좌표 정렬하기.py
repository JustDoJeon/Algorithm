# 백준 11650번
n = int(input())
arr = []
for i in range(n):
    x,y = map(int, input().split())
    arr.append([x,y])

#정렬 -> x좌표 정렬 후 y좌표 정렬
arr.sort(key=lambda x: (x[0],x[1] ))

for i in range(n):
    print(arr[i][0], arr[i][1])