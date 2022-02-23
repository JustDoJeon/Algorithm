package Algo_Study.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 수정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);

//		System.out.println(list);
		
		for(int val : list) {
			sb.append(val +"\n");
		}
		
		System.out.println(sb);

	}
}
