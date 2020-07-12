package com.yettsyjknapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedStrings {
	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		// String built onto nth value modulo by length of String and get back the
		// remainder and have to locate the substring
		long wholeList = n / s.length();
		int remainder = (int) (n % s.length());// cast int to utilize substring
		long found = 0;
		// 9 characters less than 10. 10 % 3 will give us 1 so grab the first character
		// we are checking for 'a'
		// substring is part of the initial count cast int to utilize substring()
		// one for loop with two variables
		for (char ch : s.toCharArray()) {
			if (ch == 'a') {
				found++;// keep track of String
			}
		}
		long total = found * wholeList;
		if (remainder == 0) {
			return total;
		} else {
			String partList = s.substring(0, remainder);
			for (char ch : partList.toCharArray()) {
				if (ch == 'a') {
					total++;
				}
			}
		}
		return total;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}
