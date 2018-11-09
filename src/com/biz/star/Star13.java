package com.biz.star;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for(int i = 5; i < 100; i++) {
			triAngle(i);
		}
	}

	public static void triAngle(int intStarCount) {
	
		if(intStarCount > 10) {
			System.out.println("별은 10개까지만 찍을 수 있음");
			return; 	// method 내의 코드가 실행되는 동안
						// return 문을 만나면 그 자리에서 더 이상 진행되지 않고
						// method를 중단하고 호출 실행 한 곳으로 돌아간다.
			
		}
		
		for(int j = 0; j<intStarCount; j++) {
		// 빈칸을 몇 개 찍고
			for(int i = j; i<intStarCount; i++) {
				System.out.print("  ");
		}
		// 남은 부분에 별을 찍어라
			for(int k = 0; k < j; k++) {
				System.out.print("*   ");
		}
				System.out.println();
	
		}
		
}
	
	
	
}
