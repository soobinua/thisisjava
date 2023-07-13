package thisisjava.ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		// 부동 소수점 방식을 사용하는 실수 타입에서 흔하게 발생
		double result = apple - number * pieceUnit; // result 변수의 값 정확히 0.3 되지 않는다.
		System.out.println("사과 1개에서 남은 양 : " + result);

		// 정확한 계산은 정수 연산으로 AccuracyExample2
	}
}