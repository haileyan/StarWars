package com.biz.star;

public class Star02 {

	public static void main(String[] args) {
		// TODO main이 시작되는 곳

		// TODO 사각형 별 찍기		
		for (int j = 0; j <5; j++) {
			for(int i = 0; i<5; i++) {
				System.out.print(i + " ");
		}
		System.out.println();
			
		}
		System.out.println("=======================");
		
		// TODO 역삼각형 숫자 찍기
		for (int j = 0; j <5; j++) {
			for(int i = j; i<5; i++) {
				System.out.print(i + " ");
		}
		System.out.println(); // 여기서 출력하고 나면 i 값은 사라진다.
							  // 
		System.out.println("=======================");
		// TODO 단일 for 사용한 예제
		for(int i = 0; i<5; i++) {
			System.out.print(i);
	
		}
		System.out.println();
		System.out.println("=======================");
		
		// JAVA DOC에 의한 주석 속의 keyword
		// 북마크 역할을 하는 주석
		// TODO 역삼각형 별찍기 
		for(int j2 = 0; j2 <5; j2++) {
			for(int i = j2; i<5; i++) {
				System.out.print("* ");
			}
		
			System.out.println();
		}
		System.out.println("=======================");
		// TODO 삼각형 별 찍기
		for(int j1=0; j1<5; j1++) {
			for (int i =0; i < j1; i++) {
				System.out.print("* ");
				
		}
			System.out.println();
	}
		}
		
}
	
}
