package StringArrayAgain;

//2020-08-17

public class LicenseKeyFormattion_Again {
	public static void main(String[] args) {

		String input = "8F3Z-2e-9-w";
		int k = 4;

		solve(input, k);

	}

	public static void solve(String input, int k) {

		String newStr = input.replace("-", "");
		System.out.println(newStr);

		newStr = newStr.toUpperCase();
		System.out.println(newStr);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < newStr.length(); i++) {
			sb.append(newStr.charAt(i));
		}

		for (int i = k; i < newStr.length(); i = i + k) {
			sb.insert(newStr.length() - i, "-");
		}

		System.out.println(sb.toString());

	}
}
