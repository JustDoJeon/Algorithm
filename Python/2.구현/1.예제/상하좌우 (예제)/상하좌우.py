'''
상하좌우 문제
- 여행가 A는 N X N 크기의 정사각형 공간위에 서있다.
이 공간은 1 X 1 크기의의 정사각형으로 나누어져있다 가장 왼쪽위 좌표는 1,1 , 가장 오른쪽 좌표는 N,N
A는 상하좌우 방향으로 이동할 수 있으며, 시작좌표는 항상 1,1
L : 왼쪽으로 한칸이동
R : 오른쪽으로 한칸이동
U : 위쪽으로 한칸이동
D : 아래으로 한칸이동
'''

n = int(input())

plan = input().split()
#R R U D D

#시작위치
a = 1
b = 1

#방향감을 줘보자
dx = [0,0,-1,1]
dy =[-1,1,0,0]

lrud = ['L','R','U','D']


for  i in plan:
    for j in range(len(lrud)):
        if plan == lrud[j]:
            nx = a + dx[j]
            ny = b + dy[j]
    if nx < 1 or ny <1 or nx > n or ny > n:
        continue
    x = nx
    y = ny

print(x,y)
