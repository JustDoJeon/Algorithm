package Excercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

//단어 뒤집기 2 문제 
public class BackJoon_17413 {

	private static void print(BufferedWriter bw, Stack<Character> stack) throws IOException {
		while (!stack.isEmpty()) {
			bw.write(stack.pop());
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		boolean tag = false;

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '<') {
				// 태그 안으로 들어왔으니깐 flag를 true로 바꿔준다.
				tag = true;
				// 그동안 stack에 쌓은 단어들을 스택이 빌때까지 비워준다.
				print(bw, st);
				// 그 단어 그대로 출력
				bw.write(s.charAt(i));
			} else if (s.charAt(i) == '>') {
				tag = false;
				bw.write(s.charAt(i));
			} else if (tag) {
				// 태그 안일경우 그단어 그대로 출력
				bw.write(s.charAt(i));
			} else {
				// 태그 바깥일 경우
				// 공백이면
				if (s.charAt(i) == ' ') {
					print(bw,st);
					bw.write(s.charAt(i));
				} else { //공백이 아니면 stack에 넣어준다 
					st.push(s.charAt(i));
				}
			}
		}
		// 반복이 끝나고 마지막일 경우 그동안 스택에 쌓인 단어들을 스택이 빌 때까지 비워준다. 
		print(bw, st);

		bw.flush();
		bw.close();
		br.close();

	}
}