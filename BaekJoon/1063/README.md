# 문제 주소
https://www.acmicpc.net/problem/1063

## 문제 접근 방법

각자의 경우를 조건문으로 따져서 하려고했지만 잘 진행되지않아서 구글을 참고했다.

리스트를 미리 만들어 놓음으로써 간편해졌고 각각의 경우 함수를 통해 풀었다. 


### 코드
```python
# 백준 1063번 실버 5

# a b c d e => 열  ++ -> x ++
# 1 2 3 4 5 => 행 즉 y축 => y++

char_list = {
                'A' : 1,
                'B' : 2,
                'C' : 3,
                'D' : 4,
                'E' : 5,
                'F' : 6,
                'G' : 7,
                'H' : 8
            }
alphabet = 'ABCDEFGH'

# 킹의 이동 방법을 각 함수로 정의했음
# 다른 모든 방향에 대해서 같은 방식이므로 R만 주석을 닮.
# a는 킹, b는 돌

# 킹의 이동방향에 돌이 있을 경우 / 없을 경우를 if else로 나누었고
# 돌이 있을 경우에는 돌이 이동 가능한지 확인하고, 가능하면 둘 다 이동
# 돌이 없을 경우에는 킹만 이동

def R(a, b):
    # a의 이동 방향에 b가 있을 경우에
    if [a[0] + 1, a[1]] == b:
        # a와 b 모두 이동 가능한지 확인하고,(사실은 b만 확인해도 될 듯)
        if (a[0] + 1) < 9 and (b[0] + 1) < 9:
            # a와 b 둘 다 이동
            a[0] = a[0] + 1
            b[0] = b[0] + 1

    # a의 이동 방향에 b가 없으면,
    else:
        # a가 이동 가능한지만 확인하고 이동하면 됨
        if (a[0] + 1) < 9:
            a[0] = a[0] + 1
    return(a, b)

def L(a, b):
    if [a[0] - 1, a[1]] == b:
        if (a[0] - 1) > 0 and (b[0] - 1) > 0:
            a[0] = a[0] - 1
            b[0] = b[0] - 1
    else:
        if (a[0] - 1) > 0:
            a[0] = a[0] - 1
    return (a, b)

def B(a, b):
    if [a[0], a[1] - 1] == b:
        if (a[1] - 1) > 0 and b[1] - 1 > 0:
            a[1] = a[1] - 1
            b[1] = b[1] - 1
    else:
        if (a[1] - 1) > 0:
            a[1] = a[1] - 1
    return (a, b)

def T(a, b):
    if [a[0], a[1] + 1] == b:
        if (a[1] + 1) < 9 and b[1] + 1< 9:
            a[1] = a[1] + 1
            b[1] = b[1] + 1
    else:
        if (a[1] + 1) < 9:
            a[1] = a[1] + 1
    return(a, b)

def RT(a, b):
    if [a[0] + 1, a[1] + 1] == b:
        if (a[0] + 1) < 9 and (b[0] + 1) < 9 and (a[1] + 1) < 9 and (b[1] + 1) < 9:
            a[0] = a[0] + 1
            b[0] = b[0] + 1
            a[1] = a[1] + 1
            b[1] = b[1] + 1
    else:
        if (a[0] + 1) < 9 and (a[1] + 1) < 9:
            a[0] = a[0] + 1
            a[1] = a[1] + 1
    return(a,b)

def LT(a, b):
    if [a[0] - 1, a[1] + 1] == b:
        if (a[0] - 1) > 0 and (b[0] - 1) > 0 and (a[1] + 1) < 9 and (b[1] + 1) < 9:
            a[0] = a[0] - 1
            b[0] = b[0] - 1
            a[1] = a[1] + 1
            b[1] = b[1] + 1
    else:
        if (a[0] - 1) > 0 and (a[1] + 1) < 9:
            a[0] = a[0] - 1
            a[1] = a[1] + 1
    return(a,b)

def RB(a, b):
    if [a[0] + 1, a[1] - 1] == b:
        if (a[0] + 1) < 9 and (b[0] + 1) < 9 and (a[1] - 1) > 0 and b[1] - 1 > 0:
            a[0] = a[0] + 1
            b[0] = b[0] + 1
            a[1] = a[1] - 1
            b[1] = b[1] - 1
    else:
        if (a[0] + 1) < 9 and  (a[1] - 1) > 0 :
            a[0] = a[0] + 1
            a[1] = a[1] - 1
    return (a, b)

def LB(a, b):
    if [a[0] - 1, a[1] - 1] == b:
        if (a[0] - 1) > 0 and (b[0] - 1) > 0 and (a[1] - 1) > 0 and b[1] - 1 > 0:
            a[0] = a[0] - 1
            b[0] = b[0] - 1
            a[1] = a[1] - 1
            b[1] = b[1] - 1
    else:
        if (a[0] - 1) > 0 and (a[1] - 1) > 0:
            a[0] = a[0] - 1
            a[1] = a[1] - 1
    return (a, b)

# 킹, 돌, 움직이는 횟수 입력
a, b, c = input().split(' ')

a = [int(char_list[a[0]]) , int(a[1])]
b = [int(char_list[b[0]]) , int(b[1])]
c = int(c)

# 움직이는 횟수마다 입력되는 값에 따라 함수 실행
for i in range(c):
    move = input()
    if move == 'R':
        R(a, b)
    if move == 'L':
        L(a, b)
    if move == 'T':
        T(a, b)
    if move == 'B':
        B(a, b)
    if move == 'RT':
        RT(a, b)
    if move == 'LT':
        LT(a, b)
    if move == 'RB':
        RB(a, b)
    if move == 'LB':
        LB(a, b)

# 숫자로 된 좌표를 알파벳+숫자로 변환
print(alphabet[a[0]-1]+str(a[1]))
print(alphabet[b[0]-1]+str(b[1]))

```

### 시간복잡도


### 공간복잡도

