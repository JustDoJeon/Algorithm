package Programmers.level2;

public class 카카오_문자열압축 {

	public static void main(String[] args) {

		String str = "aabbaccc";
		String str2 = "ababcdcdababcdcd";
		System.out.println(compression(str2));
	}

	public static int compression(String s) {
		int answer = s.length();

		for (int i = 1; i < s.length() / 2; i++) {
			int ptr = 0;

			// 단위가 i일때 압축되는 길이를 저장할 변수
			int tempLeng = s.length();

			// ptr위치부터 ptr+1이전까지 잘라서 unit에 저장한다.
			for (; ptr + i <= s.length();) {
				String unit = s.substring(ptr, ptr + i);
				ptr += i;
				// count는 현재 단위 문자열 unit이 몇개나되는지 저장
				int count = 0;

				// 단위 문자열인 unit부터 다음 i개 문자가 일치하는지 확인한다.
				for (; ptr + i <= s.length();) {
					// unit과 unit다음 i개의 문자가 일치하면 count를 증가시킨다.
					if (unit.equals(s.substring(ptr, ptr + i))) {
						count++;
						ptr += i;
					} else {
						// 만약 unit과 다르다면 다음i개의 문자로 갱신하기 위해 반복문을 빠져나간다.
						break;
					}
				}

				// unit을 갱신하기 전에 이번 unit으로 몇개나 반복되었는지 확인하고, 압축된 길이만큼 tempLeng길이 감소
				if (count > 0) {
					tempLeng -= i * count;
					// 반복된 글자수 만큼 숫자가 들어가기 때문에 tempLeng은 삽입되는 숫자 갯수만큼 다시 증가한다.
					// count++ 이유 : count가 9라면 실제로는 unit + unit*9 이므로 10unit으로 표현됨
					count++;
					while (count > 0) {
						count /= 10;
						System.out.println("tempLeng : " + tempLeng);
						tempLeng++;
					}
				}
			}

			// unit의 길이가 i일때 압축가능한 길이와, 이전 answer에 저장되어있던 이전 최소압축길이를 비교해 answer를 갱신한다.
			answer = Math.min(answer, tempLeng);

		}

		return answer;

	}

}
