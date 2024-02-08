package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.JTGCalculator;
import edu.kh.poly.pack3.model.dto.Machine;

public class CalculatorRun {

	public static void main(String[] args) {
		
		// 인터페이스 장점:
		// 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에 
		// 코드 유지보수 시
		// 참조하는 객체만 변경하면 유지 보수가 완료된다!!!
		
		Calculator cal = new JTGCalculator();
		
		System.out.println(cal.plus(1, 2));
		System.out.println(cal.minus(1, 2));
		System.out.println(cal.multi(1, 2));
		System.out.println(cal.div(1, 2));
		System.out.println(cal.mod(1, 2));
		System.out.println("-------------------------");
		System.out.println("sum: " + cal.sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println("sum : " + cal.sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println("areaOfCircle : " + cal.areaOfCircle(5));
		System.out.println("rangeCheck : " + cal.rangeCheck(500));
		System.out.println("rangeCheck : " + cal.rangeCheck(200_000_000));
		System.out.println("pow : " + cal.pow(2,10)); // 1024
		System.out.println("2진수 : " + cal.toBinary(15)); // 1111
		System.out.println("16진수 : " + cal.toHexadecimal(15)); // f
		
		Machine machine = (Machine)cal;
		machine.powerOn();
		machine.powerOff();
		
		
	}
}
