package com.loeln.sumpairs;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(1);
		list.add(2);
//		list.add(1);
//		list.add(1);
//		list.add(1);
//		list.add(1);
//		list.add(1);
		System.out.println(Solution.divisibleSumPairs(list.size(), 3, list));
	}

}

class Solution {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int tally = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int x = (ar.get(i) + ar.get(j)) % k;
				if (x == 0) {
					tally++;
				}
			}
		}
		return tally;
	}
}