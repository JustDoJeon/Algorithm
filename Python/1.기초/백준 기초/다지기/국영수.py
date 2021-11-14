n = int(input())
import sys
input = sys.stdin.readline
li = [list(input().split()) for _ in range(n)]

li.sort(key = lambda x: (-int(x[1]) , int(x[2]) , -int(x[3]) , x[0]))

for student in li:
    print(str(student[0]))