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
                # 양이 늑대와 인전해있으면 flag 변경
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
