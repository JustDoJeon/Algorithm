# 문제 주소
https://www.acmicpc.net/problem/2506

## 문제 접근 방법

쉬운 문제인데 접근을 잘 못했다 인덱스로 전에를 비교해서 축적하고 한쪽엔 결과 리스트에 어펜드해야했나 하지만 변수를 하나 둠으로써 간편한 코드로 작성이 가능했다.

### 코드

```python
# 점수계산

n = int(input())

arr = list(map(int, input().split()))

sum = 0
count = 0

for i in range(n):
    if arr[i] == 1:
        count += 1
        sum += count
    else:
        count = 0

print(sum)

```

### 시간복잡도


### 공간복잡도

