# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/12926)

## 문제 접근 방법

솔직히 직관적으로 봤을때 그냥 문자-> 정수 && 정수-> 문자 변환 통해서 더해주면 되겠다 범위 초과하면 원래 처음으로 가게 마이너스 설정해주고 !!! 근데 공백에 대한 입출력을 생각을 못했습니다.


### 코드

```python
def solution(s, n):
    s = list(s) 
    
    for i in range(len(s)):
        if s[i].isupper():
            s[i]=chr((ord(s[i])-ord('A')+ n)%26+ord('A'))
        elif s[i].islower(): 
            s[i]=chr((ord(s[i])-ord('a')+ n)%26+ord('a')) 
    
    return "".join(s)
```

### 내가 시도 해본코드 

부끄러워도 남겨놓겠습니다.

```python
def solution(s, n):
    ans = ""

    abc = list(s)

    for i in abc:
        int_abc = ord(i)
        int_abc = int_abc + n
        if int_abc > 122:
            int_abc = int_abc - 26
            ans+=(chr(int_abc))
        if int_abc > 97:
            int_abc = int_abc - 26
            ans+=(chr(int_abc))
        else:
            ans+=(chr(int_abc))

    return ans
```

### 배운것

● 각 문자열을 하나씩 쪼개서 아스키코드로 변환해야하기때문에 list(s)로 치환해서 담았다.

● 대문자일 경우와 소문자일 경우의 범위가 다르니깐 구분해줘야한다.

● ord()  함수 : 특정한 한 문자를 아스키 코드 값으로 변환해 주는 함수

● chr()  함수 : 아스키 코드 값을 문자로 변환해 주는 함수 ( 10진수, 16진수 사용 가능 )

● string.ascii_lowercase :  소문자에 해당하는 ASCII 값

● string.ascii_uppercase : 대문자에 해당하는 ASCII 값

● % 26 하는이유 : Z 또는 z의 범위를 넘어가지 않기 위해서

● 공백을 밀어 무시한다.

●  ""을 기준으로 join하여 return 하는 문법까지 체크!