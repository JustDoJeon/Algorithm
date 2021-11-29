# 문제 주소
https://www.acmicpc.net/problem/1541

## 문제 접근 방법
문자열 조작 문제임을 알고 예제 출력을 보면서 아이디어를 떠올렸다. <br>

-나오고 바로 괄호 하면 되겠다는 생각을 했다. 막대에 금그어서 스택문제가 잠깐 떠올랐지만(?) 문자열을 잘라서 조작해야겠다는 생각을했다. <br>

결론적으로 문자열 구분과 리스트의 인덱싱에 대한 지식이 부족했다.

### 코드
```python
arr = input().split('-')
s = 0

for i in arr[0].split('+'):
    s += int(i)
for i in arr[1:]:
    for j in i.split('+'):
        s -= int(j)

print(s)
```

### 내가 시도 해본코드 

```python
GG
```

### 배운것
문자열 구분과 리스트의 인덱싱에 대한 지식이 부족했다.

