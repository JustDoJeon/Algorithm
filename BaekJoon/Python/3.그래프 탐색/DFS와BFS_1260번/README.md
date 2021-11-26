# 문제 주소
https://www.acmicpc.net/problem/2839

## 문제 접근 방법
조건문 사용을 통한 코드

### 코드
```python
# 설탕배달
n = int(input())

bong = 0

while n>0:
    if n % 5 ==0:
        bong += (n//5)
        print(bong)
        break
    n = n-3
    bong +=1
else:
    print(-1)
```

### 내가 시도 해본코드 

```python
#백준 2839

n = int(input())

bong = 0

while n>0:
    if n % 5 ==0:
        bong += 1
        n=n-5
    elif n > 0:
        n= n-3
        bong +=1
    else:
        print(-1)
        break



print(bong)
```

### 배운것
조건문을 적용할때 break의 사용과 print 시점을 잘 파악해야겠다.
<br>
특히 if문을 사용할때 elif문과 else의 조건을 적용하며 if가 제외된 경우라는것을 명심해야한다.