# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/42883)

## 문제 접근 방법

파이썬의 리스트를 활용해서 min값을 k개수만큼 pop하고 오름차순이나 내림차순으로 계산하면 되겠다싶었다.

그런데 return 값이 3234, 775841인걸 보고 뭐지... 4332 가 더 큰거 아닌가라고 생각이들고 문제를 다시 읽었다.

맞는데...? 라고 생각하다가 아 number의 순서를 유지해야하나? 하고 코드를 검사하니깐 테스트케이스 3번에서 걸렸다 ( number = " 4177252841 " ,   k = "4")

문제가 좀 이상한거 같다....가 아니라 배울게 많았다

조건에 따른 리스트 활용능력을 높여야겠따


### 코드

```python
# 큰 수 만들기 프로그래머스 LV2

# k개를 뺏을때 가장큰수가 나와야함

def solution(number, k):
    collected = []

    for (i,num) in enumerate(number):
        while collected and collected[-1] < num and k >0:
            print("!!!!")
            collected.pop()
            k -= 1

        if k ==0:
            collected += number[i:]
            break

        print("!!???!")
        collected.append(num)
    # k가 0보다 크면 collected에서 k개까지만 넣는거 이해안되면 밑에 예시설명있음
    collected = collected[:-k] if k>0 else collected
    answer = "".join(collected)
    return answer
number = "4177252841"
k =4

print(solution(number,k))
```

### 내가 시도 해본코드 

```python
def solution(number, k):
    answer = ''
    big = list(number)
    ans = []

    for _ in range(k):
        big.remove(min(big))
    

    for i in big:
        answer += i


    # print(answer)


    return answer

```

### 배운것

● enumerate 함수

- 리스트가 있는 경우 순서와 리스트의 값을 전달하는 기능을 가집니다.
- 이 함수는 순서가 있는 자료형(list,set,tuple,dictionary,string)을 입력으로 받아 인덱스 값을 포함하는 enumerate 객체를 리턴합니다.
- 보통 for문과 함께 사용됩니다.

● number = [1,2,3,4,5] 라고하면 number=[-1] 는 리스트의 마지막원소를 뜻합니다.

● number =  [1,2,3,4,5] , k= 2 라고하면

number[:-k] 는 1,2,3 끝에서 k개만큼 빠지고 넣는거 

[ 참 고 ]

![image-20201127224502113](C:\Users\DoHyun\AppData\Roaming\Typora\typora-user-images\image-20201127224502113.png)