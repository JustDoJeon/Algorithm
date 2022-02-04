package Programmers.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//행렬의 덧셈 
public class 행렬의덧셈 {
	public static void main(String[] args) {

		int[][] arr1 = { { 1 }, { 2 } };

		int[][] arr2 = { { 3 }, { 4 } };

		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println("arr1[i][j] : " + arr1[i][j]);
				System.out.println("arr2[i][j] : " + arr2[i][j]);
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (

				int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[0].length; j++) {
				System.out.println(answer[i][j]);
			}
		}

	}
}
