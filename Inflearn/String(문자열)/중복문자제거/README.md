# [문제 주소](https://programmers.co.kr/learn/courses/30/lessons/42883)

## 문제 접근 방법

문제 파악 => ArrayList를 통해 for문을 돌리고 똑같은 값의 유무를 통해 제거하려했지만 오산이었다. 

<br>자기 위치와 자기랑 같은 문자의 위치가 다르다?? 그러면 제거하는 아주똑똑한방법이 있었다.


### 코드

```python
package String_Ex;

import java.util.Scanner;

/**
 * @author dohyun
 * 
 *         소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요. 중복이 제거된 문자열의 각
 *         문자는 원래 문자열의 순서를 유지합니다.
 * 
 */

class Solution5 {
	public String solution5(String str) {
		String answer = "";
		// 자기 위치와 자기랑 같은 문자의 위치가 다르다?? 그러면 제거하는 아주똑똑한방법이 있었다.
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if (str.charAt(i) == str.indexOf(str.indexOf(i))) {
				answer += str.charAt(i);
				System.out.println(answer);
			}
		}

		return answer;

	}

	public static void main(String[] args) {
		Solution5 t = new Solution5();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println("==정답==");

		System.out.print(t.solution5(str));

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

