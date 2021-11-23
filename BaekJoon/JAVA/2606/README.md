# 문제 주소
https://www.acmicpc.net/problem/2606

## 문제 접근 방법


### 코드
```python
# 바이러스

computer = int(input())
network = int(input())

virus_map = [ [ 0 for _ in range(computer+1 )]  for _ in range(computer+1)]
#                   열                                         행
print(virus_map)

#2차원 배열 안에 넣어주기
for _ in range(network):
    x, y = map(int, input().split())
    virus_map[x][y] = 1
    virus_map[y][x] = 1


def bfs(virus_map,start):
    queue = [start]
    visited =[]

    while queue:
        temp = queue.pop(0)
        visited.append(temp)

        for i in range(len(virus_map)):
            if virus_map[temp][i] and i not in visited and i not in queue:
                queue.append(i)

    return len(visited) - 1

print((bfs(virus_map,1)))
```

### 시간복잡도


### 공간복잡도

