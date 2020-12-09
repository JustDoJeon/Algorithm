# [문제 주소](https://www.acmicpc.net/problem/2544)

## 문제 접근 방법

사람이 내리고 탈때마다 리스트의 요소로 append 하고 나중에 max 함수를 사용해서 최대값을 구했다.


### 코드

```python
# 지능형 기차  브론즈 3

people_list =[]
people =0

for _ in range(4):
    off , on = map(int, input().split())
    people -= off
    people += on
    print(people)
    people_list.append(people)

print(max(people_list))
```

### 내가 시도 해본코드 

```python
# 한번에 맞았습니다 ~.~
```

### 배운것

● 리스트의 위대함
