# 문제 주소
https://www.acmicpc.net/problem/11399

## 문제 접근 방법
처음부터 큰 수를 더하게되면 점점 뒤로 갈수록 값이 가중되니깐 오름차순으로 정렬 후 더해갔다.

### 코드
```python
n = int(input())
s = list(map(int, input().split()))
num = 0
s.sort()
for i in range(n):
    for j in range(i + 1):
        num += s[j]
print(num)
```

### 내가 시도 해본코드 

```python
num = int(input())

atm = list(map(int, input().split()))

atm.sort()

sum=0

tmp=0
total = 0
for i in atm:
    sum += i
    tmp =sum
    total += tmp

print(total)

```

### 배운것
이중 for문 사용의 다른 풀이 생각
<br>
