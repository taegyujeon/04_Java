package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 실습문제 1
	 */
	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			
			if(i%2 == 0) {
				sum += arr[i];
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합: "+sum);
		
	}
	
	
	
	/**
	 * 실습문제 2
	 */
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=9; i>0; i--) {
			arr[i] = i+1;
			
			if(i%2 == 1) {
				sum += arr[i];
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합: "+sum);
		
	}
	
	
	
	
	
	
}
