# 문제 주소
https://www.acmicpc.net/problem/16956

## 문제 접근 방법
문제를 읽고 처음엔 DFS/BFS 의 방식으로 문제를 푸려고했는데 
울타리에 대한 설치 제약조건이 따로있지 않아서 
상하좌우를 살피며 조건문을 통해 늑대인지 양인지 잔디인지 판별하여 움직였다.
그리고 늑대와 양이 아닌 모든곳을 울타리로 설치해서 문제를 풀어봤다.

### 코드
```python
# 늑대와 양

R, C = map(int, input().split())

map = [list(input()) for _ in range(R)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

check = 0

for i in range(R):
    for j in range(C):
        # 늑대
        if map[i][j] == 'W':
            for k in range(4):
                nx = i + dx[k]
                ny = j + dy[k]
                if nx < 0 or ny < 0 or nx >= R or ny >= C:
                    continue
                # 양이 늑대와 인접해있으면 check 상태를 변경
                if map[nx][ny] == 'S':
                    check = 1
                    break
        # 양이면
        elif map[i][j] == 'S':
            continue
        # .이면 모두 울타리 채움
        else:
            map[i][j] = 'D'

if check == True:
    print(0)
else:
    print(1)
    for i in map:
        print(''.join(i))

```
### 시간복잡도


### 공간복잡도

