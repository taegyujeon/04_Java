package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List list = new ArrayList[];
		
		List<IPInfo> ipInfoList = null;
		
		ipInfoList.add(new IPInfo("123.123.123.123","홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8","홍길순"));
		ipInfoList.add(new IPInfo("177.233.111.222","고길순"));
		
		System.out.print("ip 입력: ");
		String ip = sc.next();
		
		for(int i=0; i<ipInfoList.size(); i++) {
			if(ipInfoList.equals(i)) {
				System.out.println(ipInfoList.get(i));
				break;
			}
		}
		System.out.println("일치하는 ip 사용자가 없습니다.");
	}
}
