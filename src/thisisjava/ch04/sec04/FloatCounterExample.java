package thisisjava.ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		// for문 주의. 초기화식에서 부동 소수점 쓰는 float 타입 사용 X

		// 부동 소수점 방식의 float 타입은 연산 과정에서 정확히 0.1을 표현하지 못하므로
		// 증감식에서 x에 더해지는 실제 값은 0.1보다 약간 클 수도 있다.
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
}