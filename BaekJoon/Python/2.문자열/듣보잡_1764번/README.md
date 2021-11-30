# 문제 주소
https://www.acmicpc.net/problem/1764

## 문제 접근 방법
듣지못한 아이와 보지못한 아이의 교집합을 구해야하는데 따로 입력받고 단순 인덱싱문제로 오해했다.

### 코드
```python
N,M = map(int, input().split())

a = set()
for i in range(N):
    a.add(input())

b = set()
for i in range(M):
    b.add(input())

result = sorted(list(a&b))
print(len(result))
for i in result:
    print(i)
```

### 내가 시도 해본코드 

```python
N,M = map(int, input().split())
students = []
ans = []
cnt = 0
for i in range(1,N+M):
    students.append(input())


for i in students[N+1:]:
    ans.append(i)
    cnt+=1

print(cnt)
for i in range(cnt):
    print(ans[i])


```

### 배운것
list (a & b) 를 통해 set 에서 겹치는 교집합을 찾아내는것 <br>

sorted를 이용한 사전순서로 정렬하기

