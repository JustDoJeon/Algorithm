# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/68935)

## 문제 접근 방법

순차적으로 로그찍어가며 해결하였습니다. 진법 변환을 나누기의 몫과 나머지로 계산하고 queue에 담았습니다. 

그리고 queue의 길이만큼 i 값을 증가시키고 그 i는 3의 몇승인지 결정한다 

마지막으로 answer 값에 누적으로 pop값과 3의 i승을 곱하면서 더해주면 답!




### 코드

```python
from collections import deque


def solution(n):
    answer = 0
    queue = deque()

    while n > 0:
        res = n % 3
        n = (int)(n / 3)
        queue.append(res)

    while len(queue):
        for i in range(0, len(queue)):
            temp = 0
            temp = queue.pop()
            # print("temp", temp)
            # print("i",i)
            # if temp != 0 :
            answer += temp * (3 ** i)
            # print(answer)
    return answer


n = 125

print(solution(n))

```

### 내가 시도 해본코드 

```python
# 한번에 맞았습니다 ~.~
```

### 배운것

● 파이썬에서는 제곱을 ** 로 표현 ex) 3의 4제곱 = > 3 ** 4

