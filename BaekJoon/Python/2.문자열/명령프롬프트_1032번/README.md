# 문제 주소
https://www.acmicpc.net/problem/1032	

## 문제 접근 방법
1) 입력값중 최대한 겹치는것선택
2) .모두있으면 . 을선택하고 아니면 ?로 겹치지않는부분 대체

### 코드
```python
n = int(input())

a = list(input())
a_len = len(a)

for i in range(n-1):
    b = list(input())
    for j in range(a_len):
        if a[j] != b[j]:
           a[j] = '?'

print(''.join(a))
```

### 내가 시도 해본코드 

```python
'''
dir a?b.exe 라고 검색하면
첫번째 a 세번째 b익 확장자 exe인거 다나오자나
이문제는

!!! 패턴으로 뭘 쳐야 그 결과가 나오는지..
패턴에는 .과 ? 만 넣을수있다.


'''


n = int(input())

cmd = []

for _ in range(n):
    cmd.append(input())


```

### 배운것
생각을 좀 깊게... <br>

print(''.join(a)) 사용 <br>

join 함수는 매개변수로 들어온 리스트에 있는 요소 하나하나를 합쳐서 하나의 문자열로 바꾸어 반환하는 함수

