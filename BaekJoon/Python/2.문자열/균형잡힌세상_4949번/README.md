# 문제 주소
https://www.acmicpc.net/problem/1541

## 문제 접근 방법
단순히 스택에 넣고 ( ) 이렇게나 []  짝 맞게 들어오면 set 씌어서 갯수 세면 2개겠지 했지만 (() 경우 와 비슷한경우 set 적용시 2가 나오는 예외를 생각 하지 못했다. 스택을 통해 ( [ 를 만나면 넣고 )] 만나면 pop을 시켜서 스택이 비어있는 상태로 만들어야한다.<br>

추가로, 입력받는 부분을 다시 볼 필요가있다.

### 코드
```python
# 나의 코드
 
import sys
input = sys.stdin.readline
 
while True:
    s = input().rstrip()
    if s == '.':    # 종료 조건
        break
 
    stack = []
    flag = True    # 짝을 이루지 않는 경우
 
    for i in range(len(s)):
        if s[i] == '(' or s[i] == '[':
            stack.append(s[i])
 
        elif stack and (s[i] == ')' or s[i] == ']'):  # stack은 있지만 닫힌 괄호가 나오는 경우
            if s[i] == ')' and stack[-1] == '(':
                stack.pop()
            elif s[i] == ']' and stack[-1] == '[':
                stack.pop()
            else:    # (])
                flag = False
 
        elif not stack and (s[i] == ')' or s[i] == ']'):  # stack이 없으면서 닫힌 괄호가 나오는 경우, )(
            flag = False
 
    if flag and not stack:
        print('yes')
    else:
        print('no')
```

### 내가 시도 해본코드 

```python
# . 받으면 그 문장 받는거 다 받고 다음꺼 어케 받지 다시

sentence = list(input())

stack_a = []
stack_b =[]
for i in range(len(sentence)):
    if sentence[i] == "(":
        stack_a.append(sentence[i])
    if sentence[i] == ")":
        stack_a.append(sentence[i])
    if sentence[i] == "[":
        stack_b.append(sentence[i])
    if sentence[i] == "]":
        stack_b.append(sentence[i])


if (len(set(stack_a)) !=2) | (len(set(stack_b)) !=2):
    print("no")
else:
    print("yes")
```

### 배운것

접근 방법...! 

