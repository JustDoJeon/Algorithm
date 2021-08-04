# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/42883)

## 문제 접근 방법

문제 파악 => 입력된 n 횟수만큼 문자열을 받고 문자열을 각각 뒤집어서 출력하면된다. !


### 코드

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

class Solution3 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();

		// 단어안에서 특정문자만 역으로 바꾸라는건 reverse()라고 쓰면안된다.
		// ex) study라면 lt, rt 라는 맨왼쪽과 맨 오른쪽의 인덱스 구분 문자를 두어 바꿔줌
		for (String x : str) {
			char[] s = x.toCharArray();
			int lt = 0; // 0번 인덱스부터
			int rt = x.length() - 1; // 4번 인덱스부터
			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}

		return answer;

	}

	public static void main(String[] args) {
		Solution3 t = new Solution3();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}

		System.out.println("==정답==");

		for (String x : t.solution(n, str)) {
			System.out.println(x);
		}

	}

}

```

### 내가 시도 해본코드 

```python
// StringBuilder 클래스의 도움을 받았다..

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

class Solution3 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();

		for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}



	public static void main(String[] args) {
		Solution3 t = new Solution3();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}

		System.out.println("==정답==");

		for (String x : t.solution(n, str)) {
			System.out.println(x);
		}

	}

}

```

### 배운것

● StringBuilder의 사용과 제공 메소드 

● 문자열을 배열화 하고 인덱스를 통한 위치교환 알고리즘

●  String클래스의 valueOf() 메소드
