# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/42883)

## 문제 접근 방법

문제 파악 => ArrayList를 통해 for문을 돌리고 똑같은 값의 유무를 통해 제거하려했지만 오산이었다. 

<br>자기 위치와 자기랑 같은 문자의 위치가 다르다?? 그러면 제거하는 아주똑똑한방법이 있었다.


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

### 내가 시도 해본코드  OR 다른 풀이

```python
#다른풀이
import java.util.*;
public class Main{
  public static String solution(String str) {
	  String answer="";
	  //문자를 카운트한다.
	  //문자가 2개 이상일 경우 그 문자를 지운다.
	  ArrayList<Character> list = new ArrayList<>();
	  for(char a : str.toCharArray()) {
		  if(!list.contains(a)) {
			  list.add(a);
			  answer+=a;
		  }
	  }
	  return answer;
  }
  public static void main(String[] args){
	
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    
    System.out.print(solution(str)); 
  }
}
```

### 배운것

● indexOf

● ArrayList와 forEach 문 사용법 숙지하기 ( 혼자 시도해보다가 틀림)

● charAt으로 위치값들을 잘 파악해서 요리조리 드리블해보자

