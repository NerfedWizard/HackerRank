package com.loeln.totalX;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {
//		Solution sol = new Solution();
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(2);
		a.add(6);
		b.add(24);
		b.add(36);
//		b.add(96);

		System.out.println(Solution.getTotalX(a, b));
	}
}

class Solution {
	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

	private static int gcd(List<Integer> input) {
		int result = input.get(0);
		for (int i = 1; i < input.size(); i++) {
			result = gcd(result, input.get(i));
		}
		return result;
	}

	private static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	private static int lcm(List<Integer> input) {
		int result = input.get(0);
		for (int i = 1; i < input.size(); i++) {
			result = lcm(result, input.get(i));
		}
		return result;
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int count = 0;
		int x = lcm(a);
		int z = gcd(b);
		System.out.println("lcm " + x);
		System.out.println("gcd " + z);
		for (int i = x, j = 2; i <= z; i = x * j, j++) {
			if (z % i == 0) {
				count++;
			}
		}
		return count;
//		int cnt = 0;
//		for (int j = 1; j < a.size(); j++) {
//			for (int i = 0; i < b.size(); i++) {
//				int temp = b.get(i) % a.get(j - 1);
//				int temp2 = b.get(i) % b.get(0);
//				if (temp == 0) {
//					count++;
//				}
//				if (temp2 == 0) {
//					cnt++;
//				}
//			}
//		}
//		if (count != b.size()) {
//			return -1;
//		}
//		return count;
	}
}
