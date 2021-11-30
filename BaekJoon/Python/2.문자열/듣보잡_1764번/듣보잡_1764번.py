N,M = map(int, input().split())
students = []
ans = []
cnt = 0
for i in range(1,N+M):
    students.append(input())


for i in students[N+1:]:
    ans.append(i)
    cnt+=1

print(cnt)
for i in range(cnt):
    print(ans[i])

