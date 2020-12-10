# [문제 주소](https://www.acmicpc.net/problem/7562)

## 문제 접근 방법

접근 방법은 bfs 로 길이를 초기화 하면서 구하려고했다.

과정에서 x와 x_end 즉, 목표와 같으면 반복문을 나오게끔 시도했다.


### 코드

```python
from collections import deque

dx = [1, 1, 2, 2, -1, -1, -2, -2]
dy = [2, -2, 1, -1, 2, -2, 1, -1]

def bfs(x, y, x_end, y_end):
    q = deque()
    q.append([x, y])
    a[x][y] = 1
    while q:
        x, y = q.popleft()
        if x == x_end and y == y_end:
            return a[x][y]-1
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < l and 0 <= ny < l:
                if a[nx][ny] == 0:
                    q.append([nx, ny])
                    a[nx][ny] = a[x][y] + 1

tc = int(input())
while tc:
    l = int(input())
    a = [[0]*l for _ in range(l)]
    x1, y1 = map(int, input().split())
    x2, y2 = map(int, input().split())
    if x1 == x2 and y1 == y2:
        print(0)
        tc -= 1
        continue
    ans = bfs(x1, y1, x2, y2)
    print(ans)
    tc -= 1
```

### 내가 시도 해본코드 

```python
# gk,, 테스트케이스 1인경우로 하고 그냥 해봄

dx = [-1, -1, 1, 1, -2, -2, 2, 2]
dy = [2, -2, 2, -2, 1, -1, 1, -1]
sum_a = 0


def bfs(x, y):
    queue = [(x, y)]
    global sum_a
    while queue:
        x, y = queue.pop()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < l and 0 <= ny < l and nx != ta and ny != tb:
                queue.append((nx, ny))
                sum_a += 1

    return sum_a


l = int(input())
fa, fb = map(int, input().split())
ta, tb = map(int, input().split())
result = bfs(fa, fb)
print(result)

```

![image](https://user-images.githubusercontent.com/52389219/101784820-5c277400-3b3f-11eb-8cdb-9dc9c78bb458.png)

왼쪽은 정답이고 오른쪽은 메모리초과인데 이유를 모르겠다 도저히.. <br>

=> 오른쪽 bfs 에서 if a[nx][ny] ==0:인 경우일때 다음 큐에 넣고 추가해줘야하는데 그 처리를 안했다. <br>
+ 36번째 쯤 매개변수 순서를 잘못었다..

### 배운것

● 길이를 구할때 a 배열을 통해 축적하면서 길이를 구한다는것을 배웠다.

● 그래프탐색에서 조건이 하나 둘만 생겨도 구현에 겁을 먹고 못한다. 연습해야겠다.
