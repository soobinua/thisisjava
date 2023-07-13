package thisisjava.ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y : " + y);

		// 두 변수의 값을 교환하는 방법
		// 두 변수의 값을 교환하기 위해 새로운 변수 temp 선언
		int temp = x; 	// 변수 temp에 변수 x 값을 대입
		x = y; 			// 변수 x에 변수 y 값을 대입
		y = temp; 		// 변수 y에 변수 temp 값을 대입
		System.out.println("x : " + x + ", y : " + y);
		
		// 변수는 또 다른 변수에 대입되어 메모리 간 값을 복사할 수 있다.
	}
}
