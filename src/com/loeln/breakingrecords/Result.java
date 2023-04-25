package com.loeln.breakingrecords;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {
//		Solution sol = new Solution();
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(10);
		scores.add(5);
		scores.add(20);
		scores.add(20);
		scores.add(4);
		scores.add(5);
		scores.add(2);
		scores.add(25);
		scores.add(1);
//		scores.add(42);
//		scores.add(3);

		System.out.println(Solution.breakingRecords(scores));
	}

}

class Solution {

	public static List<Integer> breakingRecords(List<Integer> scores) {
		int score = scores.get(0);
		Integer high = 0;
		Integer low = 0;
		for (Integer i : scores) {
			if (i > score) {
				score = i;
				high++;
			}
		}
		score = scores.get(0);
		for (Integer i : scores) {
			if (i < score) {
				score = i;
				low++;
			}
		}
		List<Integer> newScores = new ArrayList<Integer>();
		newScores.add(high);
		newScores.add(low);
		return newScores;
	}
}
