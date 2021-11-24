# 문제 주소
https://www.acmicpc.net/problem/11047

## 문제 접근 방법
큰 액수부터 조건문을 적용시켜 크기비교 후 몫과 나머지를 사용하여 계산했다.

### 코드
```python
#입력 받기
N,K = map(int, input().split())
coins = [int(input()) for _ in  range(n)]

#최소 동전 개수 구하기
coin_num = 0

for i in range(1,N+1):
    #인덱스 끝부터 순회 : 마이너스 인덱스
    coin = coins[-i]

    if K>=coin:
        # coin
        num = K 
        K -= coin*num
        coin_num += num

print(coin_num)
```

### 내가 시도 해본코드 

```python
# 내가푼방법
n , k = map(int,(input().split()))

coin = []
for i in range(n):
    coin.append(int(input()))


coin.sort(reverse=True)

total = 0

for i in range(len(coin)):
    if k >= coin[i]:
        total += k // coin[i]
        k = k % coin[i]

print(total)
```

### 배운것
리스트 인덱스의 활용을 생각해야한다.
<br>
정렬이 아닌 인덱스 끝부터 순회하는 마이너스 인덱스를 활용할 생각하기