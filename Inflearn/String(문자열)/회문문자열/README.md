# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/42883)

## 문제 접근 방법

문제 파악 => 입력된 n 횟수만큼 문자열을 받고 문자열을 각각 뒤집어서 출력하면된다 + 특정 조건에 맞춰서 문자를 뒤집어서 출력합니다.


### 코드

```python
package String_Ex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dohyun
 * 
 *         /* 설명 : 주어진 문자열에서 알파벳만 뒤집어서 출력합니다.
 */

class Solution4 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = s.length - 1;

		while (lt < rt) {
			// 알파벳인지 알수있는거 Character 클래스의 메소드 사용!
			if (!Character.isAlphabetic(s[lt])) {
				lt++; // 알파벳이 아닐때 lt를 1증가
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}

		answer = String.valueOf(s);

		return answer;

	}

	public static void main(String[] args) {
		Solution4 t = new Solution4();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println("==정답==");

		System.out.println(t.solution(str));

	}

}

```

### 내가 시도 해본코드 

```python
package String_Ex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dohyun
 * 
 *         /* 설명 :N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요 단어는 알파벳으로만 구성되어있습니다.
 * 
 *         출력 N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */

class Solution4 {
	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = s.length - 1;

		while (lt < rt) {
			// 알파벳인지 알수있는거 Character 클래스의 메소드 사용!
			if (!Character.isAlphabetic(s[lt])) {
				lt++; // 알파벳이 아닐때 lt를 1증가
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}

		answer = String.valueOf(s);

		return answer;

	}

	public static void main(String[] args) {
		Solution4 t = new Solution4();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println("==정답==");

		System.out.println(t.solution(str));

	}

}

```

### 배운것

● Character 클래스의 메소드를 이용한 알파벳여부 참 거짓 판단..

● 문자열을 배열화 하고 인덱스를 통한 위치교환 알고리즘 (전과 동일 복습)

●  String클래스의 valueOf() 메소드 (전과 동일 복습)

● 푸는데 오래걸려서 참고했으므로 내가 쓴 답과 정답 동일하게 올렸습니다.
