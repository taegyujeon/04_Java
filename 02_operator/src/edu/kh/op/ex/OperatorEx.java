package edu.kh.op.ex;

import java.util.Scanner; // Scanner 클래스(설계도)가져오기

/**
 * 기능용(예제) 클래스
 */

public class OperatorEx {
	
	// 메서드(기능)호출 테스트
	public void test() {
		System.out.println("다른 클래스에 작성된 기능");
	}
	
	
	
	/**
	 * 입력 받은 정수가 3의 배수가 맞는지 확인
	 */
	public void method1() {
		
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// boolean 변수 이름 보통 앞에 is 단어 붙임
		boolean isTrue = input % 3 == 0;
		
		System.out.printf("%d는 3의 배수 :  %b \n", input, isTrue);
	}
	
	
	
	
	/**
	 * 첫 번째 입력 받은 수가
	 * 두 번째 입력 받은 수의 배수가 맞는지 확인
	 */
	public void method2() {
		 
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int input1 = scanner.nextInt();

		System.out.print("두 번째 수 입력 : ");
		int input2 = scanner.nextInt();
		
		boolean isTrue = input1 % input2 == 0;
		
		System.out.printf("%d는 %d의 배수가 맞는가? %b",input1,input2,isTrue);
		
	}
	
	
	/**
	 * 입력 받은 정수가 짝수인지 홀수인지 판별
	 * <pre>
	 * 정수 입력 : {입력값}
	 * {입력값}은 짝수/홀수 입니다
	 * </pre>
	 * 
	 */
	public void method3() {
		
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 삼항연산자 : 조건식?참:거짓;
		
		String result = input % 2 == 0  ?"짝수" : "홀수";
		
		System.out.printf("%d 은/는 %s 입니다.",input,result);
	}
	
	
	
	/** [홀짝 검사기 v2]
	 * <p>입력 받은 정수가 홀수 또는 짝수 또는 0인지 판별</p>
	 * 
	 * <pre>
	 * 정수 입력 : 0
	 * 0입니다
	 * ------------------
	 * 정수 입력 : 4
	 * 짝수 입니다
	 * ------------------
	 * 정수 입력 : 7
	 * 홀수 입니다
	 * </pre>
	 * 
	 */
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = (input == 0) ? "0" :(input % 2 == 0 ?"짝수" : "홀수");
		
//	boolean isZero = input == 0; // 0인지 검사
//	boolean isTrue = input % 2 == 0; // 짝수/홀수 검사
//	String result = isZero ? "0" : ( isTrue ? "짝수" : "홀수" );
//		System.out.println(result + " 입니다");

		
		System.out.printf("%s 입니다", result);
		
	}
	
	
	
	
	
	
}








































