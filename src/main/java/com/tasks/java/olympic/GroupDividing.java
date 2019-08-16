package com.tasks.java.olympic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroupDividing {
	public static void main(String[] args) {
		boolean groupCompleted = false;
		int groupCount = 1;
		int num = 0;
		int n2= 1;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num = sc.nextInt();
		List<Integer> groupMatrix = new ArrayList<>();
		while(n2<=num){
			n2=n2*2;
			System.out.println(n2);
			System.out.println(k);
			k=k+1;
			System.out.println(k);
		}
/*		for(int i = 1; i <= num; i++) {
			if(i == 1) {
				groupMatrix.add(i);
				printGroup(groupCount, groupMatrix);
				groupMatrix.clear();
				groupCount++;
			} else if(groupMatrix.size() > 1) {
				for(Integer c : groupMatrix) {
					if(c == i || i % c == 0) {
						printGroup(groupCount, groupMatrix);
						groupMatrix.clear();
						groupMatrix.add(i);
						groupCount++;
						break;
					}
				}
			}
			else if((i) % (i - 1) == 1 || i == 2) {
				groupMatrix.add(i);
			}
		}*/
	}

	static void printGroup(int groupNumber, List<Integer> groupList) {
		System.out.println(groupNumber + " group contain next number :" + Arrays.deepToString(groupList.toArray()));
	}
}
