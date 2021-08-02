# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/42883)

## 문제 접근 방법

문장에서 가장 긴 단어를 골라서 반환하는 솔루션을 만드는 문제 , " " 단위로 끊어서 문자열의 길이를 특정값과 비교하여 가장 긴 길이의 문자일때 answer로 반환하는 코드를 만들었다 !


### 코드

```python
package String_Ex;

import java.util.Scanner;

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

		int m = Integer.MIN_VALUE, pos;
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		// 위 논리면 마지막단어는 tmp에 못들어감
		if (str.length() > m) {
			answer = str;
		}
		return answer;

	}
}

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

● 로직을 정확히 이해해야 indexOf와 subString 의 사용을 문자열에서 적용할듯... 마지막 단어가 tmp에 안들어가는것 까지 체크하기 
