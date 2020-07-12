
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

public class JumpingClouds {
	

	

	    // Complete the jumpingOnClouds function below.
	    static int jumpingOnClouds(int[] c) {
	    		//loop through the array
	    	int numJumps = 0;
	    	int i = 0;
	    	while( i < c.length - 1) {//increment by different amounts
	    		if( (i + 2 == c.length) || c[i + 2] == 1) {//if you are the second to the last element and there is a zero at the end 
	    			//if we see a 1 two spaces away then we only have to jump those two spaces
	    			i++;
	    			numJumps++;
	    		}else {
	    			i +=2;//jump every case spaces by two
	    			numJumps++;
	    		}
	    	}
	    	return numJumps;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));//Exception thrown at this line if you don't have 
	        //this line can't be replaced as it is used within Hackerrank environment to run tests////
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] c = new int[n];

	        String[] cItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cItems[i]);
	            c[i] = cItem;
	        }

	        int result = jumpingOnClouds(c);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }




}
