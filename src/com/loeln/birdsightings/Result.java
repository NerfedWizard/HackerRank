package com.loeln.birdsightings;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
//		list.add(4);
//		list.add(3);
//		list.add(2);
//		list.add(1);
//		list.add(3);
//		list.add(4);
//		list.add(2);
//		Solution.migratoryBirds(list);
		System.out.println("Final: " + Solution.migratoryBirds(list));
	}

}

class Solution {
	public static int migratoryBirds(List<Integer> arr) {
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		int x5 = 0;
		int index = 0;
		int[] types = { x1, x2, x3, x4, x5 };
		for (int i = 0; i < arr.size(); i++) {
			switch (arr.get(i)) {
			case 1:
				x1++;
				types[0] = x1;
				break;
			case 2:
				x2++;
				types[1] = x2;
				break;
			case 3:
				x3++;
				types[2] = x3;
				break;
			case 4:
				x4++;
				types[3] = x4;
				break;
			case 5:
				x5++;
				types[4] = x5;
				break;
			}
		}
		int max = 0;
		for (int i = 0; i < types.length; i++) {
			if (max < types[i]) {
				max = types[i];
				index = i + 1;
			}
		}
		return index;
	}
}
//		for (int i : arr) {
//			copy.add(i);
//		}
//		Collections.sort(arr);
//		int tally = 0;
//		for (int i = arr.size() - 1; i >= 0; i--) {
//			if (arr.get(i) != x) {
//				x = arr.get(i);
////				System.out.println(x);
//				tally = 1;
//			} else {
//				tally++;
//			}
//			typeCount[i] = x;
////			typeCount.add(i,tally);
//		}
//		for (int  i : typeCount) {
//				System.out.println(i);
//			}
//		int index = copy.indexOf(x);
