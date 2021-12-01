# 문제 주소
https://www.acmicpc.net/problem/1931

## 문제 접근 방법

정렬을 하고 비교해야겠다는 생각은 했지만 시작시간을 기준으로 정렬했었다. <br>

끝나는 시간이 빠를수록 회의실을 많이 사용할수 있음을 생각하지 못했다.

### 내가 시도 해본코드 

```python
n = int(input())

room = []

start = 0
end = 0

answer = []

for i in range(n):
    room.append(input().split(' '))

room.sort(key = lambda x : int(x[0]) )

print(room)

for i in range(len(room)):
    before_end =room[i][1]
    
```

### 다른풀이 코드

```python
n = int(input())

meeting_room = []

for _ in range(n):
    start_time, end_time = map(int, input().split())

    meeting_room.append((start_time,end_time))

meeting_room = sorted(meeting_room, key = lambda x: x[0]) # 시작 시간을 기준으로 오름차순
meeting_room = sorted(meeting_room,key = lambda  x: x[1]) # 끝나는 시간을 기준으로 다시 오름차순

# print(meeting_room)

last = 0 #회의의 마지막 시간을 저장할 변수
count = 0 #회의 개수를 저장할 변수

for i,j in meeting_room:
    if i >= last:
        # print('i :', i)
        count+=1
        last = j

print(count)
```

### 체크 포인트 및 해석
람다 적용을 다시 체크해보자<br>

for i , j in meeting_room: 부분을 보면 파이썬은 안되는게 없는것같다. 

meeting_room = sorted(meeting_room, key = lambda  x: (x[1], x[0])) 로 한줄로 표현이 가능한데 시작 시간을 기준으로 오름차순 정의를 해주지않으면 정답이 되지않는다.