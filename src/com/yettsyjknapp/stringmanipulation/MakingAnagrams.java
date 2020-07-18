package com.yettsyjknapp.stringmanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MakingAnagrams {
	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	int[] elementCount = new int[26];
    	int result = 0;
    	for(char ch : a.toCharArray()) {
    		elementCount[ch - 'a']++;
    	}
    	for(char ch : b.toCharArray()) {
    		elementCount[ch = 'a']--;
    	}
    	for(int i : elementCount) {
    		result += Math.abs(i);
    	}
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
