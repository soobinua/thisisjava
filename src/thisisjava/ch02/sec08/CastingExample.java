package thisisjava.ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// 기본 타입 허용 범위 순 나열
		// byte < short, char < int < long < float < double
		// 강제 타입 변환
		// 큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입 변환될 수 없다.
		// 큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개어 저장하는 것을 강제 타입 변환
		// 캐스팅 연산자로 ()를 사용하며 괄호 안 타입으로는 작은 허용 범위 타입이 들어간다.

		int var1 = 10;
		byte var2 = (byte) var1; // 강제 타입 변환
		System.out.println(var2); // 강제 타입 변환 후에 10이 그대로 유지

		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4); // 강제 타입 변환 후에 300이 그대로 유지

		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6); // 'A'가 출력

		double var7 = 3.14;
		int var8 = (int) var7; // 정수 부분인 3만 저장
		System.out.println(var8); // 3이 출력
	}
}