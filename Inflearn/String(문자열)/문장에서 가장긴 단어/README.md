# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/42883)

## 문제 접근 방법

문장에서 가장 긴 단어를 골라서 반환하는 솔루션을 만드는 문제 , " " 단위로 끊어서 문자열의 길이를 특정값과 비교하여 가장 긴 길이의 문자일때 answer로 반환하는 코드를 만들었다 !


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
package String_Ex;

import java.util.Scanner;

//이 방법도 정답이지만 위에 indexOf를 사용하는 방법도 숙지할 것

public class Solution1_2 {

	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("정답은?");
		System.out.println(t.solution(str));

	}

}

class Main {
	public String solution(String str) {
		String answer = "";

		int m = Integer.MIN_VALUE;

		String[] strArr = str.split(" ");
		for (String x : strArr) {
//			System.out.println(x);
			int len = x.length();
			if (len > m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}

}


```

### 배운것

● indexOf의 사용

● split로 공백구분 후 문장의 문자들을 배열에 담으며 비교하는 방법

● 가장 큰 수 구하는 알고리즘 체크하기 


