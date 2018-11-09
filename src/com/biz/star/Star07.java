package com.biz.star;

public class Star07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 다음에 나열된 두 숫자의 덧셈, 곱셈을 계산하여
		 * 콘솔에 보여주는 코드를 작성하시오
		 * 
		 * 30,40
		 * 50,20
		 * 100,200
		 * 3,100
		 * 5,20
		 */
		
		System.out.printf("%d + %d = %d", 30, 40, 30+40);
		System.out.printf("%d * %d = %d", 30, 40, 30*40);
		
		calNumber(30,40);
		calNumber(50,20);
		calNumber(100,200);
		calNumber(3,100);
		calNumber(5,20);
		
		System.out.println();
	
		addNumber(30,40);
		addNumber(50,20);
		addNumber(100,200);
		addNumber(3,100);
		addNumber(5,20);
				
	}
		public static void calNumber(int intNum1, int intNum2) {
			System.out.print(intNum1);
			System.out.print(" x ");
			System.out.print(intNum2);
			System.out.print(" = ");
			System.out.println(intNum1 * intNum2);	
		}
		
		public static void addNumber(int intNum3, int intNum4) {
			System.out.print(intNum3);
			System.out.print(" + ");
			System.out.print(intNum4);
			System.out.print(" = ");
			System.out.println(intNum3 + intNum4);
		}
	}


