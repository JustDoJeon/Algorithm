# 문제 주소
https://www.acmicpc.net/problem/1931

## 문제 접근 방법


### 내가 시도 해본코드 
```python
'''
1) 성을 모두쓰고 - 로 이어붙인것 => 긴형태
2) 성만 따서 만드는것
'''
ans = []

a = list(input().split('-'))



for i in range(len(a)):
    ans.append(a[i][0])
print(''.join(ans))
```

### 다른풀이 코드

```python
n = list(map(str, input().split("-")))

for i in range(len(n)) :
    print(n[i][0], end = "")
    
#[출처] 백준 알고리즘 2902번 KMP는 왜 KMP일까? - 파이썬|작성자 로아
```

### 체크 포인트 및 해석
번거로움을 줄인 다른코드를 봤지만 지금단계에선 차근차근 해봐야할듯 <br>

처음에 리스트에 [[ㅁㅁㅁ,ㅁㅁㅁㅁ,ㅁㅁㅁㅁ]] 이런식으로 들어갔는데 리스트를 정해놓고 append 하는 형식으로 써서 그런것 같다.