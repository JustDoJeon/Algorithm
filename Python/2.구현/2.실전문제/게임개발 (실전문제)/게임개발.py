'''
게임개발
0 : 육지
1 : 바다

nxm 직사각형 각각의 칸은 육지 또는 바다
n >=3
m <=50

캐리턱는 동서남북 중 한곳을 바라본다.
맵의 각칸은 a,b
a는 북쪽으로부터 떨어진 칸의개수 b는 서쪽으로 부터 떨어진 칸의 개수

첫 시작 d가 반시계로 북쪽기준이니깐 a가 + 되면 행렬상 오른쪽 (열이 증가되는거)

direction (바라보는 방향)
방향의 값
- 0 : 북
- 1 : 동
- 2 : 남
- 3 : 서
'''

n , m = map(int,input().split())

# print(n,m)

#여기서 부터 막힘
# 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
d =[[0] * m for _ in range(n)]

#현재 캐릭터의 x좌표, y좌표 , 방향 입력받기
x , y , direction = map(int, input().split())

d[x][y]= 1 #현재 좌표 방문 처리

#전체 맵 정보 입력받기
array =[]
for i in range(n):
    array.append(list(map(int,input().split())))


#북동남서 방향 정의 처음부터 반시계로 90도 돌고 동서남북으로 움직이는거
dx =[-1,0,1,0]
dy =[0,1,0,-1]

#왼쪽으로 회전하는 상황

def turn_left():
    global direction
    direction -=1
    if direction == -1:
        direction = 3 #서쪽으로 (반시계로 90도니깐)


#시뮬레이션 시작
count = 1
turn_time = 0

while True:
    #왼쪽으로 회전
    turn_left()
    nx = x + dx[direction]
    ny = y + dy[direction]

    #회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
    if d[nx][ny] == 0 and array[nx][ny] ==0:
        d[nx][ny] == 1
        x = nx
        y = ny
        count+=1
        turn_time = 0
        continue
    #회전한 이후 정면에 가보지않은칸이 없거나 바다인 경우
    else:
        turn_time +=1
    #네 방향 모두 갈 수 없을 경우
    if turn_time == 4:
        nx = x -dx[direction]
        ny = y - dy[direction]
        #뒤로 갈 수 있다면 이동하기
        if array[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0
#정답 출력
print(count)