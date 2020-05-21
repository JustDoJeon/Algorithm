//package StringArray;
//
//public class PlusOne {
//
//	public static void main(String[] args) {
//		PlusOne a = new PlusOne();
////		int[] input = { 1, 2, 3 };
//		int[] input = { 9, 9, 9 };
//		int[] output = a.plusOne(input);
//
//		for (int i : output) {
//			System.out.print(i+ " ");
//		}
//
//	}
//
//	public static int[] plusOne(int[] digits) {
//
//		for (int i = digits.length - 1; i >= 0; i--) {
//			if (digits[i] != 9) {
//				digits[i]++;
//				break;
//			} else {
////				9가 있으면 끝자리에 0을넣음
//				digits[i] = 0;
//			}
//		}
//		// 0,0,0이 된거 -> 1000만들어야댐
//		if (digits[0] == 0) {
//			int[] result = new int[digits.length + 1];
//			result[0] = 1;
//			return result;
//		}
//
//		return digits;
//	}
//
//}
