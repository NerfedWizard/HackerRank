package com.loeln.kangaroo;

import java.util.Random;

public class Result {

	public static void main(String[] args) {
		Solution sol = new Solution();
//		Scanner scn = new Scanner(System.in);
//		int[] n = new int[4];
//		System.out.println("Whats your numbers? ");
//		int i = 0;
		Random rand = new Random();
		rand.nextInt(10000 - 0);
		rand.nextInt(10000 - 0);
		rand.nextInt(10000 - 0);
		rand.nextInt(10000 - 0);

//		System.out.println("With randoms: " + sol.kangaroo(x1, v1, x2, v2));
//		System.out.println(sol.answer(x1, x2, v1, v2));
		System.out.println(sol.answer(2564, 5393, 5121, 2836));
	}

}

class Solution {

	public String answer(int posA, int movA, int posB, int movB) {
		System.out.println("Starting Answer numbers " + posA + " " + movA + " " + posB + " " + movB);
		int totalA = posA + movA;
		int totalB = posB + movB;
		int count = 0;
		if (totalA == totalB) {
			return "YES";
		}
		while (totalA != totalB || count > 10000) {
			int tempA = totalA;
			int tempB = totalB;
			totalA = tempA + movA;
			totalB = tempB + movB;
			if (totalA < 0 || totalB < 0) {
				System.out.println("Somehow total is negative");
				return "NO";
			}
			if (totalA == totalB) {
				System.out.println("Meeting point: \nA " + " " + tempA + " + " + movA + " = " + totalA + "\nB " + " "
						+ tempB + " + " + movB + " = " + totalB);
				return "YES";
			}
			count++;
		}

		return "NO";
	}

	public String kangaroo(int x1, int v1, int x2, int v2) {
//		System.out.println("Actual Solution: " + x1 + " " + v1 + " " + x2 + " " + v2);
		if (v1 > v2) {
			return "YES";
		} else if (x1 > x2) {
			return "YES";
		} else if (x1 == x2 && v1 == v2) {
			return "YES";
		}
		return "NO";

	}
}
