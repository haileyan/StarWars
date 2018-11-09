package com.biz.star;

public class Star08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNum();
		addNum(30);
	}
	
	public static void addNum() {
		System.out.println("매개 변수가 없는 method");
	
	}

	public static void addNum(int intNum) {
		if(intNum > 10) {
			System.out.println("10보다 큰 값의 매개변수");
		} else {
			System.out.println("10이하의 매개 변수");
	}
	}		
	
	public static void addNum (int intNum1, int intNum2) {
		System.out.println(intNum1 + intNum2);
	}
	
	/* method를 정의 할 때 같은 class 내부에서는
	 * 원칙적으로 변수와 같이 같은 이름의 method를 정의(선언) 할 수 없다.
	 * 
	 * 하지만 Java에서는 (Java만의 특징 중 1가지)
	 * 매개변수의 개수가 다르면 같은 이름의 method를 정의 할 수 있다.
	 * => '중복 정의(Overloading) 가능' 이라고 한다.
	 */
}
