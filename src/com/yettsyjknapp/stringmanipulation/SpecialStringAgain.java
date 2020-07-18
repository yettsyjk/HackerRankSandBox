package com.yettsyjknapp.stringmanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpecialStringAgain {
	// all the characters are the same
	// all the characters except the middle one are the same
	// special substring
	// Complete the substrCount function below.
	static long substrCount(int n, String s) {
		long result = s.length();
		// aaaa repeat min 4 length s.charAt(1) == s.chart( 1 + 1 )
		// asasd charAt(i + pointer) == charAt( i - 1 )

		// iteration
		for (int i = 0; i < s.length(); i++) {
			// two cases
			int repeat = 0;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				repeat++;
				i++;
			}
			result += (repeat * (repeat + 1)) / 2;

			int pointer = 1;
			// for special characters
			while (i - pointer >= 0 && i + pointer < s.length() && s.charAt(i + pointer) == s.charAt(i - 1)
					&& s.charAt(i - pointer) == s.charAt(i - 1)) {
				result++;
				pointer++;
			}

		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		long result = substrCount(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
