# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/12922)

## 문제 접근 방법

직관!!




### 코드

```python
def solution(n):
    str_list = "수박" * 5000
    answer = ''
    for i in range(0, n):
        answer += str_list[i]

    return answer


n = 3

print(solution(n))
```

### 내가 시도 해본코드 

```python
# 한번에 맞았습니다 ~.~
# 다른사람의 코드 첨부..
def water_melon(n):
    s = "수박" * n
    return s[:n]


# 실행을 위한 테스트코드입니다.
print("n이 3인 경우: " + water_melon(3));
print("n이 4인 경우: " + water_melon(4));
```

### 배운것

● 나는 길이가 10000이라서 파이썬의 편리함을 이용해서 글자수(2) 에 5000을 곱해서 수박을 넣어놨따

● 다른 답변들을 보니깐 입력값 n을 곱해서 최소한의 메모리만 사용하는것 같다. 

