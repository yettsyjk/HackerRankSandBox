package com.yettsyjknapp.hashmaps;

import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {
	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		HashMap<String, Integer> magOfWords = new HashMap();
		
		// length magazine array of strings each word in the magazine
		// lower and upper
		if ((magazine.length == 0 || note.length == 0) || (magazine.length > 30000 || note.length > 30000)) {
			System.out.println("Not good magazine note");
			return;
		}
		for (int i = 0; i < magazine.length; i++) {
			if (magOfWords.get(magazine[i]) != null) {
				 int counter = magOfWords.get(magazine[i]);//
				magOfWords.put(magazine[i], counter++);// key: ("hello", 2) is value of 2
			} else {
				magOfWords.put(magazine[i], 1);// if the key is not there then start at value 1
			}
		} // iterate through the note
		for (int j = 0; j < note.length; j++) {
			if (magOfWords.get(note[j]) == null) {
				System.out.println("Not good ransom note");
				return;
			} else if (magOfWords.get(note[j]) != null) {
				int count = magOfWords.get(note[j]);
				if (magOfWords.get(note[j]) > 0) {
					magOfWords.put(note[j], count--);
				} else {
					System.out.println("It didn't work");
					return;
				}
			}
		}
		System.out.println("It worked");

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
