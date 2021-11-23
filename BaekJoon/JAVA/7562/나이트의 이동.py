# 7562

from collections import deque

dx = [-1, -1, 1, 1, -2, -2, 2, 2]
dy = [2, -2, 2, -2, 1, -1, 1, -1]


def bfs(x, y, x_end, y_end):
    queue = deque()
    queue.append([x, y])
    a[x][y] = 1
    while queue:
        x, y = queue.popleft()
        if x == x_end and y == y_end:
            return a[x][y] - 1
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < l and 0 <= ny < l:
                queue.append([nx, ny])
                a[nx][ny] = a[x][y] + 1

# 테스트 케이스를 입력받았다.
tc = int(input())

while tc:
    l = int(input())  # 체스판 크기를 정해줍니다
    a = [[0] * l for _ in range(l)] # 이동거리를 움직임에따라 축적하기위한 배열
    x1, y1 = map(int, input().split())
    x2, y2 = map(int, input().split())
    if x1 == x2 and y1 == y2: #만약에 목적지면 돌릴필요가없죠
        print(0)
        tc -= 1
        continue
    ans = bfs(x1, x2, y1, y2) # 목적지가 아니라면 bfs 탐색을 시작하고 결과값을 ans 변수에 저장
    print(ans)
    tc -= 1
