# 문제 주소
https://www.acmicpc.net/problem/1100

## 문제 접근 방법
문제에서 정해진 8크기 만큼의 입력을 받고 행마다 시작이 하얀OR검은색 이므로 조건문을 통해 접근했다. 

### 코드
```python
chess = []
for _ in range(8):
    chess.append(list(map(str, list(input()))))

answer = 0
for i in range(8):
    for j in range(8):
        if (i + j) % 2 == 0: #하얀칸일 경우
            if chess[i][j] == 'F': #F있을 경우
                answer += 1
print(answer)
```

### 내가 시도 해본코드 

```python
N = 8

board = []
#한줄에 8x8 받는법 있는디
for i in range(8):
    board.append(list(map(str, list(input()))))
count = 0

for i in range(8):
    for j in range(8):
        if (i % 2 ==0) & (j % 2==0):
            if board[i][j] == 'F':
                count+=1
        if (i % 2 == 1) & (j % 2 == 1):
            if board[i][j] == 'F':
                count+=1

print(count)
'''
하검하검하검하검하검
검하검하검하검하검하
'''

```

### 배운것
이중 리스트의 입력 받는것 헷갈리지말기
<br>

조건문 사용 및 구현 