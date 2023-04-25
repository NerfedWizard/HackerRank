package com.loeln.birthdaybar;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {
		List<Integer> bar = new ArrayList<Integer>();
		bar.add(1);
		bar.add(1);
		bar.add(1);
		bar.add(1);
		bar.add(1);
		bar.add(1);
		int sum = 3;
		int num = 2;
//		bar.add(null);
//		bar.add(null);
//		bar.add(null);
//		bar.add(null);
//		bar.add(null);
		System.out.println("Final: " + Solution.birthday(bar, sum, num));
	}

}

class Solution {
	public static int birthday(List<Integer> bar, int sum, int num) {
		int total = 0, tally = 0;
		for (int i = 0; i < num; i++) {
			total += bar.get(i);
		}
		for (int i = 0; i < bar.size() - num + 1; i++) {
			if (total == sum) {
				tally++;
			}
			if (i + num < bar.size()) {
				total = total - bar.get(i) + bar.get(i + num);
			}
		}
		return tally;
	}
}
//		int[] sums = new int[bar.size()];
//		for (int i = 0; i < bar.size(); i++) {
//			sums[i] = bar.get(i);
//		}
//		IntStream list = null;
//		int tally = 0;
//		for (int i = 0; i <= sum - num; i++) {
//			list = Arrays.stream(sums, i, i + num);
//			list.forEach(System.out::println);
//			int x = list.sum();
//			list.
//			System.out.println("x: " + x);
//			if (x == sum) {
//				tally += 1;
//			}
//			list.forEach(System.out::println);
//			if (Arrays.stream(sums, i, i + num).sum() == sum) {
//				System.out.println("i: " + i + " sums[i]: , sums[i+1]: " + sums[i] +" + " + sums[i + 1] + " = "
//						+ Arrays.stream(sums, i, i + num).sum());
//				tally++;
//			}
//
//		}
//		list.forEach(System.out::println);
//		return tally;
//	}
//}
//		if (num > 12 || bar.size() < num || sum > 31 || bar.size() == 0) {
//			return 0;
//		}
//		int tally = 0;
//		int count = 0;
//		int j = 0;
//		for (int i = 0; i < bar.size(); ++i) {
//			Integer temp = bar.get(i);
//			sums.add(i % num, temp);
//			System.out.println("temp: " + temp);
//			if (j < num) {
//				count = count + sums.get(i % num);
//				System.out.println("J: " + j + " Count: " + count);
//			}
//			if (j > num) {
//				count = 0;
//				j = 0;
//			}
//			if (count == sum) {
//				System.out.println("Count: " + count + " Sum: " + sum);
//				count = 0;
//				j = 0;
//				tally++;
//			}
//			j++;
//		}

//System.out.println(j + "inside first for temp= " + temp + " j%num=" + j % num);
//if (j < num) {
//	sums.add(i,temp);
//	System.out.println("Inside if j= " + j);
//	j++;
//} else if (j == num) {
//	for (int p = j; p > 0; p--) {
//		count = count + k;
//		System.out.println("2nd for count= " + count);
//	}
//	if (count != sum) {
//		count = 0;
//	}
//	j = 0;
//}
//
//}
//for (int i : sums)
//System.out.println(i);
