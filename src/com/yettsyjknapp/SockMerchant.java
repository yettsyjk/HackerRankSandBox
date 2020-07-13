package com.yettsyjknapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {
	 // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	//O(n)
    	HashSet<Integer> setOfSocks = new HashSet<Integer>();
    	int counter = 0;
    	for(int i =0; i < n; i++) {
    		int element = ar[i];
    		if (setOfSocks.contains(element)) {
    			setOfSocks.remove(element);
    			counter++;
    		} else {
    			setOfSocks.add(element);
    		}
    	}
    
    	return counter;

    }
	
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));//Exception thrown at this line if you don't have 
	        //this line can't be replaced as it is used within Hackerrank environment to run tests////
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	        int result = sockMerchant(n, ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	
	

}
