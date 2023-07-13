package thisisjava.ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		// 비트 이동 연산자
		// 비트를 좌측 또는 우측으로 밀어서 이동(shift)시키는 연산
		// a << b 정수 a의 각 비트를 b만큼 왼쪽으로 이동. 오른쪽 빈자리는 0으로 채움. a x 2거듭제곱
		// a >> b 정수 a의 각 비트를 b만큼 오른쪽으로 이동. 왼쪽 빈자리는 최상위 부호 비트와 같은 값으로 채움. a / 2거듭제곱
		// a >>> b 정수 a의 각 비트를 b만큼 오른쪽으로 이동. 왼쪽 빈자리는 0으로 채움
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3); // 2의 3거듭제곱 연산하고 double 값 산출
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);

		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3); // int값으로 얻고 싶다면 (int)로 캐스팅해야 한다.
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
	}
}