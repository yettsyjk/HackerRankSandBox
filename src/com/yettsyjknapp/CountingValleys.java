



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

public class CountingValleys {
	
	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	//Our goal is to count the number of valleys
    	//Let level be a variable denoting the current altitude
    	//If we take a step upwards 'U', level is incremented by one 'D'; if we take step downwards, level is decremented by one.
    	//level variables is -  at the beginning and end of the hike
    	//number of valleys can be counted as the number of steps taken upwards to sea level
    	int num_valleys = 0;
    	int altitude = 0;
    	//loop through String
    	for(int i = 0; i <n; i++) {
    		if (s.charAt(i) == 'U') {//check the current character iin the string if it is equal to 
    			if(altitude == -1) {
    				num_valleys++;//we get to altitude, we increment 1 valleys got back to sea level
    			}
    			altitude++;
    		}
    		if (s.charAt(i) == 'D' ) {
    			altitude--;
    		}
    	}
    	return num_valleys;
    }
	
	
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));//Exception thrown at this line if you don't have 
        //this line can't be replaced as it is used within Hackerrank environment to run tests////
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int result = countingValleys(n, s);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }

}
