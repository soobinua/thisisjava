package thisisjava.ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		// 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생
		// 기본 타입 허용 범위 순 나열
		// byte < short, char < int < long < float < double

		byte byteValue = 10;
		int intValue = byteValue; // 자동 타입 변환됨
		System.out.println("intValue : " + intValue);

		// 자동 타입 변환 예외
		// char 타입보다 허용 범위가 작은 byte타입은 char타입으로 자동 변환 X
		// char charValue = byteValue; // 컴파일 에러
		// char 타입의 허용 범위는 음수를 포함하지 않는데 byte 타입은 음수 포함하기 때문

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	}
}
