package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx {
	
  //필드 (객체의 속성 == 객체의 변수)
	
	// import java.util.Scanner;
	// Scanner 객체 작성
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 1부터 10까지 출력하기
	 */
	
	public void method1(){
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * 첫 번째 입력 받은 수 부터
	 * 두 번째 입력 받은 수 까지 
	 * 1씩 증가하며 출력하기
	 */
	public void method2() {
		System.out.print("입력 (1 2) : "); 
		int input1 = sc.nextInt(); // 첫 번째 입력
		int input2 = sc.nextInt(); // 두 번째 입력
		
		for(int i = input1; i<= input2; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * 10부터 1까지 1씩 감소하며 출력
	 */
	
	public void method3() {
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	/**
	 * 두 수를 입력 받아서 반복 출력하는 구문을 작성
	 * 
	 * (첫 번째 입력 A, 두 번째 입력 B)
	 * 
	 * 조건 1 : B가 A보다 큰 경우 -> A ~ B 까지 1씩 증가하며 출력
	 * 
	 * 조건 2 : A가 B보다 큰 경우 -> A ~ B 까지 1씩 감소하며 출력
	 * 
	 * 조건 3 : A와 B가 같다면 -> "같은 수 입력됨"
	 */
	public void method4() {
		System.out.print("입력 (1 2) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b) { // 조건 3
			System.out.println("같은 수 입력됨");
			return; // 현재 메서드 종료 후 호출한 곳으로 돌아감
		}
		
		
		if(b > a) { // 조건 1
			for(int i = a ; i <= b ; i++) {
				System.out.println(i);
			}
			
		} else { // 조건 2
			for(int i = a ; i >= b ; i--) {
				System.out.println(i);
			}
		}
	}
	
		
		/**
		 * 두 수를 입력 받아 1씩 증가하며 반복 출력하기
		 * 
		 * (첫 번째 입력 A, 두 번째 입력 B)
		 * 
		 * - 입력 받은 두 수 중
		 *   작은 값이 초기식 , 큰 값이 조건식에 사용되게 작성
		 *   (같은 경우는 초기식 A, 조건식 B)
		 */
		public void method5() {
			System.out.print("입력 (1 2) : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b >= a) {
				for(int i=a; i<= b; i++) {
					System.out.println(i);
				}
			} else {
				for(int i=b; i<=a; i++) {
				System.out.println(i);
			}
		}
	}
		
		
		/*
		 * 두수를 비교해서 최대,최소값 구하기
		 */
		public void method5a() {
			System.out.print("입력 (1 2) : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int min; //최소
			int max; //최대
			
			if (a<=b) { // 먼저 입력한 수가 작거나 같다면
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}
			
			for(int i=min; i<=max; i++) System.out.println(i);
		}
		
		
		/**
		 * 최대, 최소값 구하기 V2 (Math)
		 * - Java API 이용한 방법
		 */
		public void method5b() {
			System.out.print("입력 (1 2) : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int min = Math.min(a, b); // 두 수 중 작은 값을 반환
			int max = Math.max(a, b); // 두 수 중 큰   값을 반환
			
			for(int i=min ; i<=max ; i++) System.out.println(i);
		}
		
		
		/**
		 * 변수 값 교환(swap)
		 */
		public void method5c() {
			System.out.print("입력 (1 2) : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			
			for(int i=a ; i<=b ; i++) System.out.println(i);
			
		}
		
		/**
		 * 1부터 100사이 7의 배수의 개수 세기
		 */
		public void method6() {
			int count = 0;
			for(int i=1; i<=100; i++) {
				if(i % 7 == 0) count++; // i가 7의 배수인 경우 count 1 증가
			}
			
			System.out.println(count);
		}
		
		public void method6a() {
			int count = 0;
			for(int i=7; i<=100; i+=7) count++;
			
			System.out.println(count);
		}
		
		
		/**
		 * 1부터 100사이 정수중 
		 * 3의 배수의 개수
		 * 3의 배수를 제외한 수 들의 합 출력
		 */
		public void method7() {
			int count = 0;
			int sum = 0;
			for(int i=1; i<=100; i++) {
				if(i % 3 == 0) count++;
				else          sum += i;
			}
			System.out.println("3의 배수의 개수 : "+ count);
			System.out.println("3의 배수를 제외한 수들의 합 : "+ sum);
		}
		
		
		/**
		 * 구구단 5단 출력 하기
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 * 5 x 3 = 15
		 * ...
		 * 5 x 9 = 45
		 */
		public void method8() {
			int result = 0;
			for(int i=1; i<=9; i++) {
				result = 5 * i;
				System.out.println("5X"+i+"="+result);
			}
		}
		
//		public void method8() {
//			
//			for(int i=1 ; i<=9 ; i++) {
//				System.out.printf("5 x %d = %2d \n", i,  5 * i );
//			}
//			
//		}
		
		
		
		public void method8a() {
			System.out.print("단 수 입력 : ");
			int dan = sc.nextInt();
			int result = 0;
			for(int i=1; i<=9; i++) {
				result = dan * i;
				System.out.println(dan+"x"+i+"="+result);
			}
		}
	
	
	
	
	
	
	
}
	







































