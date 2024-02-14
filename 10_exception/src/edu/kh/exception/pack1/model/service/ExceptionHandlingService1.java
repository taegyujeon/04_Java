package edu.kh.exception.pack1.model.service;

import java.awt.print.PrinterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingService1 {

	private Scanner sc = new Scanner(System.in);
	/* Exception(예외) : 코드로 처리 가능한 에러
	 * 
	 * Exception Handling(예외처리) : Exception 발생 시 처리하는 구문
	 */
	
	
	/**
	 * 예외를 발생시키는 코드
	 */
	public void method1() {
		int[] arr = {10,20,30,40}; // 마지막 인덱스 == 3
		
		for(int i=0 ; i <= arr.length ; i++) { // i == 0 ~ 4
			System.out.println(arr[i]);
		}
		
		// 10
		// 20
		// 30
		// 40
		// 예외 발생(배열 인덱스 범위 초과)
		
		
		// java.lang.ArrayIndexOutOfBoundsException: 
		// Index 4 out of bounds for length 4
		
		/* 예외 발생 원리 */
		// 실행 중 예외 상황이 발생하는 경우
		// 예외 상황에 맞는 코드가 수행 되며
		// 지정된 예외 클래스를 찾아 객체로 만들어서 던짐
		// -> throw new ArrayIndexOutOfBoundsException();
		
	}
	
	/**
	 * 예외 발생 구문을 try-catch로 처리(예외처리)
	 * 
	 * -try{} : 예외가 발생할 것 같은(가능성이 있는) 코드를 시도하는 구문
	 * 
	 * -catch(예외){} :
	 * try구문 시도 중 예외가 발생되어 던져진 경우
	 * catch(예외)에 작성된 예외와 던져진 예외가 같으면
	 * 잡아서 {} 내 구문을 수행
	 * -> 발생된 예외를 잡아서 처리 했기 때문에 
	 *    프로그램이 멈추지 않고 정상 수행
	 */
	public void method2() {
		
		int[] arr = {10,20,30,40}; // 마지막 인덱스 == 3
		
		try { // 예외 발생할 것 같은 구문 시도
			
			for(int i=0 ; i <= arr.length ; i++) { // i == 0 ~ 4
				System.out.println(arr[i]);
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			// try에서 던져진
			// ArrayIndexOutOfBoundsException 객체를 잡아서 처리

			System.out.println("[예외 잡아서 처리함]");
		}
		
		
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
		System.out.println("프로그램 종료");
	}
		
		/**
		 * 예외 처리 구문 활용 예시
		 */
		public void method3() {
			
			System.out.println("[두 수를 입력 받아 나눈 몫 구하기]");
		
			System.out.print("정수입력1: ");
			int input1 = sc.nextInt();
			System.out.print("정수입력2: ");
			int input2 = sc.nextInt();

			// 0으로 나누는 경우
			// java.lang.ArithmeticException: / by zero
			// -> 산술적 예외 : 0으로 나눌 수 없음
			
			try {
				System.out.println("결과 : " + input1/input2);
			
			} catch(ArithmeticException e) {
				// try에서 던져지는 ArithmeticException 객체를
				// 매개 변수를 이용해 잡음
				
				if(input1 >= 0) System.out.println(Double.POSITIVE_INFINITY); //  Infinity           
				else						System.out.println(Double.NEGATIVE_INFINITY); // -Infinity
			}
		}
		
		/**
		 * catch 구문 여러 개 작성하기 1
		 */
		public void method4() {
			
			// java.util.InputMismatchException
			// - Scanner를 이용해서 int, long, float, double 등
			//  특정 자료형 형태의 문자를 입력 받으려고 했는데
			//  입력된 값이 다른 자료형일 경우 발생되는(던져지는) 예외
			
			System.out.println("[두 수를 입력 받아 나눈 몫 구하기]");
			
			int input1 = 0; // try 밖으로 뺌 
			int input2 = 0; // -> 왜? try 지역 변수라 catch에서 접근 불가
			
			try {
				System.out.print("정수 입력 1 : ");
				input1 = sc.nextInt();
				System.out.print("정수 입력 2 : ");
				input2 = sc.nextInt();
			
				System.out.println("결과 : " + input1/input2);
			
			} catch(InputMismatchException e) {
				// 입력 관련 예외가 먼저 발생할 가능성 + 자주 발생할 가능성
				// -> 먼저 처리 하는게 좋다!!
				
				System.out.println("입력이 올바르지 않습니다");
				
			} catch(ArithmeticException e) {
				
				if(input1 >= 0) System.out.println(Double.POSITIVE_INFINITY); //  Infinity           
				else						System.out.println(Double.NEGATIVE_INFINITY); // -Infinity
			}
		
		}
		
		/**
		 * catch 구문 여러 개 작성하기 2
		 * 1) throw : 예외 강제 발생(던짐)
		 * 2) 예외 + 다형성
		 * -catch문 여러개 작성 시
		 *  부모 예외를 처리하는 catch문이 자식 예외도 모두 잡아서 처리
		 *  -> 부모 예외는 아랫쪽에 작성해야 컴파일 에러가 없음
		 */
		public void method5() {
			int input = 0;
			
			do {
				try {
					System.out.println("[예외 강제 발생 시키기]");
				
				System.out.println("1. ArithmeticException");
				System.out.println("2. NullPointerException");
				System.out.println("3. ClassCastException");
				System.out.println("4. RuntimeException");
				System.out.println("0. 종료");
				
				System.out.print("예외 선택 >> ");
				input = sc.nextInt();
				// 잘못 입력 -> InputMismatchException 던져짐
				
				// throw new 예외(): 예외 강제 발생
				switch(input) {
				case 1 : throw new ArithmeticException();
				case 2 : throw new NullPointerException();
				case 3 : throw new ClassCastException();
				case 4 : throw new RuntimeException();
				case 0 : System.out.println("[프로그램 종료]"); break;
				default : System.out.println("[잘못 입력]");
				}
			} // try end
				
				// 부모 타입 예외 참조 변수 == 자식 타입 예외 객체
				// -> 다형성 업캐스팅(매개변수)
				
				// 자식 예외를 부모 catch문에서 모두 잡아서 처리하기 때문에
				// 자식 catch문 까지 코드가 도달 할 수 없다!(수행 불가, 죽은 코드)
				
			// -> 해결 방법 : 부모 catch를 자식 catch 밑에 작성!
//				catch(RuntimeException e) {
//					System.out.println("----- 실행 중 발생한 예외 처리 완료 -----");
//				}
				
				// Unreachable catch block : 도달할 수 없는 catch 구문
				catch(InputMismatchException e) {
					System.out.println("[잘못 입력]");
					
					// Scanner 입력 버퍼에 잘못 입력한 값이 남아있어
					// sc.nextInt() 구문이 계속 예외 발생!!
					// -> 입력 버퍼에 잘못 입력한 값 제거
					sc.nextLine(); 
					
					input = -1 ; // 첫 반복에서 종료되지 않게 input 수정
					
				}
				
				catch(ArithmeticException e) {
					System.out.println("----- 산술적 예외 처리 완료 -----");
				}
				
				catch(NullPointerException e) {
					System.out.println("----- 참조하는 객체가 없는데 참조 시도 처리 완료 -----");
				}
				
				catch(ClassCastException e) {
					System.out.println("----- 업/다운 캐스팅 실패 처리 완료 -----");
				}

				catch(RuntimeException e) {
					System.out.println("------- 실행 중 발생한 예외 처리 완료 -------");
				}
				
				
			}while (input != 0);
		}
		
		
		
		
		/**
		 * catch문에 부모 타입 예외 처리 구문 작성하기 (다형성)
		 * 
		 * Exception 클래스
		 * - 모든 예외의 최상위 부모 클래스
		 * 
		 * - catch문에 Exception으로 예외를 받기로 하면
		 *   발생되는 모든 예외를 잡아서 처리 할 수 있다!
		 */
		public void method6() {
			try {
				// 각종 예외 강제 발생(Illegal : 잘못된, Argument : 전달인자)
				// throw new IllegalArgumentException();
				
				// EOF : End Of File -읽어들인 파일 내용이 끝남
				// throw new EOFException();
				
				throw new PrinterException();
				
			}catch(Exception e) {
				System.out.println("예외 처리 완료");
			}
		
		
		// 혼자서 코드 연습, 나중에 리팩토링(고칠 예정)
		// -> 부모 타입 Exception으로 다 잡아서 처리(코드길이감소)
		
		// 파이널 프로젝트, 실제 서비스 운영
		// -> 모든 예외 상황에 맞게 대비
		// (코드 길이는 늘어나지만, UX증가)
		}
		
	}




















































