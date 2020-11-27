# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/70128)

## 문제 접근 방법

그냥 for 문에 리스의 크기 만큼 돌려서

a[i] * b[i] 를 누적하면 되겠다 싶었다!




### 코드

```python
def solution(a,b):
    answer = 1234567890
    res=0

    for i in range(len(a)):
        res += a[i] *b[i]


    answer = res
    return answer
```

### 내가 시도 해본코드 

```python
# 한번에 맞았습니다 ~.~
```

### 배운것

● for문... 누적 합...

